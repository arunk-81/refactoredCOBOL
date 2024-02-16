package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsCurdateMmDdYy implements Comparable<WsCurdateMmDdYy> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField WSCURDATEMM = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURDATEDD = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURDATEYY = factory.getExternalDecimalAsIntField(2, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private int wsCurdateMm;
    private int wsCurdateDd;
    private int wsCurdateYy;
    
    public WsCurdateMmDdYy() {
    }
    
    public WsCurdateMmDdYy(int wsCurdateMm, int wsCurdateDd, int wsCurdateYy) {
        this.wsCurdateMm = wsCurdateMm;
        this.wsCurdateDd = wsCurdateDd;
        this.wsCurdateYy = wsCurdateYy;
    }
    
    public WsCurdateMmDdYy(WsCurdateMmDdYy that) {
        this.wsCurdateMm = that.wsCurdateMm;
        this.wsCurdateDd = that.wsCurdateDd;
        this.wsCurdateYy = that.wsCurdateYy;
    }
    
    protected WsCurdateMmDdYy(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsCurdateMmDdYy(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsCurdateMmDdYy fromBytes(byte[] bytes, int offset) {
        return new WsCurdateMmDdYy(bytes, offset);
    }
    
    public static WsCurdateMmDdYy fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsCurdateMmDdYy fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getWsCurdateMm() {
        return this.wsCurdateMm;
    }
    
    public void setWsCurdateMm(int wsCurdateMm) {
        this.wsCurdateMm = wsCurdateMm;
    }
    
    public int getWsCurdateDd() {
        return this.wsCurdateDd;
    }
    
    public void setWsCurdateDd(int wsCurdateDd) {
        this.wsCurdateDd = wsCurdateDd;
    }
    
    public int getWsCurdateYy() {
        return this.wsCurdateYy;
    }
    
    public void setWsCurdateYy(int wsCurdateYy) {
        this.wsCurdateYy = wsCurdateYy;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurdateMm=\"");
        s.append(getWsCurdateMm());
        s.append("\" wsCurdateDd=\"");
        s.append(getWsCurdateDd());
        s.append("\" wsCurdateYy=\"");
        s.append(getWsCurdateYy());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsCurdateMmDdYy that) {
        return this.wsCurdateMm == that.wsCurdateMm &&
            this.wsCurdateDd == that.wsCurdateDd &&
            this.wsCurdateYy == that.wsCurdateYy;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsCurdateMmDdYy) && this.equals((WsCurdateMmDdYy)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(wsCurdateMm) ^
            Integer.rotateLeft(Integer.hashCode(wsCurdateDd), 1) ^
            Integer.rotateLeft(Integer.hashCode(wsCurdateYy), 2);
    }
    
    @Override
    public int compareTo(WsCurdateMmDdYy that) {
        int c = Integer.compare(this.wsCurdateMm, that.wsCurdateMm);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurdateDd, that.wsCurdateDd);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurdateYy, that.wsCurdateYy);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSCURDATEMM.putInt(wsCurdateMm, bytes, offset);
        WSCURDATEDD.putInt(wsCurdateDd, bytes, offset);
        WSCURDATEYY.putInt(wsCurdateYy, bytes, offset);
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
        wsCurdateMm = WSCURDATEMM.getInt(bytes, offset);
        wsCurdateDd = WSCURDATEDD.getInt(bytes, offset);
        wsCurdateYy = WSCURDATEYY.getInt(bytes, offset);
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
