package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CardfileStatus implements Comparable<CardfileStatus> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CARDFILESTAT1 = factory.getStringField(1);
    private static final StringField CARDFILESTAT2 = factory.getStringField(1);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private char cardfileStat1;
    private char cardfileStat2;
    
    public CardfileStatus() {
    }
    
    public CardfileStatus(char cardfileStat1, char cardfileStat2) {
        this.cardfileStat1 = cardfileStat1;
        this.cardfileStat2 = cardfileStat2;
    }
    
    public CardfileStatus(CardfileStatus that) {
        this.cardfileStat1 = that.cardfileStat1;
        this.cardfileStat2 = that.cardfileStat2;
    }
    
    protected CardfileStatus(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CardfileStatus(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CardfileStatus fromBytes(byte[] bytes, int offset) {
        return new CardfileStatus(bytes, offset);
    }
    
    public static CardfileStatus fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CardfileStatus fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public char getCardfileStat1() {
        return this.cardfileStat1;
    }
    
    public void setCardfileStat1(char cardfileStat1) {
        this.cardfileStat1 = cardfileStat1;
    }
    
    public char getCardfileStat2() {
        return this.cardfileStat2;
    }
    
    public void setCardfileStat2(char cardfileStat2) {
        this.cardfileStat2 = cardfileStat2;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ cardfileStat1=\"");
        s.append(getCardfileStat1());
        s.append("\" cardfileStat2=\"");
        s.append(getCardfileStat2());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CardfileStatus that) {
        return this.cardfileStat1 == that.cardfileStat1 &&
            this.cardfileStat2 == that.cardfileStat2;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CardfileStatus) && this.equals((CardfileStatus)that);
    }
    
    @Override
    public int hashCode() {
        return Character.hashCode(cardfileStat1) ^
            Integer.rotateLeft(Character.hashCode(cardfileStat2), 1);
    }
    
    @Override
    public int compareTo(CardfileStatus that) {
        int c = Character.compare(this.cardfileStat1, that.cardfileStat1);
        if ( c != 0 ) return c;
        c = Character.compare(this.cardfileStat2, that.cardfileStat2);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CARDFILESTAT1.putString(cardfileStat1, bytes, offset);
        CARDFILESTAT2.putString(cardfileStat2, bytes, offset);
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
        cardfileStat1 = CARDFILESTAT1.getString(bytes, offset);
        cardfileStat2 = CARDFILESTAT2.getString(bytes, offset);
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
