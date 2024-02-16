package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Cousr1ao implements Comparable<Cousr1ao> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField TRNNAMEO = factory.getStringField(4);
    private static final StringField TITLE01O = factory.getStringField(40);
    private static final StringField CURDATEO = factory.getStringField(8);
    private static final StringField PGMNAMEO = factory.getStringField(8);
    private static final StringField TITLE02O = factory.getStringField(40);
    private static final StringField CURTIMEO = factory.getStringField(8);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String trnnameo = "";
    private String title01o = "";
    private String curdateo = "";
    private String pgmnameo = "";
    private String title02o = "";
    private String curtimeo = "";
    
    public Cousr1ao() {
    }
    
    public Cousr1ao(String trnnameo, String title01o, String curdateo, String pgmnameo, String title02o, String curtimeo) {
        this.trnnameo = trnnameo;
        this.title01o = title01o;
        this.curdateo = curdateo;
        this.pgmnameo = pgmnameo;
        this.title02o = title02o;
        this.curtimeo = curtimeo;
    }
    
    public Cousr1ao(Cousr1ao that) {
        this.trnnameo = that.trnnameo;
        this.title01o = that.title01o;
        this.curdateo = that.curdateo;
        this.pgmnameo = that.pgmnameo;
        this.title02o = that.title02o;
        this.curtimeo = that.curtimeo;
    }
    
    protected Cousr1ao(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Cousr1ao(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Cousr1ao fromBytes(byte[] bytes, int offset) {
        return new Cousr1ao(bytes, offset);
    }
    
    public static Cousr1ao fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Cousr1ao fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getTrnnameo() {
        return this.trnnameo;
    }
    
    public void setTrnnameo(String trnnameo) {
        this.trnnameo = trnnameo;
    }
    
    public String getTitle01o() {
        return this.title01o;
    }
    
    public void setTitle01o(String title01o) {
        this.title01o = title01o;
    }
    
    public String getCurdateo() {
        return this.curdateo;
    }
    
    public void setCurdateo(String curdateo) {
        this.curdateo = curdateo;
    }
    
    public String getPgmnameo() {
        return this.pgmnameo;
    }
    
    public void setPgmnameo(String pgmnameo) {
        this.pgmnameo = pgmnameo;
    }
    
    public String getTitle02o() {
        return this.title02o;
    }
    
    public void setTitle02o(String title02o) {
        this.title02o = title02o;
    }
    
    public String getCurtimeo() {
        return this.curtimeo;
    }
    
    public void setCurtimeo(String curtimeo) {
        this.curtimeo = curtimeo;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ trnnameo=\"");
        s.append(getTrnnameo());
        s.append("\" title01o=\"");
        s.append(getTitle01o());
        s.append("\" curdateo=\"");
        s.append(getCurdateo());
        s.append("\" pgmnameo=\"");
        s.append(getPgmnameo());
        s.append("\" title02o=\"");
        s.append(getTitle02o());
        s.append("\" curtimeo=\"");
        s.append(getCurtimeo());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(Cousr1ao that) {
        return this.trnnameo.equals(that.trnnameo) &&
            this.title01o.equals(that.title01o) &&
            this.curdateo.equals(that.curdateo) &&
            this.pgmnameo.equals(that.pgmnameo) &&
            this.title02o.equals(that.title02o) &&
            this.curtimeo.equals(that.curtimeo);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Cousr1ao) && this.equals((Cousr1ao)that);
    }
    
    @Override
    public int hashCode() {
        return trnnameo.hashCode() ^
            Integer.rotateLeft(title01o.hashCode(), 1) ^
            Integer.rotateLeft(curdateo.hashCode(), 2) ^
            Integer.rotateLeft(pgmnameo.hashCode(), 3) ^
            Integer.rotateLeft(title02o.hashCode(), 4) ^
            Integer.rotateLeft(curtimeo.hashCode(), 5);
    }
    
    @Override
    public int compareTo(Cousr1ao that) {
        int c = this.trnnameo.compareTo(that.trnnameo);
        if ( c != 0 ) return c;
        c = this.title01o.compareTo(that.title01o);
        if ( c != 0 ) return c;
        c = this.curdateo.compareTo(that.curdateo);
        if ( c != 0 ) return c;
        c = this.pgmnameo.compareTo(that.pgmnameo);
        if ( c != 0 ) return c;
        c = this.title02o.compareTo(that.title02o);
        if ( c != 0 ) return c;
        c = this.curtimeo.compareTo(that.curtimeo);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        TRNNAMEO.putString(trnnameo, bytes, offset);
        TITLE01O.putString(title01o, bytes, offset);
        CURDATEO.putString(curdateo, bytes, offset);
        PGMNAMEO.putString(pgmnameo, bytes, offset);
        TITLE02O.putString(title02o, bytes, offset);
        CURTIMEO.putString(curtimeo, bytes, offset);
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
        trnnameo = TRNNAMEO.getString(bytes, offset);
        title01o = TITLE01O.getString(bytes, offset);
        curdateo = CURDATEO.getString(bytes, offset);
        pgmnameo = PGMNAMEO.getString(bytes, offset);
        title02o = TITLE02O.getString(bytes, offset);
        curtimeo = CURTIMEO.getString(bytes, offset);
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
