package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class CBACT02C implements Comparable<CBACT02C> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    public CBACT02C() {
    }
    
    public CBACT02C(CBACT02C that) {
    }
    
    protected CBACT02C(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CBACT02C(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CBACT02C fromBytes(byte[] bytes, int offset) {
        return new CBACT02C(bytes, offset);
    }
    
    public static CBACT02C fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CBACT02C fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {}
    
    public static void cardfileClose9000(String[] args) {}
    
    public static void cardfileOpen0000(String[] args) {}
    
    public static void cardfileGetNext1000(CardRecord cardRecord, char endOfFile) {}
    
    public static void abendProgram9999(String[] args) {}
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CBACT02C that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CBACT02C) && this.equals((CBACT02C)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(CBACT02C that) {
        int c = 0;
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
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
