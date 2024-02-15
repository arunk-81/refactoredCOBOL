package com.ibm.wc4az.test;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FdAcctfileRec implements Comparable<FdAcctfileRec> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsLongField FDACCTID = factory.getExternalDecimalAsLongField(11, true);
    private static final StringField FDACCTDATA = factory.getStringField(289);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private long fdAcctId;
    private String fdAcctData = "";
    
    public FdAcctfileRec() {
    }
    
    public FdAcctfileRec(long fdAcctId, String fdAcctData) {
        this.fdAcctId = fdAcctId;
        this.fdAcctData = fdAcctData;
    }
    
    public FdAcctfileRec(FdAcctfileRec that) {
        this.fdAcctId = that.fdAcctId;
        this.fdAcctData = that.fdAcctData;
    }
    
    protected FdAcctfileRec(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected FdAcctfileRec(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static FdAcctfileRec fromBytes(byte[] bytes, int offset) {
        return new FdAcctfileRec(bytes, offset);
    }
    
    public static FdAcctfileRec fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static FdAcctfileRec fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public long getFdAcctId() {
        return this.fdAcctId;
    }
    
    public void setFdAcctId(long fdAcctId) {
        this.fdAcctId = fdAcctId;
    }
    
    public String getFdAcctData() {
        return this.fdAcctData;
    }
    
    public void setFdAcctData(String fdAcctData) {
        this.fdAcctData = fdAcctData;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ fdAcctId=\"");
        s.append(getFdAcctId());
        s.append("\" fdAcctData=\"");
        s.append(getFdAcctData());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(FdAcctfileRec that) {
        return this.fdAcctId == that.fdAcctId &&
            this.fdAcctData.equals(that.fdAcctData);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof FdAcctfileRec) && this.equals((FdAcctfileRec)that);
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(fdAcctId) ^
            Integer.rotateLeft(fdAcctData.hashCode(), 1);
    }
    
    @Override
    public int compareTo(FdAcctfileRec that) {
        int c = Long.compare(this.fdAcctId, that.fdAcctId);
        if ( c != 0 ) return c;
        c = this.fdAcctData.compareTo(that.fdAcctData);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        FDACCTID.putLong(fdAcctId, bytes, offset);
        FDACCTDATA.putString(fdAcctData, bytes, offset);
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
        fdAcctId = FDACCTID.getLong(bytes, offset);
        fdAcctData = FDACCTDATA.getString(bytes, offset);
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
