package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewCustPhoneNum1X implements Comparable<AcupNewCustPhoneNum1X> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPNEWCUSTPHONENUM1B = factory.getStringField(3);
    private static final StringField ACUPNEWCUSTPHONENUM1C = factory.getStringField(4);
    private static final StringField ACUPNEWCUSTPHONENUM1A = factory.getStringField(3);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupNewCustPhoneNum1b = "";
    private String acupNewCustPhoneNum1c = "";
    private String acupNewCustPhoneNum1a = "";
    
    public AcupNewCustPhoneNum1X() {
    }
    
    public AcupNewCustPhoneNum1X(String acupNewCustPhoneNum1b, String acupNewCustPhoneNum1c, String acupNewCustPhoneNum1a) {
        this.acupNewCustPhoneNum1b = acupNewCustPhoneNum1b;
        this.acupNewCustPhoneNum1c = acupNewCustPhoneNum1c;
        this.acupNewCustPhoneNum1a = acupNewCustPhoneNum1a;
    }
    
    public AcupNewCustPhoneNum1X(AcupNewCustPhoneNum1X that) {
        this.acupNewCustPhoneNum1b = that.acupNewCustPhoneNum1b;
        this.acupNewCustPhoneNum1c = that.acupNewCustPhoneNum1c;
        this.acupNewCustPhoneNum1a = that.acupNewCustPhoneNum1a;
    }
    
    protected AcupNewCustPhoneNum1X(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewCustPhoneNum1X(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewCustPhoneNum1X fromBytes(byte[] bytes, int offset) {
        return new AcupNewCustPhoneNum1X(bytes, offset);
    }
    
    public static AcupNewCustPhoneNum1X fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewCustPhoneNum1X fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupNewCustPhoneNum1b() {
        return this.acupNewCustPhoneNum1b;
    }
    
    public void setAcupNewCustPhoneNum1b(String acupNewCustPhoneNum1b) {
        this.acupNewCustPhoneNum1b = acupNewCustPhoneNum1b;
    }
    
    public String getAcupNewCustPhoneNum1c() {
        return this.acupNewCustPhoneNum1c;
    }
    
    public void setAcupNewCustPhoneNum1c(String acupNewCustPhoneNum1c) {
        this.acupNewCustPhoneNum1c = acupNewCustPhoneNum1c;
    }
    
    public String getAcupNewCustPhoneNum1a() {
        return this.acupNewCustPhoneNum1a;
    }
    
    public void setAcupNewCustPhoneNum1a(String acupNewCustPhoneNum1a) {
        this.acupNewCustPhoneNum1a = acupNewCustPhoneNum1a;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewCustPhoneNum1b=\"");
        s.append(getAcupNewCustPhoneNum1b());
        s.append("\" acupNewCustPhoneNum1c=\"");
        s.append(getAcupNewCustPhoneNum1c());
        s.append("\" acupNewCustPhoneNum1a=\"");
        s.append(getAcupNewCustPhoneNum1a());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewCustPhoneNum1X that) {
        return this.acupNewCustPhoneNum1b.equals(that.acupNewCustPhoneNum1b) &&
            this.acupNewCustPhoneNum1c.equals(that.acupNewCustPhoneNum1c) &&
            this.acupNewCustPhoneNum1a.equals(that.acupNewCustPhoneNum1a);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewCustPhoneNum1X) && this.equals((AcupNewCustPhoneNum1X)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewCustPhoneNum1b.hashCode() ^
            Integer.rotateLeft(acupNewCustPhoneNum1c.hashCode(), 1) ^
            Integer.rotateLeft(acupNewCustPhoneNum1a.hashCode(), 2);
    }
    
    @Override
    public int compareTo(AcupNewCustPhoneNum1X that) {
        int c = this.acupNewCustPhoneNum1b.compareTo(that.acupNewCustPhoneNum1b);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum1c.compareTo(that.acupNewCustPhoneNum1c);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum1a.compareTo(that.acupNewCustPhoneNum1a);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPNEWCUSTPHONENUM1B.putString(acupNewCustPhoneNum1b, bytes, offset);
        ACUPNEWCUSTPHONENUM1C.putString(acupNewCustPhoneNum1c, bytes, offset);
        ACUPNEWCUSTPHONENUM1A.putString(acupNewCustPhoneNum1a, bytes, offset);
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
        acupNewCustPhoneNum1b = ACUPNEWCUSTPHONENUM1B.getString(bytes, offset);
        acupNewCustPhoneNum1c = ACUPNEWCUSTPHONENUM1C.getString(bytes, offset);
        acupNewCustPhoneNum1a = ACUPNEWCUSTPHONENUM1A.getString(bytes, offset);
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
