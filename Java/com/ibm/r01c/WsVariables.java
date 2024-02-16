package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsVariables implements Comparable<WsVariables> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField WSPGMNAME = factory.getStringField(8);
    private static final StringField WSTRANID = factory.getStringField(4);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String wsPgmname = "COUSR01C";
    private String wsTranid = "CU01";
    
    public WsVariables() {
    }
    
    public WsVariables(String wsPgmname, String wsTranid) {
        this.wsPgmname = wsPgmname;
        this.wsTranid = wsTranid;
    }
    
    public WsVariables(WsVariables that) {
        this.wsPgmname = that.wsPgmname;
        this.wsTranid = that.wsTranid;
    }
    
    protected WsVariables(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsVariables(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsVariables fromBytes(byte[] bytes, int offset) {
        return new WsVariables(bytes, offset);
    }
    
    public static WsVariables fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsVariables fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getWsPgmname() {
        return this.wsPgmname;
    }
    
    public void setWsPgmname(String wsPgmname) {
        this.wsPgmname = wsPgmname;
    }
    
    public String getWsTranid() {
        return this.wsTranid;
    }
    
    public void setWsTranid(String wsTranid) {
        this.wsTranid = wsTranid;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsPgmname=\"");
        s.append(getWsPgmname());
        s.append("\" wsTranid=\"");
        s.append(getWsTranid());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsVariables that) {
        return this.wsPgmname.equals(that.wsPgmname) &&
            this.wsTranid.equals(that.wsTranid);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsVariables) && this.equals((WsVariables)that);
    }
    
    @Override
    public int hashCode() {
        return wsPgmname.hashCode() ^
            Integer.rotateLeft(wsTranid.hashCode(), 1);
    }
    
    @Override
    public int compareTo(WsVariables that) {
        int c = this.wsPgmname.compareTo(that.wsPgmname);
        if ( c != 0 ) return c;
        c = this.wsTranid.compareTo(that.wsTranid);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSPGMNAME.putString(wsPgmname, bytes, offset);
        WSTRANID.putString(wsTranid, bytes, offset);
        return bytes;
    }
    
    public final byte[] getBytes(byte[] bytes) {
        return getBytes(bytes, 0);
    }
    
    public final byte[] getBytes() {
        return getBytes(new byte[numBytes()]);
    }
    
    public final String toByteString() {
        try {
            return new String(getBytes(), factory.getStringEncoding());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        wsPgmname = WSPGMNAME.getString(bytes, offset);
        wsTranid = WSTRANID.getString(bytes, offset);
    }
    
    public final void setBytes(byte[] bytes) {
        setBytes(bytes, 0);
    }
    
    public final void setBytes(String bytes) {
        try {
            setBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int numBytes() {
        return SIZE;
    }
}
