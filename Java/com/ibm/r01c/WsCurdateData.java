package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsCurdateData implements Comparable<WsCurdateData> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField WSCURDATE = factory.getByteArrayField(WsCurdate.SIZE);
    private static final ExternalDecimalAsIntField WSCURDATEN = factory.getExternalDecimalAsIntField(8, true);
    private static final ByteArrayField WSCURTIME = factory.getByteArrayField(WsCurtime.SIZE);
    private static final ExternalDecimalAsIntField WSCURTIMEN = factory.getExternalDecimalAsIntField(8, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private WsCurdate wsCurdate = new WsCurdate();
    private int wsCurdateN;
    private WsCurtime wsCurtime = new WsCurtime();
    private int wsCurtimeN;
    
    public WsCurdateData() {
    }
    
    public WsCurdateData(WsCurdate wsCurdate, int wsCurdateN, WsCurtime wsCurtime, int wsCurtimeN) {
        this.wsCurdate = wsCurdate;
        this.wsCurdateN = wsCurdateN;
        this.wsCurtime = wsCurtime;
        this.wsCurtimeN = wsCurtimeN;
    }
    
    public WsCurdateData(WsCurdateData that) {
        this.wsCurdate = new WsCurdate(that.wsCurdate);
        this.wsCurdateN = that.wsCurdateN;
        this.wsCurtime = new WsCurtime(that.wsCurtime);
        this.wsCurtimeN = that.wsCurtimeN;
    }
    
    protected WsCurdateData(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsCurdateData(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsCurdateData fromBytes(byte[] bytes, int offset) {
        return new WsCurdateData(bytes, offset);
    }
    
    public static WsCurdateData fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsCurdateData fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public WsCurdate getWsCurdate() {
        return this.wsCurdate;
    }
    
    public void setWsCurdate(WsCurdate wsCurdate) {
        this.wsCurdate = wsCurdate;
    }
    
    public int getWsCurdateN() {
        return this.wsCurdateN;
    }
    
    public void setWsCurdateN(int wsCurdateN) {
        this.wsCurdateN = wsCurdateN;
    }
    
    public WsCurtime getWsCurtime() {
        return this.wsCurtime;
    }
    
    public void setWsCurtime(WsCurtime wsCurtime) {
        this.wsCurtime = wsCurtime;
    }
    
    public int getWsCurtimeN() {
        return this.wsCurtimeN;
    }
    
    public void setWsCurtimeN(int wsCurtimeN) {
        this.wsCurtimeN = wsCurtimeN;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurdate=\"");
        s.append(getWsCurdate());
        s.append("\" wsCurdateN=\"");
        s.append(getWsCurdateN());
        s.append("\" wsCurtime=\"");
        s.append(getWsCurtime());
        s.append("\" wsCurtimeN=\"");
        s.append(getWsCurtimeN());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsCurdateData that) {
        return this.wsCurdate.equals(that.wsCurdate) &&
            this.wsCurdateN == that.wsCurdateN &&
            this.wsCurtime.equals(that.wsCurtime) &&
            this.wsCurtimeN == that.wsCurtimeN;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsCurdateData) && this.equals((WsCurdateData)that);
    }
    
    @Override
    public int hashCode() {
        return wsCurdate.hashCode() ^
            Integer.rotateLeft(Integer.hashCode(wsCurdateN), 1) ^
            Integer.rotateLeft(wsCurtime.hashCode(), 2) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeN), 3);
    }
    
    @Override
    public int compareTo(WsCurdateData that) {
        int c = this.wsCurdate.compareTo(that.wsCurdate);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurdateN, that.wsCurdateN);
        if ( c != 0 ) return c;
        c = this.wsCurtime.compareTo(that.wsCurtime);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeN, that.wsCurtimeN);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        wsCurdate.getBytes(bytes, WSCURDATE.getOffset() + offset);
        WSCURDATEN.putInt(wsCurdateN, bytes, offset);
        wsCurtime.getBytes(bytes, WSCURTIME.getOffset() + offset);
        WSCURTIMEN.putInt(wsCurtimeN, bytes, offset);
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
        wsCurdate.setBytes(bytes, WSCURDATE.getOffset() + offset);
        wsCurdateN = WSCURDATEN.getInt(bytes, offset);
        wsCurtime.setBytes(bytes, WSCURTIME.getOffset() + offset);
        wsCurtimeN = WSCURTIMEN.getInt(bytes, offset);
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
