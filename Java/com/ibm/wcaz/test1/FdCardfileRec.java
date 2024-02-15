package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FdCardfileRec implements Comparable<FdCardfileRec> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField FDCARDNUM = factory.getStringField(16);
    private static final StringField FDCARDDATA = factory.getStringField(134);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String fdCardNum = "";
    private String fdCardData = "";
    
    public FdCardfileRec() {
    }
    
    public FdCardfileRec(String fdCardNum, String fdCardData) {
        this.fdCardNum = fdCardNum;
        this.fdCardData = fdCardData;
    }
    
    public FdCardfileRec(FdCardfileRec that) {
        this.fdCardNum = that.fdCardNum;
        this.fdCardData = that.fdCardData;
    }
    
    protected FdCardfileRec(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected FdCardfileRec(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static FdCardfileRec fromBytes(byte[] bytes, int offset) {
        return new FdCardfileRec(bytes, offset);
    }
    
    public static FdCardfileRec fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static FdCardfileRec fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getFdCardNum() {
        return this.fdCardNum;
    }
    
    public void setFdCardNum(String fdCardNum) {
        this.fdCardNum = fdCardNum;
    }
    
    public String getFdCardData() {
        return this.fdCardData;
    }
    
    public void setFdCardData(String fdCardData) {
        this.fdCardData = fdCardData;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ fdCardNum=\"");
        s.append(getFdCardNum());
        s.append("\" fdCardData=\"");
        s.append(getFdCardData());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(FdCardfileRec that) {
        return this.fdCardNum.equals(that.fdCardNum) &&
            this.fdCardData.equals(that.fdCardData);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof FdCardfileRec) && this.equals((FdCardfileRec)that);
    }
    
    @Override
    public int hashCode() {
        return fdCardNum.hashCode() ^
            Integer.rotateLeft(fdCardData.hashCode(), 1);
    }
    
    @Override
    public int compareTo(FdCardfileRec that) {
        int c = this.fdCardNum.compareTo(that.fdCardNum);
        if ( c != 0 ) return c;
        c = this.fdCardData.compareTo(that.fdCardData);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        FDCARDNUM.putString(fdCardNum, bytes, offset);
        FDCARDDATA.putString(fdCardData, bytes, offset);
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
        fdCardNum = FDCARDNUM.getString(bytes, offset);
        fdCardData = FDCARDDATA.getString(bytes, offset);
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
