package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class IoStatus implements Comparable<IoStatus> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField IOSTAT1 = factory.getStringField(1);
    private static final StringField IOSTAT2 = factory.getStringField(1);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private char ioStat1;
    private char ioStat2;
    
    public IoStatus() {
    }
    
    public IoStatus(char ioStat1, char ioStat2) {
        this.ioStat1 = ioStat1;
        this.ioStat2 = ioStat2;
    }
    
    public IoStatus(IoStatus that) {
        this.ioStat1 = that.ioStat1;
        this.ioStat2 = that.ioStat2;
    }
    
    protected IoStatus(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected IoStatus(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static IoStatus fromBytes(byte[] bytes, int offset) {
        return new IoStatus(bytes, offset);
    }
    
    public static IoStatus fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static IoStatus fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void displayIoStatus9910(String[] args) {}
    
    public char getIoStat1() {
        return this.ioStat1;
    }
    
    public void setIoStat1(char ioStat1) {
        this.ioStat1 = ioStat1;
    }
    
    public char getIoStat2() {
        return this.ioStat2;
    }
    
    public void setIoStat2(char ioStat2) {
        this.ioStat2 = ioStat2;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ ioStat1=\"");
        s.append(getIoStat1());
        s.append("\" ioStat2=\"");
        s.append(getIoStat2());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(IoStatus that) {
        return this.ioStat1 == that.ioStat1 &&
            this.ioStat2 == that.ioStat2;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof IoStatus) && this.equals((IoStatus)that);
    }
    
    @Override
    public int hashCode() {
        return Character.hashCode(ioStat1) ^
            Integer.rotateLeft(Character.hashCode(ioStat2), 1);
    }
    
    @Override
    public int compareTo(IoStatus that) {
        int c = Character.compare(this.ioStat1, that.ioStat1);
        if ( c != 0 ) return c;
        c = Character.compare(this.ioStat2, that.ioStat2);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        IOSTAT1.putString(ioStat1, bytes, offset);
        IOSTAT2.putString(ioStat2, bytes, offset);
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
        ioStat1 = IOSTAT1.getString(bytes, offset);
        ioStat2 = IOSTAT2.getString(bytes, offset);
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
