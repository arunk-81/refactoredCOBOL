package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupOldCustPhoneNum2X implements Comparable<AcupOldCustPhoneNum2X> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPOLDCUSTPHONENUM2B = factory.getStringField(3);
    private static final StringField ACUPOLDCUSTPHONENUM2C = factory.getStringField(4);
    private static final StringField ACUPOLDCUSTPHONENUM2A = factory.getStringField(3);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupOldCustPhoneNum2b = "";
    private String acupOldCustPhoneNum2c = "";
    private String acupOldCustPhoneNum2a = "";
    
    public AcupOldCustPhoneNum2X() {
    }
    
    public AcupOldCustPhoneNum2X(String acupOldCustPhoneNum2b, String acupOldCustPhoneNum2c, String acupOldCustPhoneNum2a) {
        this.acupOldCustPhoneNum2b = acupOldCustPhoneNum2b;
        this.acupOldCustPhoneNum2c = acupOldCustPhoneNum2c;
        this.acupOldCustPhoneNum2a = acupOldCustPhoneNum2a;
    }
    
    public AcupOldCustPhoneNum2X(AcupOldCustPhoneNum2X that) {
        this.acupOldCustPhoneNum2b = that.acupOldCustPhoneNum2b;
        this.acupOldCustPhoneNum2c = that.acupOldCustPhoneNum2c;
        this.acupOldCustPhoneNum2a = that.acupOldCustPhoneNum2a;
    }
    
    protected AcupOldCustPhoneNum2X(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupOldCustPhoneNum2X(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupOldCustPhoneNum2X fromBytes(byte[] bytes, int offset) {
        return new AcupOldCustPhoneNum2X(bytes, offset);
    }
    
    public static AcupOldCustPhoneNum2X fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupOldCustPhoneNum2X fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupOldCustPhoneNum2b() {
        return this.acupOldCustPhoneNum2b;
    }
    
    public void setAcupOldCustPhoneNum2b(String acupOldCustPhoneNum2b) {
        this.acupOldCustPhoneNum2b = acupOldCustPhoneNum2b;
    }
    
    public String getAcupOldCustPhoneNum2c() {
        return this.acupOldCustPhoneNum2c;
    }
    
    public void setAcupOldCustPhoneNum2c(String acupOldCustPhoneNum2c) {
        this.acupOldCustPhoneNum2c = acupOldCustPhoneNum2c;
    }
    
    public String getAcupOldCustPhoneNum2a() {
        return this.acupOldCustPhoneNum2a;
    }
    
    public void setAcupOldCustPhoneNum2a(String acupOldCustPhoneNum2a) {
        this.acupOldCustPhoneNum2a = acupOldCustPhoneNum2a;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupOldCustPhoneNum2b=\"");
        s.append(getAcupOldCustPhoneNum2b());
        s.append("\" acupOldCustPhoneNum2c=\"");
        s.append(getAcupOldCustPhoneNum2c());
        s.append("\" acupOldCustPhoneNum2a=\"");
        s.append(getAcupOldCustPhoneNum2a());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupOldCustPhoneNum2X that) {
        return this.acupOldCustPhoneNum2b.equals(that.acupOldCustPhoneNum2b) &&
            this.acupOldCustPhoneNum2c.equals(that.acupOldCustPhoneNum2c) &&
            this.acupOldCustPhoneNum2a.equals(that.acupOldCustPhoneNum2a);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupOldCustPhoneNum2X) && this.equals((AcupOldCustPhoneNum2X)that);
    }
    
    @Override
    public int hashCode() {
        return acupOldCustPhoneNum2b.hashCode() ^
            Integer.rotateLeft(acupOldCustPhoneNum2c.hashCode(), 1) ^
            Integer.rotateLeft(acupOldCustPhoneNum2a.hashCode(), 2);
    }
    
    @Override
    public int compareTo(AcupOldCustPhoneNum2X that) {
        int c = this.acupOldCustPhoneNum2b.compareTo(that.acupOldCustPhoneNum2b);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum2c.compareTo(that.acupOldCustPhoneNum2c);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum2a.compareTo(that.acupOldCustPhoneNum2a);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPOLDCUSTPHONENUM2B.putString(acupOldCustPhoneNum2b, bytes, offset);
        ACUPOLDCUSTPHONENUM2C.putString(acupOldCustPhoneNum2c, bytes, offset);
        ACUPOLDCUSTPHONENUM2A.putString(acupOldCustPhoneNum2a, bytes, offset);
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
        acupOldCustPhoneNum2b = ACUPOLDCUSTPHONENUM2B.getString(bytes, offset);
        acupOldCustPhoneNum2c = ACUPOLDCUSTPHONENUM2C.getString(bytes, offset);
        acupOldCustPhoneNum2a = ACUPOLDCUSTPHONENUM2A.getString(bytes, offset);
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
