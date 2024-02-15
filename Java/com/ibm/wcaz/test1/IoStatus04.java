package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IoStatus04 implements Comparable<IoStatus04> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField IOSTATUS0401 = factory.getExternalDecimalAsIntField(1, true);
    private static final ExternalDecimalAsIntField IOSTATUS0403 = factory.getExternalDecimalAsIntField(3, true);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private int ioStatus0401 = 0;
    private int ioStatus0403 = 0;
    
    public IoStatus04() {
    }
    
    public IoStatus04(int ioStatus0401, int ioStatus0403) {
        this.ioStatus0401 = ioStatus0401;
        this.ioStatus0403 = ioStatus0403;
    }
    
    public IoStatus04(IoStatus04 that) {
        this.ioStatus0401 = that.ioStatus0401;
        this.ioStatus0403 = that.ioStatus0403;
    }
    
    protected IoStatus04(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected IoStatus04(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static IoStatus04 fromBytes(byte[] bytes, int offset) {
        return new IoStatus04(bytes, offset);
    }
    
    public static IoStatus04 fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static IoStatus04 fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getIoStatus0401() {
        return this.ioStatus0401;
    }
    
    public void setIoStatus0401(int ioStatus0401) {
        this.ioStatus0401 = ioStatus0401;
    }
    
    public int getIoStatus0403() {
        return this.ioStatus0403;
    }
    
    public void setIoStatus0403(int ioStatus0403) {
        this.ioStatus0403 = ioStatus0403;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ ioStatus0401=\"");
        s.append(getIoStatus0401());
        s.append("\" ioStatus0403=\"");
        s.append(getIoStatus0403());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(IoStatus04 that) {
        return this.ioStatus0401 == that.ioStatus0401 &&
            this.ioStatus0403 == that.ioStatus0403;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof IoStatus04) && this.equals((IoStatus04)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(ioStatus0401) ^
            Integer.rotateLeft(Integer.hashCode(ioStatus0403), 1);
    }
    
    @Override
    public int compareTo(IoStatus04 that) {
        int c = Integer.compare(this.ioStatus0401, that.ioStatus0401);
        if ( c != 0 ) return c;
        c = Integer.compare(this.ioStatus0403, that.ioStatus0403);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        IOSTATUS0401.putInt(ioStatus0401, bytes, offset);
        IOSTATUS0403.putInt(ioStatus0403, bytes, offset);
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
        ioStatus0401 = IOSTATUS0401.getInt(bytes, offset);
        ioStatus0403 = IOSTATUS0403.getInt(bytes, offset);
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
