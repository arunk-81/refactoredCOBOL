package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsMiscStorage implements Comparable<WsMiscStorage> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField WSDATACHANGEDFLAG = factory.getStringField(1);
    private static final StringField WSRETURNMSG = factory.getStringField(75);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private char wsDatachangedFlag;
    private String wsReturnMsg = "";
    
    public WsMiscStorage() {
    }
    
    public WsMiscStorage(char wsDatachangedFlag, String wsReturnMsg) {
        this.wsDatachangedFlag = wsDatachangedFlag;
        this.wsReturnMsg = wsReturnMsg;
    }
    
    public WsMiscStorage(WsMiscStorage that) {
        this.wsDatachangedFlag = that.wsDatachangedFlag;
        this.wsReturnMsg = that.wsReturnMsg;
    }
    
    protected WsMiscStorage(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsMiscStorage(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsMiscStorage fromBytes(byte[] bytes, int offset) {
        return new WsMiscStorage(bytes, offset);
    }
    
    public static WsMiscStorage fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsMiscStorage fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public char getWsDatachangedFlag() {
        return this.wsDatachangedFlag;
    }
    
    public void setWsDatachangedFlag(char wsDatachangedFlag) {
        this.wsDatachangedFlag = wsDatachangedFlag;
    }
    
    public String getWsReturnMsg() {
        return this.wsReturnMsg;
    }
    
    public void setWsReturnMsg(String wsReturnMsg) {
        this.wsReturnMsg = wsReturnMsg;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsDatachangedFlag=\"");
        s.append(getWsDatachangedFlag());
        s.append("\" wsReturnMsg=\"");
        s.append(getWsReturnMsg());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsMiscStorage that) {
        return this.wsDatachangedFlag == that.wsDatachangedFlag &&
            this.wsReturnMsg.equals(that.wsReturnMsg);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsMiscStorage) && this.equals((WsMiscStorage)that);
    }
    
    @Override
    public int hashCode() {
        return Character.hashCode(wsDatachangedFlag) ^
            Integer.rotateLeft(wsReturnMsg.hashCode(), 1);
    }
    
    @Override
    public int compareTo(WsMiscStorage that) {
        int c = Character.compare(this.wsDatachangedFlag, that.wsDatachangedFlag);
        if ( c != 0 ) return c;
        c = this.wsReturnMsg.compareTo(that.wsReturnMsg);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSDATACHANGEDFLAG.putString(wsDatachangedFlag, bytes, offset);
        WSRETURNMSG.putString(wsReturnMsg, bytes, offset);
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
        wsDatachangedFlag = WSDATACHANGEDFLAG.getString(bytes, offset);
        wsReturnMsg = WSRETURNMSG.getString(bytes, offset);
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
