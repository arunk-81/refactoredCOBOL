package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsCurtimeHhMmSs implements Comparable<WsCurtimeHhMmSs> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField WSCURTIMEHH = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURTIMEMM = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURTIMESS = factory.getExternalDecimalAsIntField(2, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private int wsCurtimeHh;
    private int wsCurtimeMm;
    private int wsCurtimeSs;
    
    public WsCurtimeHhMmSs() {
    }
    
    public WsCurtimeHhMmSs(int wsCurtimeHh, int wsCurtimeMm, int wsCurtimeSs) {
        this.wsCurtimeHh = wsCurtimeHh;
        this.wsCurtimeMm = wsCurtimeMm;
        this.wsCurtimeSs = wsCurtimeSs;
    }
    
    public WsCurtimeHhMmSs(WsCurtimeHhMmSs that) {
        this.wsCurtimeHh = that.wsCurtimeHh;
        this.wsCurtimeMm = that.wsCurtimeMm;
        this.wsCurtimeSs = that.wsCurtimeSs;
    }
    
    protected WsCurtimeHhMmSs(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsCurtimeHhMmSs(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsCurtimeHhMmSs fromBytes(byte[] bytes, int offset) {
        return new WsCurtimeHhMmSs(bytes, offset);
    }
    
    public static WsCurtimeHhMmSs fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsCurtimeHhMmSs fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getWsCurtimeHh() {
        return this.wsCurtimeHh;
    }
    
    public void setWsCurtimeHh(int wsCurtimeHh) {
        this.wsCurtimeHh = wsCurtimeHh;
    }
    
    public int getWsCurtimeMm() {
        return this.wsCurtimeMm;
    }
    
    public void setWsCurtimeMm(int wsCurtimeMm) {
        this.wsCurtimeMm = wsCurtimeMm;
    }
    
    public int getWsCurtimeSs() {
        return this.wsCurtimeSs;
    }
    
    public void setWsCurtimeSs(int wsCurtimeSs) {
        this.wsCurtimeSs = wsCurtimeSs;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurtimeHh=\"");
        s.append(getWsCurtimeHh());
        s.append("\" wsCurtimeMm=\"");
        s.append(getWsCurtimeMm());
        s.append("\" wsCurtimeSs=\"");
        s.append(getWsCurtimeSs());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsCurtimeHhMmSs that) {
        return this.wsCurtimeHh == that.wsCurtimeHh &&
            this.wsCurtimeMm == that.wsCurtimeMm &&
            this.wsCurtimeSs == that.wsCurtimeSs;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsCurtimeHhMmSs) && this.equals((WsCurtimeHhMmSs)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(wsCurtimeHh) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeMm), 1) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeSs), 2);
    }
    
    @Override
    public int compareTo(WsCurtimeHhMmSs that) {
        int c = Integer.compare(this.wsCurtimeHh, that.wsCurtimeHh);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeMm, that.wsCurtimeMm);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeSs, that.wsCurtimeSs);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSCURTIMEHH.putInt(wsCurtimeHh, bytes, offset);
        WSCURTIMEMM.putInt(wsCurtimeMm, bytes, offset);
        WSCURTIMESS.putInt(wsCurtimeSs, bytes, offset);
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
        wsCurtimeHh = WSCURTIMEHH.getInt(bytes, offset);
        wsCurtimeMm = WSCURTIMEMM.getInt(bytes, offset);
        wsCurtimeSs = WSCURTIMESS.getInt(bytes, offset);
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
