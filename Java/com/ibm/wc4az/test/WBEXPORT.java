package com.ibm.wc4az.test;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class WBEXPORT implements Comparable<WBEXPORT> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    public WBEXPORT() {
    }
    
    public WBEXPORT(WBEXPORT that) {
    }
    
    protected WBEXPORT(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WBEXPORT(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WBEXPORT fromBytes(byte[] bytes, int offset) {
        return new WBEXPORT(bytes, offset);
    }
    
    public static WBEXPORT fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WBEXPORT fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args){
    AccountRecord accountRecord = new AccountRecord();
    FdAcctfileRec fdAcctfileRec = new FdAcctfileRec();

    try {
        accountRecord = fdAcctfileRec.readNext();
        if (accountRecord != null) {
            applResult = 0;
            displayAcctRecord(accountRecord);
        } else {
            if (fdAcctfileRec.getStatus().equals("10")) {
                applResult = 16;
            } else {
                applResult = 12;
            }
        }
        if (applResult == 0) {
            continue;
        } else {
            if (applResult == 16) {
                endOfFile = 'Y';
            } else {
                System.out.println("ERROR READING ACCOUNT FILE");
                ioStatus = fdAcctfileRec.getStatus();
                displayIoStatus();
                abendProgram();
            }
        }
    } catch (CobolFileInputOutputException e) {
        e.printStackTrace();
    }
}

    
    public static void abendProgram9999(String[] args) {}
    
    public static void displayIoStatus9910(String[] args) {}
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WBEXPORT that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WBEXPORT) && this.equals((WBEXPORT)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(WBEXPORT that) {
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
