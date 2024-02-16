package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class WsThisProgcommarea implements Comparable<WsThisProgcommarea> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField ACUPNEWDETAILS = factory.getByteArrayField(AcupNewDetails.SIZE);
    private static final ByteArrayField ACUPOLDDETAILS = factory.getByteArrayField(AcupOldDetails.SIZE);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private AcupNewDetails acupNewDetails = new AcupNewDetails();
    private AcupOldDetails acupOldDetails = new AcupOldDetails();
    
    public WsThisProgcommarea() {
    }
    
    public WsThisProgcommarea(AcupNewDetails acupNewDetails, AcupOldDetails acupOldDetails) {
        this.acupNewDetails = acupNewDetails;
        this.acupOldDetails = acupOldDetails;
    }
    
    public WsThisProgcommarea(WsThisProgcommarea that) {
        this.acupNewDetails = new AcupNewDetails(that.acupNewDetails);
        this.acupOldDetails = new AcupOldDetails(that.acupOldDetails);
    }
    
    protected WsThisProgcommarea(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected WsThisProgcommarea(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static WsThisProgcommarea fromBytes(byte[] bytes, int offset) {
        return new WsThisProgcommarea(bytes, offset);
    }
    
    public static WsThisProgcommarea fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static WsThisProgcommarea fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public AcupNewDetails getAcupNewDetails() {
        return this.acupNewDetails;
    }
    
    public void setAcupNewDetails(AcupNewDetails acupNewDetails) {
        this.acupNewDetails = acupNewDetails;
    }
    
    public AcupOldDetails getAcupOldDetails() {
        return this.acupOldDetails;
    }
    
    public void setAcupOldDetails(AcupOldDetails acupOldDetails) {
        this.acupOldDetails = acupOldDetails;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewDetails=\"");
        s.append(getAcupNewDetails());
        s.append("\" acupOldDetails=\"");
        s.append(getAcupOldDetails());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(WsThisProgcommarea that) {
        return this.acupNewDetails.equals(that.acupNewDetails) &&
            this.acupOldDetails.equals(that.acupOldDetails);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof WsThisProgcommarea) && this.equals((WsThisProgcommarea)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewDetails.hashCode() ^
            Integer.rotateLeft(acupOldDetails.hashCode(), 1);
    }
    
    @Override
    public int compareTo(WsThisProgcommarea that) {
        int c = this.acupNewDetails.compareTo(that.acupNewDetails);
        if ( c != 0 ) return c;
        c = this.acupOldDetails.compareTo(that.acupOldDetails);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        acupNewDetails.getBytes(bytes, ACUPNEWDETAILS.getOffset() + offset);
        acupOldDetails.getBytes(bytes, ACUPOLDDETAILS.getOffset() + offset);
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
        acupNewDetails.setBytes(bytes, ACUPNEWDETAILS.getOffset() + offset);
        acupOldDetails.setBytes(bytes, ACUPOLDDETAILS.getOffset() + offset);
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
