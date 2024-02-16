package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsDateTime implements Comparable<WsDateTime> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField WSCURDATEDATA = factory.getByteArrayField(WsCurdateData.SIZE);
    private static final ByteArrayField WSCURDATEMMDDYY = factory.getByteArrayField(WsCurdateMmDdYy.SIZE);
    private static final ByteArrayField WSCURTIMEHHMMSS = factory.getByteArrayField(WsCurtimeHhMmSs.SIZE);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private WsCurdateData wsCurdateData = new WsCurdateData();
    private WsCurdateMmDdYy wsCurdateMmDdYy = new WsCurdateMmDdYy();
    private WsCurtimeHhMmSs wsCurtimeHhMmSs = new WsCurtimeHhMmSs();
    
    public WsDateTime() {
    }
    
    public WsDateTime(WsCurdateData wsCurdateData, WsCurdateMmDdYy wsCurdateMmDdYy, WsCurtimeHhMmSs wsCurtimeHhMmSs) {
        this.wsCurdateData = wsCurdateData;
        this.wsCurdateMmDdYy = wsCurdateMmDdYy;
        this.wsCurtimeHhMmSs = wsCurtimeHhMmSs;
    }
    
    public WsDateTime(WsDateTime that) {
        this.wsCurdateData = new WsCurdateData(that.wsCurdateData);
        this.wsCurdateMmDdYy = new WsCurdateMmDdYy(that.wsCurdateMmDdYy);
        this.wsCurtimeHhMmSs = new WsCurtimeHhMmSs(that.wsCurtimeHhMmSs);
    }
    
    protected WsDateTime(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsDateTime(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsDateTime fromBytes(byte[] bytes, int offset) {
        return new WsDateTime(bytes, offset);
    }
    
    public static WsDateTime fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsDateTime fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public WsCurdateData getWsCurdateData() {
        return this.wsCurdateData;
    }
    
    public void setWsCurdateData(WsCurdateData wsCurdateData) {
        this.wsCurdateData = wsCurdateData;
    }
    
    public WsCurdateMmDdYy getWsCurdateMmDdYy() {
        return this.wsCurdateMmDdYy;
    }
    
    public void setWsCurdateMmDdYy(WsCurdateMmDdYy wsCurdateMmDdYy) {
        this.wsCurdateMmDdYy = wsCurdateMmDdYy;
    }
    
    public WsCurtimeHhMmSs getWsCurtimeHhMmSs() {
        return this.wsCurtimeHhMmSs;
    }
    
    public void setWsCurtimeHhMmSs(WsCurtimeHhMmSs wsCurtimeHhMmSs) {
        this.wsCurtimeHhMmSs = wsCurtimeHhMmSs;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ wsCurdateData=\"");
        s.append(getWsCurdateData());
        s.append("\" wsCurdateMmDdYy=\"");
        s.append(getWsCurdateMmDdYy());
        s.append("\" wsCurtimeHhMmSs=\"");
        s.append(getWsCurtimeHhMmSs());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsDateTime that) {
        return this.wsCurdateData.equals(that.wsCurdateData) &&
            this.wsCurdateMmDdYy.equals(that.wsCurdateMmDdYy) &&
            this.wsCurtimeHhMmSs.equals(that.wsCurtimeHhMmSs);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsDateTime) && this.equals((WsDateTime)that);
    }
    
    @Override
    public int hashCode() {
        return wsCurdateData.hashCode() ^
            Integer.rotateLeft(wsCurdateMmDdYy.hashCode(), 1) ^
            Integer.rotateLeft(wsCurtimeHhMmSs.hashCode(), 2);
    }
    
    @Override
    public int compareTo(WsDateTime that) {
        int c = this.wsCurdateData.compareTo(that.wsCurdateData);
        if ( c != 0 ) return c;
        c = this.wsCurdateMmDdYy.compareTo(that.wsCurdateMmDdYy);
        if ( c != 0 ) return c;
        c = this.wsCurtimeHhMmSs.compareTo(that.wsCurtimeHhMmSs);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        wsCurdateData.getBytes(bytes, WSCURDATEDATA.getOffset() + offset);
        wsCurdateMmDdYy.getBytes(bytes, WSCURDATEMMDDYY.getOffset() + offset);
        wsCurtimeHhMmSs.getBytes(bytes, WSCURTIMEHHMMSS.getOffset() + offset);
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
        wsCurdateData.setBytes(bytes, WSCURDATEDATA.getOffset() + offset);
        wsCurdateMmDdYy.setBytes(bytes, WSCURDATEMMDDYY.getOffset() + offset);
        wsCurtimeHhMmSs.setBytes(bytes, WSCURTIMEHHMMSS.getOffset() + offset);
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
