package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupOldAcctData implements Comparable<AcupOldAcctData> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPOLDOPENDATE = factory.getStringField(8);
    private static final StringField ACUPOLDCASHCREDITLIMIT = factory.getStringField(12);
    private static final StringField ACUPOLDCURRCYCCREDIT = factory.getStringField(12);
    private static final StringField ACUPOLDCURRCYCDEBIT = factory.getStringField(12);
    private static final StringField ACUPOLDGROUPID = factory.getStringField(10);
    private static final StringField ACUPOLDEXPIRAIONDATE = factory.getStringField(8);
    private static final StringField ACUPOLDACCTIDX = factory.getStringField(11);
    private static final StringField ACUPOLDACTIVESTATUS = factory.getStringField(1);
    private static final StringField ACUPOLDREISSUEDATE = factory.getStringField(8);
    private static final StringField ACUPOLDCURRBAL = factory.getStringField(12);
    private static final StringField ACUPOLDCREDITLIMIT = factory.getStringField(12);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupOldOpenDate = "";
    private String acupOldCashCreditLimit = "";
    private String acupOldCurrCycCredit = "";
    private String acupOldCurrCycDebit = "";
    private String acupOldGroupId = "";
    private String acupOldExpiraionDate = "";
    private String acupOldAcctIdX = "";
    private char acupOldActiveStatus;
    private String acupOldReissueDate = "";
    private String acupOldCurrBal = "";
    private String acupOldCreditLimit = "";
    
    public AcupOldAcctData() {
    }
    
    public AcupOldAcctData(String acupOldOpenDate, String acupOldCashCreditLimit, String acupOldCurrCycCredit, String acupOldCurrCycDebit, String acupOldGroupId, String acupOldExpiraionDate, String acupOldAcctIdX, char acupOldActiveStatus, String acupOldReissueDate, String acupOldCurrBal, String acupOldCreditLimit) {
        this.acupOldOpenDate = acupOldOpenDate;
        this.acupOldCashCreditLimit = acupOldCashCreditLimit;
        this.acupOldCurrCycCredit = acupOldCurrCycCredit;
        this.acupOldCurrCycDebit = acupOldCurrCycDebit;
        this.acupOldGroupId = acupOldGroupId;
        this.acupOldExpiraionDate = acupOldExpiraionDate;
        this.acupOldAcctIdX = acupOldAcctIdX;
        this.acupOldActiveStatus = acupOldActiveStatus;
        this.acupOldReissueDate = acupOldReissueDate;
        this.acupOldCurrBal = acupOldCurrBal;
        this.acupOldCreditLimit = acupOldCreditLimit;
    }
    
    public AcupOldAcctData(AcupOldAcctData that) {
        this.acupOldOpenDate = that.acupOldOpenDate;
        this.acupOldCashCreditLimit = that.acupOldCashCreditLimit;
        this.acupOldCurrCycCredit = that.acupOldCurrCycCredit;
        this.acupOldCurrCycDebit = that.acupOldCurrCycDebit;
        this.acupOldGroupId = that.acupOldGroupId;
        this.acupOldExpiraionDate = that.acupOldExpiraionDate;
        this.acupOldAcctIdX = that.acupOldAcctIdX;
        this.acupOldActiveStatus = that.acupOldActiveStatus;
        this.acupOldReissueDate = that.acupOldReissueDate;
        this.acupOldCurrBal = that.acupOldCurrBal;
        this.acupOldCreditLimit = that.acupOldCreditLimit;
    }
    
    protected AcupOldAcctData(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupOldAcctData(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupOldAcctData fromBytes(byte[] bytes, int offset) {
        return new AcupOldAcctData(bytes, offset);
    }
    
    public static AcupOldAcctData fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupOldAcctData fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupOldOpenDate() {
        return this.acupOldOpenDate;
    }
    
    public void setAcupOldOpenDate(String acupOldOpenDate) {
        this.acupOldOpenDate = acupOldOpenDate;
    }
    
    public String getAcupOldCashCreditLimit() {
        return this.acupOldCashCreditLimit;
    }
    
    public void setAcupOldCashCreditLimit(String acupOldCashCreditLimit) {
        this.acupOldCashCreditLimit = acupOldCashCreditLimit;
    }
    
    public String getAcupOldCurrCycCredit() {
        return this.acupOldCurrCycCredit;
    }
    
    public void setAcupOldCurrCycCredit(String acupOldCurrCycCredit) {
        this.acupOldCurrCycCredit = acupOldCurrCycCredit;
    }
    
    public String getAcupOldCurrCycDebit() {
        return this.acupOldCurrCycDebit;
    }
    
    public void setAcupOldCurrCycDebit(String acupOldCurrCycDebit) {
        this.acupOldCurrCycDebit = acupOldCurrCycDebit;
    }
    
    public String getAcupOldGroupId() {
        return this.acupOldGroupId;
    }
    
    public void setAcupOldGroupId(String acupOldGroupId) {
        this.acupOldGroupId = acupOldGroupId;
    }
    
    public String getAcupOldExpiraionDate() {
        return this.acupOldExpiraionDate;
    }
    
    public void setAcupOldExpiraionDate(String acupOldExpiraionDate) {
        this.acupOldExpiraionDate = acupOldExpiraionDate;
    }
    
    public String getAcupOldAcctIdX() {
        return this.acupOldAcctIdX;
    }
    
    public void setAcupOldAcctIdX(String acupOldAcctIdX) {
        this.acupOldAcctIdX = acupOldAcctIdX;
    }
    
    public char getAcupOldActiveStatus() {
        return this.acupOldActiveStatus;
    }
    
    public void setAcupOldActiveStatus(char acupOldActiveStatus) {
        this.acupOldActiveStatus = acupOldActiveStatus;
    }
    
    public String getAcupOldReissueDate() {
        return this.acupOldReissueDate;
    }
    
    public void setAcupOldReissueDate(String acupOldReissueDate) {
        this.acupOldReissueDate = acupOldReissueDate;
    }
    
    public String getAcupOldCurrBal() {
        return this.acupOldCurrBal;
    }
    
    public void setAcupOldCurrBal(String acupOldCurrBal) {
        this.acupOldCurrBal = acupOldCurrBal;
    }
    
    public String getAcupOldCreditLimit() {
        return this.acupOldCreditLimit;
    }
    
    public void setAcupOldCreditLimit(String acupOldCreditLimit) {
        this.acupOldCreditLimit = acupOldCreditLimit;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupOldOpenDate=\"");
        s.append(getAcupOldOpenDate());
        s.append("\" acupOldCashCreditLimit=\"");
        s.append(getAcupOldCashCreditLimit());
        s.append("\" acupOldCurrCycCredit=\"");
        s.append(getAcupOldCurrCycCredit());
        s.append("\" acupOldCurrCycDebit=\"");
        s.append(getAcupOldCurrCycDebit());
        s.append("\" acupOldGroupId=\"");
        s.append(getAcupOldGroupId());
        s.append("\" acupOldExpiraionDate=\"");
        s.append(getAcupOldExpiraionDate());
        s.append("\" acupOldAcctIdX=\"");
        s.append(getAcupOldAcctIdX());
        s.append("\" acupOldActiveStatus=\"");
        s.append(getAcupOldActiveStatus());
        s.append("\" acupOldReissueDate=\"");
        s.append(getAcupOldReissueDate());
        s.append("\" acupOldCurrBal=\"");
        s.append(getAcupOldCurrBal());
        s.append("\" acupOldCreditLimit=\"");
        s.append(getAcupOldCreditLimit());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupOldAcctData that) {
        return this.acupOldOpenDate.equals(that.acupOldOpenDate) &&
            this.acupOldCashCreditLimit.equals(that.acupOldCashCreditLimit) &&
            this.acupOldCurrCycCredit.equals(that.acupOldCurrCycCredit) &&
            this.acupOldCurrCycDebit.equals(that.acupOldCurrCycDebit) &&
            this.acupOldGroupId.equals(that.acupOldGroupId) &&
            this.acupOldExpiraionDate.equals(that.acupOldExpiraionDate) &&
            this.acupOldAcctIdX.equals(that.acupOldAcctIdX) &&
            this.acupOldActiveStatus == that.acupOldActiveStatus &&
            this.acupOldReissueDate.equals(that.acupOldReissueDate) &&
            this.acupOldCurrBal.equals(that.acupOldCurrBal) &&
            this.acupOldCreditLimit.equals(that.acupOldCreditLimit);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupOldAcctData) && this.equals((AcupOldAcctData)that);
    }
    
    @Override
    public int hashCode() {
        return acupOldOpenDate.hashCode() ^
            Integer.rotateLeft(acupOldCashCreditLimit.hashCode(), 1) ^
            Integer.rotateLeft(acupOldCurrCycCredit.hashCode(), 2) ^
            Integer.rotateLeft(acupOldCurrCycDebit.hashCode(), 3) ^
            Integer.rotateLeft(acupOldGroupId.hashCode(), 4) ^
            Integer.rotateLeft(acupOldExpiraionDate.hashCode(), 5) ^
            Integer.rotateLeft(acupOldAcctIdX.hashCode(), 6) ^
            Integer.rotateLeft(Character.hashCode(acupOldActiveStatus), 7) ^
            Integer.rotateLeft(acupOldReissueDate.hashCode(), 8) ^
            Integer.rotateLeft(acupOldCurrBal.hashCode(), 9) ^
            Integer.rotateLeft(acupOldCreditLimit.hashCode(), 10);
    }
    
    @Override
    public int compareTo(AcupOldAcctData that) {
        int c = this.acupOldOpenDate.compareTo(that.acupOldOpenDate);
        if ( c != 0 ) return c;
        c = this.acupOldCashCreditLimit.compareTo(that.acupOldCashCreditLimit);
        if ( c != 0 ) return c;
        c = this.acupOldCurrCycCredit.compareTo(that.acupOldCurrCycCredit);
        if ( c != 0 ) return c;
        c = this.acupOldCurrCycDebit.compareTo(that.acupOldCurrCycDebit);
        if ( c != 0 ) return c;
        c = this.acupOldGroupId.compareTo(that.acupOldGroupId);
        if ( c != 0 ) return c;
        c = this.acupOldExpiraionDate.compareTo(that.acupOldExpiraionDate);
        if ( c != 0 ) return c;
        c = this.acupOldAcctIdX.compareTo(that.acupOldAcctIdX);
        if ( c != 0 ) return c;
        c = Character.compare(this.acupOldActiveStatus, that.acupOldActiveStatus);
        if ( c != 0 ) return c;
        c = this.acupOldReissueDate.compareTo(that.acupOldReissueDate);
        if ( c != 0 ) return c;
        c = this.acupOldCurrBal.compareTo(that.acupOldCurrBal);
        if ( c != 0 ) return c;
        c = this.acupOldCreditLimit.compareTo(that.acupOldCreditLimit);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPOLDOPENDATE.putString(acupOldOpenDate, bytes, offset);
        ACUPOLDCASHCREDITLIMIT.putString(acupOldCashCreditLimit, bytes, offset);
        ACUPOLDCURRCYCCREDIT.putString(acupOldCurrCycCredit, bytes, offset);
        ACUPOLDCURRCYCDEBIT.putString(acupOldCurrCycDebit, bytes, offset);
        ACUPOLDGROUPID.putString(acupOldGroupId, bytes, offset);
        ACUPOLDEXPIRAIONDATE.putString(acupOldExpiraionDate, bytes, offset);
        ACUPOLDACCTIDX.putString(acupOldAcctIdX, bytes, offset);
        ACUPOLDACTIVESTATUS.putString(acupOldActiveStatus, bytes, offset);
        ACUPOLDREISSUEDATE.putString(acupOldReissueDate, bytes, offset);
        ACUPOLDCURRBAL.putString(acupOldCurrBal, bytes, offset);
        ACUPOLDCREDITLIMIT.putString(acupOldCreditLimit, bytes, offset);
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
        acupOldOpenDate = ACUPOLDOPENDATE.getString(bytes, offset);
        acupOldCashCreditLimit = ACUPOLDCASHCREDITLIMIT.getString(bytes, offset);
        acupOldCurrCycCredit = ACUPOLDCURRCYCCREDIT.getString(bytes, offset);
        acupOldCurrCycDebit = ACUPOLDCURRCYCDEBIT.getString(bytes, offset);
        acupOldGroupId = ACUPOLDGROUPID.getString(bytes, offset);
        acupOldExpiraionDate = ACUPOLDEXPIRAIONDATE.getString(bytes, offset);
        acupOldAcctIdX = ACUPOLDACCTIDX.getString(bytes, offset);
        acupOldActiveStatus = ACUPOLDACTIVESTATUS.getString(bytes, offset);
        acupOldReissueDate = ACUPOLDREISSUEDATE.getString(bytes, offset);
        acupOldCurrBal = ACUPOLDCURRBAL.getString(bytes, offset);
        acupOldCreditLimit = ACUPOLDCREDITLIMIT.getString(bytes, offset);
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
