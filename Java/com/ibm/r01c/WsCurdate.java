package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsCurdate implements Comparable<WsCurdate> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField WSCURDATEYEAR = factory.getExternalDecimalAsIntField(4, true);
    private static final ExternalDecimalAsIntField WSCURDATEMONTH = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURDATEDAY = factory.getExternalDecimalAsIntField(2, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private int wsCurdateYear;
    private int wsCurdateMonth;
    private int wsCurdateDay;
    
    public WsCurdate() {
    }
    
    public WsCurdate(int wsCurdateYear, int wsCurdateMonth, int wsCurdateDay) {
        this.wsCurdateYear = wsCurdateYear;
        this.wsCurdateMonth = wsCurdateMonth;
        this.wsCurdateDay = wsCurdateDay;
    }
    
    public WsCurdate(WsCurdate that) {
        this.wsCurdateYear = that.wsCurdateYear;
        this.wsCurdateMonth = that.wsCurdateMonth;
        this.wsCurdateDay = that.wsCurdateDay;
    }
    
    protected WsCurdate(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsCurdate(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsCurdate fromBytes(byte[] bytes, int offset) {
        return new WsCurdate(bytes, offset);
    }
    
    public static WsCurdate fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsCurdate fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getWsCurdateYear() {
        return this.wsCurdateYear;
    }
    
    public void setWsCurdateYear(int wsCurdateYear) {
        this.wsCurdateYear = wsCurdateYear;
    }
    
    public int getWsCurdateMonth() {
        return this.wsCurdateMonth;
    }
    
    public void setWsCurdateMonth(int wsCurdateMonth) {
        this.wsCurdateMonth = wsCurdateMonth;
    }
    
    public int getWsCurdateDay() {
        return this.wsCurdateDay;
    }
    
    public void setWsCurdateDay(int wsCurdateDay) {
        this.wsCurdateDay = wsCurdateDay;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurdateYear=\"");
        s.append(getWsCurdateYear());
        s.append("\" wsCurdateMonth=\"");
        s.append(getWsCurdateMonth());
        s.append("\" wsCurdateDay=\"");
        s.append(getWsCurdateDay());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsCurdate that) {
        return this.wsCurdateYear == that.wsCurdateYear &&
            this.wsCurdateMonth == that.wsCurdateMonth &&
            this.wsCurdateDay == that.wsCurdateDay;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsCurdate) && this.equals((WsCurdate)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(wsCurdateYear) ^
            Integer.rotateLeft(Integer.hashCode(wsCurdateMonth), 1) ^
            Integer.rotateLeft(Integer.hashCode(wsCurdateDay), 2);
    }
    
    @Override
    public int compareTo(WsCurdate that) {
        int c = Integer.compare(this.wsCurdateYear, that.wsCurdateYear);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurdateMonth, that.wsCurdateMonth);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurdateDay, that.wsCurdateDay);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSCURDATEYEAR.putInt(wsCurdateYear, bytes, offset);
        WSCURDATEMONTH.putInt(wsCurdateMonth, bytes, offset);
        WSCURDATEDAY.putInt(wsCurdateDay, bytes, offset);
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
        wsCurdateYear = WSCURDATEYEAR.getInt(bytes, offset);
        wsCurdateMonth = WSCURDATEMONTH.getInt(bytes, offset);
        wsCurdateDay = WSCURDATEDAY.getInt(bytes, offset);
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
