package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewCustPhoneNum2X implements Comparable<AcupNewCustPhoneNum2X> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPNEWCUSTPHONENUM2A = factory.getStringField(3);
    private static final StringField ACUPNEWCUSTPHONENUM2B = factory.getStringField(3);
    private static final StringField ACUPNEWCUSTPHONENUM2C = factory.getStringField(4);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupNewCustPhoneNum2a = "";
    private String acupNewCustPhoneNum2b = "";
    private String acupNewCustPhoneNum2c = "";
    
    public AcupNewCustPhoneNum2X() {
    }
    
    public AcupNewCustPhoneNum2X(String acupNewCustPhoneNum2a, String acupNewCustPhoneNum2b, String acupNewCustPhoneNum2c) {
        this.acupNewCustPhoneNum2a = acupNewCustPhoneNum2a;
        this.acupNewCustPhoneNum2b = acupNewCustPhoneNum2b;
        this.acupNewCustPhoneNum2c = acupNewCustPhoneNum2c;
    }
    
    public AcupNewCustPhoneNum2X(AcupNewCustPhoneNum2X that) {
        this.acupNewCustPhoneNum2a = that.acupNewCustPhoneNum2a;
        this.acupNewCustPhoneNum2b = that.acupNewCustPhoneNum2b;
        this.acupNewCustPhoneNum2c = that.acupNewCustPhoneNum2c;
    }
    
    protected AcupNewCustPhoneNum2X(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewCustPhoneNum2X(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewCustPhoneNum2X fromBytes(byte[] bytes, int offset) {
        return new AcupNewCustPhoneNum2X(bytes, offset);
    }
    
    public static AcupNewCustPhoneNum2X fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewCustPhoneNum2X fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupNewCustPhoneNum2a() {
        return this.acupNewCustPhoneNum2a;
    }
    
    public void setAcupNewCustPhoneNum2a(String acupNewCustPhoneNum2a) {
        this.acupNewCustPhoneNum2a = acupNewCustPhoneNum2a;
    }
    
    public String getAcupNewCustPhoneNum2b() {
        return this.acupNewCustPhoneNum2b;
    }
    
    public void setAcupNewCustPhoneNum2b(String acupNewCustPhoneNum2b) {
        this.acupNewCustPhoneNum2b = acupNewCustPhoneNum2b;
    }
    
    public String getAcupNewCustPhoneNum2c() {
        return this.acupNewCustPhoneNum2c;
    }
    
    public void setAcupNewCustPhoneNum2c(String acupNewCustPhoneNum2c) {
        this.acupNewCustPhoneNum2c = acupNewCustPhoneNum2c;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewCustPhoneNum2a=\"");
        s.append(getAcupNewCustPhoneNum2a());
        s.append("\" acupNewCustPhoneNum2b=\"");
        s.append(getAcupNewCustPhoneNum2b());
        s.append("\" acupNewCustPhoneNum2c=\"");
        s.append(getAcupNewCustPhoneNum2c());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewCustPhoneNum2X that) {
        return this.acupNewCustPhoneNum2a.equals(that.acupNewCustPhoneNum2a) &&
            this.acupNewCustPhoneNum2b.equals(that.acupNewCustPhoneNum2b) &&
            this.acupNewCustPhoneNum2c.equals(that.acupNewCustPhoneNum2c);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewCustPhoneNum2X) && this.equals((AcupNewCustPhoneNum2X)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewCustPhoneNum2a.hashCode() ^
            Integer.rotateLeft(acupNewCustPhoneNum2b.hashCode(), 1) ^
            Integer.rotateLeft(acupNewCustPhoneNum2c.hashCode(), 2);
    }
    
    @Override
    public int compareTo(AcupNewCustPhoneNum2X that) {
        int c = this.acupNewCustPhoneNum2a.compareTo(that.acupNewCustPhoneNum2a);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum2b.compareTo(that.acupNewCustPhoneNum2b);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum2c.compareTo(that.acupNewCustPhoneNum2c);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPNEWCUSTPHONENUM2A.putString(acupNewCustPhoneNum2a, bytes, offset);
        ACUPNEWCUSTPHONENUM2B.putString(acupNewCustPhoneNum2b, bytes, offset);
        ACUPNEWCUSTPHONENUM2C.putString(acupNewCustPhoneNum2c, bytes, offset);
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
        acupNewCustPhoneNum2a = ACUPNEWCUSTPHONENUM2A.getString(bytes, offset);
        acupNewCustPhoneNum2b = ACUPNEWCUSTPHONENUM2B.getString(bytes, offset);
        acupNewCustPhoneNum2c = ACUPNEWCUSTPHONENUM2C.getString(bytes, offset);
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
