package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class COACTUPC implements Comparable<COACTUPC> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    public COACTUPC() {
    }
    
    public COACTUPC(COACTUPC that) {
    }
    
    protected COACTUPC(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected COACTUPC(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static COACTUPC fromBytes(byte[] bytes, int offset) {
        return new COACTUPC(bytes, offset);
    }
    
    public static COACTUPC fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static COACTUPC fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void compareOldNewExit1205(String[] args) {}
    
    public static void main(String[] args) {}
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(COACTUPC that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof COACTUPC) && this.equals((COACTUPC)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(COACTUPC that) {
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
