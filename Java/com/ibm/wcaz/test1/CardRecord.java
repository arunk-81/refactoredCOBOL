package com.ibm.wcaz.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CardRecord implements Comparable<CardRecord> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CARDNUM = factory.getStringField(16);
    private static final ExternalDecimalAsLongField CARDACCTID = factory.getExternalDecimalAsLongField(11, true);
    private static final ExternalDecimalAsIntField CARDCVVCD = factory.getExternalDecimalAsIntField(3, true);
    private static final StringField CARDEMBOSSEDNAME = factory.getStringField(50);
    private static final StringField CARDEXPIRAIONDATE = factory.getStringField(10);
    private static final StringField CARDACTIVESTATUS = factory.getStringField(1);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String cardNum = "";
    private long cardAcctId;
    private int cardCvvCd;
    private String cardEmbossedName = "";
    private String cardExpiraionDate = "";
    private char cardActiveStatus;
    
    public CardRecord() {
    }
    
    public CardRecord(String cardNum, long cardAcctId, int cardCvvCd, String cardEmbossedName, String cardExpiraionDate, char cardActiveStatus) {
        this.cardNum = cardNum;
        this.cardAcctId = cardAcctId;
        this.cardCvvCd = cardCvvCd;
        this.cardEmbossedName = cardEmbossedName;
        this.cardExpiraionDate = cardExpiraionDate;
        this.cardActiveStatus = cardActiveStatus;
    }
    
    public CardRecord(CardRecord that) {
        this.cardNum = that.cardNum;
        this.cardAcctId = that.cardAcctId;
        this.cardCvvCd = that.cardCvvCd;
        this.cardEmbossedName = that.cardEmbossedName;
        this.cardExpiraionDate = that.cardExpiraionDate;
        this.cardActiveStatus = that.cardActiveStatus;
    }
    
    protected CardRecord(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CardRecord(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CardRecord fromBytes(byte[] bytes, int offset) {
        return new CardRecord(bytes, offset);
    }
    
    public static CardRecord fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CardRecord fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCardNum() {
        return this.cardNum;
    }
    
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
    
    public long getCardAcctId() {
        return this.cardAcctId;
    }
    
    public void setCardAcctId(long cardAcctId) {
        this.cardAcctId = cardAcctId;
    }
    
    public int getCardCvvCd() {
        return this.cardCvvCd;
    }
    
    public void setCardCvvCd(int cardCvvCd) {
        this.cardCvvCd = cardCvvCd;
    }
    
    public String getCardEmbossedName() {
        return this.cardEmbossedName;
    }
    
    public void setCardEmbossedName(String cardEmbossedName) {
        this.cardEmbossedName = cardEmbossedName;
    }
    
    public String getCardExpiraionDate() {
        return this.cardExpiraionDate;
    }
    
    public void setCardExpiraionDate(String cardExpiraionDate) {
        this.cardExpiraionDate = cardExpiraionDate;
    }
    
    public char getCardActiveStatus() {
        return this.cardActiveStatus;
    }
    
    public void setCardActiveStatus(char cardActiveStatus) {
        this.cardActiveStatus = cardActiveStatus;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ cardNum=\"");
        s.append(getCardNum());
        s.append("\" cardAcctId=\"");
        s.append(getCardAcctId());
        s.append("\" cardCvvCd=\"");
        s.append(getCardCvvCd());
        s.append("\" cardEmbossedName=\"");
        s.append(getCardEmbossedName());
        s.append("\" cardExpiraionDate=\"");
        s.append(getCardExpiraionDate());
        s.append("\" cardActiveStatus=\"");
        s.append(getCardActiveStatus());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CardRecord that) {
        return this.cardNum.equals(that.cardNum) &&
            this.cardAcctId == that.cardAcctId &&
            this.cardCvvCd == that.cardCvvCd &&
            this.cardEmbossedName.equals(that.cardEmbossedName) &&
            this.cardExpiraionDate.equals(that.cardExpiraionDate) &&
            this.cardActiveStatus == that.cardActiveStatus;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CardRecord) && this.equals((CardRecord)that);
    }
    
    @Override
    public int hashCode() {
        return cardNum.hashCode() ^
            Integer.rotateLeft(Long.hashCode(cardAcctId), 1) ^
            Integer.rotateLeft(Integer.hashCode(cardCvvCd), 2) ^
            Integer.rotateLeft(cardEmbossedName.hashCode(), 3) ^
            Integer.rotateLeft(cardExpiraionDate.hashCode(), 4) ^
            Integer.rotateLeft(Character.hashCode(cardActiveStatus), 5);
    }
    
    @Override
    public int compareTo(CardRecord that) {
        int c = this.cardNum.compareTo(that.cardNum);
        if ( c != 0 ) return c;
        c = Long.compare(this.cardAcctId, that.cardAcctId);
        if ( c != 0 ) return c;
        c = Integer.compare(this.cardCvvCd, that.cardCvvCd);
        if ( c != 0 ) return c;
        c = this.cardEmbossedName.compareTo(that.cardEmbossedName);
        if ( c != 0 ) return c;
        c = this.cardExpiraionDate.compareTo(that.cardExpiraionDate);
        if ( c != 0 ) return c;
        c = Character.compare(this.cardActiveStatus, that.cardActiveStatus);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CARDNUM.putString(cardNum, bytes, offset);
        CARDACCTID.putLong(cardAcctId, bytes, offset);
        CARDCVVCD.putInt(cardCvvCd, bytes, offset);
        CARDEMBOSSEDNAME.putString(cardEmbossedName, bytes, offset);
        CARDEXPIRAIONDATE.putString(cardExpiraionDate, bytes, offset);
        CARDACTIVESTATUS.putString(cardActiveStatus, bytes, offset);
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
        cardNum = CARDNUM.getString(bytes, offset);
        cardAcctId = CARDACCTID.getLong(bytes, offset);
        cardCvvCd = CARDCVVCD.getInt(bytes, offset);
        cardEmbossedName = CARDEMBOSSEDNAME.getString(bytes, offset);
        cardExpiraionDate = CARDEXPIRAIONDATE.getString(bytes, offset);
        cardActiveStatus = CARDACTIVESTATUS.getString(bytes, offset);
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
