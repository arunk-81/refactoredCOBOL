package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupOldCustPhoneNum1X implements Comparable<AcupOldCustPhoneNum1X> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPOLDCUSTPHONENUM1A = factory.getStringField(3);
    private static final StringField ACUPOLDCUSTPHONENUM1B = factory.getStringField(3);
    private static final StringField ACUPOLDCUSTPHONENUM1C = factory.getStringField(4);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupOldCustPhoneNum1a = "";
    private String acupOldCustPhoneNum1b = "";
    private String acupOldCustPhoneNum1c = "";
    
    public AcupOldCustPhoneNum1X() {
    }
    
    public AcupOldCustPhoneNum1X(String acupOldCustPhoneNum1a, String acupOldCustPhoneNum1b, String acupOldCustPhoneNum1c) {
        this.acupOldCustPhoneNum1a = acupOldCustPhoneNum1a;
        this.acupOldCustPhoneNum1b = acupOldCustPhoneNum1b;
        this.acupOldCustPhoneNum1c = acupOldCustPhoneNum1c;
    }
    
    public AcupOldCustPhoneNum1X(AcupOldCustPhoneNum1X that) {
        this.acupOldCustPhoneNum1a = that.acupOldCustPhoneNum1a;
        this.acupOldCustPhoneNum1b = that.acupOldCustPhoneNum1b;
        this.acupOldCustPhoneNum1c = that.acupOldCustPhoneNum1c;
    }
    
    protected AcupOldCustPhoneNum1X(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupOldCustPhoneNum1X(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupOldCustPhoneNum1X fromBytes(byte[] bytes, int offset) {
        return new AcupOldCustPhoneNum1X(bytes, offset);
    }
    
    public static AcupOldCustPhoneNum1X fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupOldCustPhoneNum1X fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupOldCustPhoneNum1a() {
        return this.acupOldCustPhoneNum1a;
    }
    
    public void setAcupOldCustPhoneNum1a(String acupOldCustPhoneNum1a) {
        this.acupOldCustPhoneNum1a = acupOldCustPhoneNum1a;
    }
    
    public String getAcupOldCustPhoneNum1b() {
        return this.acupOldCustPhoneNum1b;
    }
    
    public void setAcupOldCustPhoneNum1b(String acupOldCustPhoneNum1b) {
        this.acupOldCustPhoneNum1b = acupOldCustPhoneNum1b;
    }
    
    public String getAcupOldCustPhoneNum1c() {
        return this.acupOldCustPhoneNum1c;
    }
    
    public void setAcupOldCustPhoneNum1c(String acupOldCustPhoneNum1c) {
        this.acupOldCustPhoneNum1c = acupOldCustPhoneNum1c;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupOldCustPhoneNum1a=\"");
        s.append(getAcupOldCustPhoneNum1a());
        s.append("\" acupOldCustPhoneNum1b=\"");
        s.append(getAcupOldCustPhoneNum1b());
        s.append("\" acupOldCustPhoneNum1c=\"");
        s.append(getAcupOldCustPhoneNum1c());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupOldCustPhoneNum1X that) {
        return this.acupOldCustPhoneNum1a.equals(that.acupOldCustPhoneNum1a) &&
            this.acupOldCustPhoneNum1b.equals(that.acupOldCustPhoneNum1b) &&
            this.acupOldCustPhoneNum1c.equals(that.acupOldCustPhoneNum1c);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupOldCustPhoneNum1X) && this.equals((AcupOldCustPhoneNum1X)that);
    }
    
    @Override
    public int hashCode() {
        return acupOldCustPhoneNum1a.hashCode() ^
            Integer.rotateLeft(acupOldCustPhoneNum1b.hashCode(), 1) ^
            Integer.rotateLeft(acupOldCustPhoneNum1c.hashCode(), 2);
    }
    
    @Override
    public int compareTo(AcupOldCustPhoneNum1X that) {
        int c = this.acupOldCustPhoneNum1a.compareTo(that.acupOldCustPhoneNum1a);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum1b.compareTo(that.acupOldCustPhoneNum1b);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum1c.compareTo(that.acupOldCustPhoneNum1c);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPOLDCUSTPHONENUM1A.putString(acupOldCustPhoneNum1a, bytes, offset);
        ACUPOLDCUSTPHONENUM1B.putString(acupOldCustPhoneNum1b, bytes, offset);
        ACUPOLDCUSTPHONENUM1C.putString(acupOldCustPhoneNum1c, bytes, offset);
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
        acupOldCustPhoneNum1a = ACUPOLDCUSTPHONENUM1A.getString(bytes, offset);
        acupOldCustPhoneNum1b = ACUPOLDCUSTPHONENUM1B.getString(bytes, offset);
        acupOldCustPhoneNum1c = ACUPOLDCUSTPHONENUM1C.getString(bytes, offset);
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
