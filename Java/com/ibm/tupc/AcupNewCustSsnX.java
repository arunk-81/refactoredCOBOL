package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewCustSsnX implements Comparable<AcupNewCustSsnX> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPNEWCUSTSSN3 = factory.getStringField(4);
    private static final StringField ACUPNEWCUSTSSN1 = factory.getStringField(3);
    private static final StringField ACUPNEWCUSTSSN2 = factory.getStringField(2);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupNewCustSsn3 = "";
    private String acupNewCustSsn1 = "";
    private String acupNewCustSsn2 = "";
    
    public AcupNewCustSsnX() {
    }
    
    public AcupNewCustSsnX(String acupNewCustSsn3, String acupNewCustSsn1, String acupNewCustSsn2) {
        this.acupNewCustSsn3 = acupNewCustSsn3;
        this.acupNewCustSsn1 = acupNewCustSsn1;
        this.acupNewCustSsn2 = acupNewCustSsn2;
    }
    
    public AcupNewCustSsnX(AcupNewCustSsnX that) {
        this.acupNewCustSsn3 = that.acupNewCustSsn3;
        this.acupNewCustSsn1 = that.acupNewCustSsn1;
        this.acupNewCustSsn2 = that.acupNewCustSsn2;
    }
    
    protected AcupNewCustSsnX(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewCustSsnX(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewCustSsnX fromBytes(byte[] bytes, int offset) {
        return new AcupNewCustSsnX(bytes, offset);
    }
    
    public static AcupNewCustSsnX fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewCustSsnX fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupNewCustSsn3() {
        return this.acupNewCustSsn3;
    }
    
    public void setAcupNewCustSsn3(String acupNewCustSsn3) {
        this.acupNewCustSsn3 = acupNewCustSsn3;
    }
    
    public String getAcupNewCustSsn1() {
        return this.acupNewCustSsn1;
    }
    
    public void setAcupNewCustSsn1(String acupNewCustSsn1) {
        this.acupNewCustSsn1 = acupNewCustSsn1;
    }
    
    public String getAcupNewCustSsn2() {
        return this.acupNewCustSsn2;
    }
    
    public void setAcupNewCustSsn2(String acupNewCustSsn2) {
        this.acupNewCustSsn2 = acupNewCustSsn2;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewCustSsn3=\"");
        s.append(getAcupNewCustSsn3());
        s.append("\" acupNewCustSsn1=\"");
        s.append(getAcupNewCustSsn1());
        s.append("\" acupNewCustSsn2=\"");
        s.append(getAcupNewCustSsn2());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewCustSsnX that) {
        return this.acupNewCustSsn3.equals(that.acupNewCustSsn3) &&
            this.acupNewCustSsn1.equals(that.acupNewCustSsn1) &&
            this.acupNewCustSsn2.equals(that.acupNewCustSsn2);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewCustSsnX) && this.equals((AcupNewCustSsnX)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewCustSsn3.hashCode() ^
            Integer.rotateLeft(acupNewCustSsn1.hashCode(), 1) ^
            Integer.rotateLeft(acupNewCustSsn2.hashCode(), 2);
    }
    
    @Override
    public int compareTo(AcupNewCustSsnX that) {
        int c = this.acupNewCustSsn3.compareTo(that.acupNewCustSsn3);
        if ( c != 0 ) return c;
        c = this.acupNewCustSsn1.compareTo(that.acupNewCustSsn1);
        if ( c != 0 ) return c;
        c = this.acupNewCustSsn2.compareTo(that.acupNewCustSsn2);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPNEWCUSTSSN3.putString(acupNewCustSsn3, bytes, offset);
        ACUPNEWCUSTSSN1.putString(acupNewCustSsn1, bytes, offset);
        ACUPNEWCUSTSSN2.putString(acupNewCustSsn2, bytes, offset);
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
        acupNewCustSsn3 = ACUPNEWCUSTSSN3.getString(bytes, offset);
        acupNewCustSsn1 = ACUPNEWCUSTSSN1.getString(bytes, offset);
        acupNewCustSsn2 = ACUPNEWCUSTSSN2.getString(bytes, offset);
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
