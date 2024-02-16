package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsCurtime implements Comparable<WsCurtime> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField WSCURTIMEHOURS = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURTIMEMINUTE = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURTIMESECOND = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField WSCURTIMEMILSEC = factory.getExternalDecimalAsIntField(2, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private int wsCurtimeHours;
    private int wsCurtimeMinute;
    private int wsCurtimeSecond;
    private int wsCurtimeMilsec;
    
    public WsCurtime() {
    }
    
    public WsCurtime(int wsCurtimeHours, int wsCurtimeMinute, int wsCurtimeSecond, int wsCurtimeMilsec) {
        this.wsCurtimeHours = wsCurtimeHours;
        this.wsCurtimeMinute = wsCurtimeMinute;
        this.wsCurtimeSecond = wsCurtimeSecond;
        this.wsCurtimeMilsec = wsCurtimeMilsec;
    }
    
    public WsCurtime(WsCurtime that) {
        this.wsCurtimeHours = that.wsCurtimeHours;
        this.wsCurtimeMinute = that.wsCurtimeMinute;
        this.wsCurtimeSecond = that.wsCurtimeSecond;
        this.wsCurtimeMilsec = that.wsCurtimeMilsec;
    }
    
    protected WsCurtime(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsCurtime(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsCurtime fromBytes(byte[] bytes, int offset) {
        return new WsCurtime(bytes, offset);
    }
    
    public static WsCurtime fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsCurtime fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getWsCurtimeHours() {
        return this.wsCurtimeHours;
    }
    
    public void setWsCurtimeHours(int wsCurtimeHours) {
        this.wsCurtimeHours = wsCurtimeHours;
    }
    
    public int getWsCurtimeMinute() {
        return this.wsCurtimeMinute;
    }
    
    public void setWsCurtimeMinute(int wsCurtimeMinute) {
        this.wsCurtimeMinute = wsCurtimeMinute;
    }
    
    public int getWsCurtimeSecond() {
        return this.wsCurtimeSecond;
    }
    
    public void setWsCurtimeSecond(int wsCurtimeSecond) {
        this.wsCurtimeSecond = wsCurtimeSecond;
    }
    
    public int getWsCurtimeMilsec() {
        return this.wsCurtimeMilsec;
    }
    
    public void setWsCurtimeMilsec(int wsCurtimeMilsec) {
        this.wsCurtimeMilsec = wsCurtimeMilsec;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurtimeHours=\"");
        s.append(getWsCurtimeHours());
        s.append("\" wsCurtimeMinute=\"");
        s.append(getWsCurtimeMinute());
        s.append("\" wsCurtimeSecond=\"");
        s.append(getWsCurtimeSecond());
        s.append("\" wsCurtimeMilsec=\"");
        s.append(getWsCurtimeMilsec());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsCurtime that) {
        return this.wsCurtimeHours == that.wsCurtimeHours &&
            this.wsCurtimeMinute == that.wsCurtimeMinute &&
            this.wsCurtimeSecond == that.wsCurtimeSecond &&
            this.wsCurtimeMilsec == that.wsCurtimeMilsec;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsCurtime) && this.equals((WsCurtime)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(wsCurtimeHours) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeMinute), 1) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeSecond), 2) ^
            Integer.rotateLeft(Integer.hashCode(wsCurtimeMilsec), 3);
    }
    
    @Override
    public int compareTo(WsCurtime that) {
        int c = Integer.compare(this.wsCurtimeHours, that.wsCurtimeHours);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeMinute, that.wsCurtimeMinute);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeSecond, that.wsCurtimeSecond);
        if ( c != 0 ) return c;
        c = Integer.compare(this.wsCurtimeMilsec, that.wsCurtimeMilsec);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        WSCURTIMEHOURS.putInt(wsCurtimeHours, bytes, offset);
        WSCURTIMEMINUTE.putInt(wsCurtimeMinute, bytes, offset);
        WSCURTIMESECOND.putInt(wsCurtimeSecond, bytes, offset);
        WSCURTIMEMILSEC.putInt(wsCurtimeMilsec, bytes, offset);
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
        wsCurtimeHours = WSCURTIMEHOURS.getInt(bytes, offset);
        wsCurtimeMinute = WSCURTIMEMINUTE.getInt(bytes, offset);
        wsCurtimeSecond = WSCURTIMESECOND.getInt(bytes, offset);
        wsCurtimeMilsec = WSCURTIMEMILSEC.getInt(bytes, offset);
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
