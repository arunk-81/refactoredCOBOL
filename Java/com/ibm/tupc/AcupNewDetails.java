package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewDetails implements Comparable<AcupNewDetails> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField ACUPNEWACCTDATA = factory.getByteArrayField(AcupNewAcctData.SIZE);
    private static final ByteArrayField ACUPNEWCUSTDATA = factory.getByteArrayField(AcupNewCustData.SIZE);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private AcupNewAcctData acupNewAcctData = new AcupNewAcctData();
    private AcupNewCustData acupNewCustData = new AcupNewCustData();
    
    public AcupNewDetails() {
    }
    
    public AcupNewDetails(AcupNewAcctData acupNewAcctData, AcupNewCustData acupNewCustData) {
        this.acupNewAcctData = acupNewAcctData;
        this.acupNewCustData = acupNewCustData;
    }
    
    public AcupNewDetails(AcupNewDetails that) {
        this.acupNewAcctData = new AcupNewAcctData(that.acupNewAcctData);
        this.acupNewCustData = new AcupNewCustData(that.acupNewCustData);
    }
    
    protected AcupNewDetails(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewDetails(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewDetails fromBytes(byte[] bytes, int offset) {
        return new AcupNewDetails(bytes, offset);
    }
    
    public static AcupNewDetails fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewDetails fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public AcupNewAcctData getAcupNewAcctData() {
        return this.acupNewAcctData;
    }
    
    public void setAcupNewAcctData(AcupNewAcctData acupNewAcctData) {
        this.acupNewAcctData = acupNewAcctData;
    }
    
    public AcupNewCustData getAcupNewCustData() {
        return this.acupNewCustData;
    }
    
    public void setAcupNewCustData(AcupNewCustData acupNewCustData) {
        this.acupNewCustData = acupNewCustData;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewAcctData=\"");
        s.append(getAcupNewAcctData());
        s.append("\" acupNewCustData=\"");
        s.append(getAcupNewCustData());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewDetails that) {
        return this.acupNewAcctData.equals(that.acupNewAcctData) &&
            this.acupNewCustData.equals(that.acupNewCustData);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewDetails) && this.equals((AcupNewDetails)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewAcctData.hashCode() ^
            Integer.rotateLeft(acupNewCustData.hashCode(), 1);
    }
    
    @Override
    public int compareTo(AcupNewDetails that) {
        int c = this.acupNewAcctData.compareTo(that.acupNewAcctData);
        if ( c != 0 ) return c;
        c = this.acupNewCustData.compareTo(that.acupNewCustData);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        acupNewAcctData.getBytes(bytes, ACUPNEWACCTDATA.getOffset() + offset);
        acupNewCustData.getBytes(bytes, ACUPNEWCUSTDATA.getOffset() + offset);
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
        acupNewAcctData.setBytes(bytes, ACUPNEWACCTDATA.getOffset() + offset);
        acupNewCustData.setBytes(bytes, ACUPNEWCUSTDATA.getOffset() + offset);
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
