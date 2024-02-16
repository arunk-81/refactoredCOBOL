package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CcdaScreenTitle implements Comparable<CcdaScreenTitle> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CCDATITLE01 = factory.getStringField(40);
    private static final StringField CCDATITLE02 = factory.getStringField(40);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String ccdaTitle01 = "      AWS Mainframe Modernization       ";
    private String ccdaTitle02 = "              CardDemo                  ";
    
    public CcdaScreenTitle() {
    }
    
    public CcdaScreenTitle(String ccdaTitle01, String ccdaTitle02) {
        this.ccdaTitle01 = ccdaTitle01;
        this.ccdaTitle02 = ccdaTitle02;
    }
    
    public CcdaScreenTitle(CcdaScreenTitle that) {
        this.ccdaTitle01 = that.ccdaTitle01;
        this.ccdaTitle02 = that.ccdaTitle02;
    }
    
    protected CcdaScreenTitle(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CcdaScreenTitle(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CcdaScreenTitle fromBytes(byte[] bytes, int offset) {
        return new CcdaScreenTitle(bytes, offset);
    }
    
    public static CcdaScreenTitle fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CcdaScreenTitle fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCcdaTitle01() {
        return this.ccdaTitle01;
    }
    
    public void setCcdaTitle01(String ccdaTitle01) {
        this.ccdaTitle01 = ccdaTitle01;
    }
    
    public String getCcdaTitle02() {
        return this.ccdaTitle02;
    }
    
    public void setCcdaTitle02(String ccdaTitle02) {
        this.ccdaTitle02 = ccdaTitle02;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ ccdaTitle01=\"");
        s.append(getCcdaTitle01());
        s.append("\" ccdaTitle02=\"");
        s.append(getCcdaTitle02());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CcdaScreenTitle that) {
        return this.ccdaTitle01.equals(that.ccdaTitle01) &&
            this.ccdaTitle02.equals(that.ccdaTitle02);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CcdaScreenTitle) && this.equals((CcdaScreenTitle)that);
    }
    
    @Override
    public int hashCode() {
        return ccdaTitle01.hashCode() ^
            Integer.rotateLeft(ccdaTitle02.hashCode(), 1);
    }
    
    @Override
    public int compareTo(CcdaScreenTitle that) {
        int c = this.ccdaTitle01.compareTo(that.ccdaTitle01);
        if ( c != 0 ) return c;
        c = this.ccdaTitle02.compareTo(that.ccdaTitle02);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CCDATITLE01.putString(ccdaTitle01, bytes, offset);
        CCDATITLE02.putString(ccdaTitle02, bytes, offset);
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
        ccdaTitle01 = CCDATITLE01.getString(bytes, offset);
        ccdaTitle02 = CCDATITLE02.getString(bytes, offset);
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
