package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupOldDetails implements Comparable<AcupOldDetails> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField ACUPOLDCUSTDATA = factory.getByteArrayField(AcupOldCustData.SIZE);
    private static final ByteArrayField ACUPOLDACCTDATA = factory.getByteArrayField(AcupOldAcctData.SIZE);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private AcupOldCustData acupOldCustData = new AcupOldCustData();
    private AcupOldAcctData acupOldAcctData = new AcupOldAcctData();
    
    public AcupOldDetails() {
    }
    
    public AcupOldDetails(AcupOldCustData acupOldCustData, AcupOldAcctData acupOldAcctData) {
        this.acupOldCustData = acupOldCustData;
        this.acupOldAcctData = acupOldAcctData;
    }
    
    public AcupOldDetails(AcupOldDetails that) {
        this.acupOldCustData = new AcupOldCustData(that.acupOldCustData);
        this.acupOldAcctData = new AcupOldAcctData(that.acupOldAcctData);
    }
    
    protected AcupOldDetails(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupOldDetails(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupOldDetails fromBytes(byte[] bytes, int offset) {
        return new AcupOldDetails(bytes, offset);
    }
    
    public static AcupOldDetails fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupOldDetails fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public AcupOldCustData getAcupOldCustData() {
        return this.acupOldCustData;
    }
    
    public void setAcupOldCustData(AcupOldCustData acupOldCustData) {
        this.acupOldCustData = acupOldCustData;
    }
    
    public AcupOldAcctData getAcupOldAcctData() {
        return this.acupOldAcctData;
    }
    
    public void setAcupOldAcctData(AcupOldAcctData acupOldAcctData) {
        this.acupOldAcctData = acupOldAcctData;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupOldCustData=\"");
        s.append(getAcupOldCustData());
        s.append("\" acupOldAcctData=\"");
        s.append(getAcupOldAcctData());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupOldDetails that) {
        return this.acupOldCustData.equals(that.acupOldCustData) &&
            this.acupOldAcctData.equals(that.acupOldAcctData);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupOldDetails) && this.equals((AcupOldDetails)that);
    }
    
    @Override
    public int hashCode() {
        return acupOldCustData.hashCode() ^
            Integer.rotateLeft(acupOldAcctData.hashCode(), 1);
    }
    
    @Override
    public int compareTo(AcupOldDetails that) {
        int c = this.acupOldCustData.compareTo(that.acupOldCustData);
        if ( c != 0 ) return c;
        c = this.acupOldAcctData.compareTo(that.acupOldAcctData);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        acupOldCustData.getBytes(bytes, ACUPOLDCUSTDATA.getOffset() + offset);
        acupOldAcctData.getBytes(bytes, ACUPOLDACCTDATA.getOffset() + offset);
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
        acupOldCustData.setBytes(bytes, ACUPOLDCUSTDATA.getOffset() + offset);
        acupOldAcctData.setBytes(bytes, ACUPOLDACCTDATA.getOffset() + offset);
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
