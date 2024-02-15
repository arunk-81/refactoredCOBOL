package com.ibm.wc4az.test;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountRecord implements Comparable<AccountRecord> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsLongField ACCTID = factory.getExternalDecimalAsLongField(11, true);
    private static final StringField ACCTACTIVESTATUS = factory.getStringField(1);
    private static final ExternalDecimalAsBigDecimalField ACCTCURRBAL = factory.getExternalDecimalAsBigDecimalField(12, 2, true);
    private static final ExternalDecimalAsBigDecimalField ACCTCREDITLIMIT = factory.getExternalDecimalAsBigDecimalField(12, 2, true);
    private static final ExternalDecimalAsBigDecimalField ACCTCASHCREDITLIMIT = factory.getExternalDecimalAsBigDecimalField(12, 2, true);
    private static final StringField ACCTOPENDATE = factory.getStringField(10);
    private static final StringField ACCTEXPIRAIONDATE = factory.getStringField(10);
    private static final StringField ACCTREISSUEDATE = factory.getStringField(10);
    private static final ExternalDecimalAsBigDecimalField ACCTCURRCYCCREDIT = factory.getExternalDecimalAsBigDecimalField(12, 2, true);
    private static final ExternalDecimalAsBigDecimalField ACCTCURRCYCDEBIT = factory.getExternalDecimalAsBigDecimalField(12, 2, true);
    private static final StringField ACCTADDRZIP = factory.getStringField(10);
    private static final StringField ACCTGROUPID = factory.getStringField(10);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private long acctId;
    private char acctActiveStatus;
    private BigDecimal acctCurrBal = BigDecimal.ZERO;
    private BigDecimal acctCreditLimit = BigDecimal.ZERO;
    private BigDecimal acctCashCreditLimit = BigDecimal.ZERO;
    private String acctOpenDate = "";
    private String acctExpiraionDate = "";
    private String acctReissueDate = "";
    private BigDecimal acctCurrCycCredit = BigDecimal.ZERO;
    private BigDecimal acctCurrCycDebit = BigDecimal.ZERO;
    private String acctAddrZip = "";
    private String acctGroupId = "";
    
    public AccountRecord() {
    }
    
    public AccountRecord(long acctId, char acctActiveStatus, BigDecimal acctCurrBal, BigDecimal acctCreditLimit, BigDecimal acctCashCreditLimit, String acctOpenDate, String acctExpiraionDate, String acctReissueDate, BigDecimal acctCurrCycCredit, BigDecimal acctCurrCycDebit, String acctAddrZip, String acctGroupId) {
        this.acctId = acctId;
        this.acctActiveStatus = acctActiveStatus;
        this.acctCurrBal = acctCurrBal;
        this.acctCreditLimit = acctCreditLimit;
        this.acctCashCreditLimit = acctCashCreditLimit;
        this.acctOpenDate = acctOpenDate;
        this.acctExpiraionDate = acctExpiraionDate;
        this.acctReissueDate = acctReissueDate;
        this.acctCurrCycCredit = acctCurrCycCredit;
        this.acctCurrCycDebit = acctCurrCycDebit;
        this.acctAddrZip = acctAddrZip;
        this.acctGroupId = acctGroupId;
    }
    
    public AccountRecord(AccountRecord that) {
        this.acctId = that.acctId;
        this.acctActiveStatus = that.acctActiveStatus;
        this.acctCurrBal = that.acctCurrBal;
        this.acctCreditLimit = that.acctCreditLimit;
        this.acctCashCreditLimit = that.acctCashCreditLimit;
        this.acctOpenDate = that.acctOpenDate;
        this.acctExpiraionDate = that.acctExpiraionDate;
        this.acctReissueDate = that.acctReissueDate;
        this.acctCurrCycCredit = that.acctCurrCycCredit;
        this.acctCurrCycDebit = that.acctCurrCycDebit;
        this.acctAddrZip = that.acctAddrZip;
        this.acctGroupId = that.acctGroupId;
    }
    
    protected AccountRecord(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AccountRecord(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AccountRecord fromBytes(byte[] bytes, int offset) {
        return new AccountRecord(bytes, offset);
    }
    
    public static AccountRecord fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AccountRecord fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void displayAcctRecord1100(String[] args) {}
    
    public long getAcctId() {
        return this.acctId;
    }
    
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }
    
    public char getAcctActiveStatus() {
        return this.acctActiveStatus;
    }
    
    public void setAcctActiveStatus(char acctActiveStatus) {
        this.acctActiveStatus = acctActiveStatus;
    }
    
    public BigDecimal getAcctCurrBal() {
        return this.acctCurrBal;
    }
    
    public void setAcctCurrBal(BigDecimal acctCurrBal) {
        this.acctCurrBal = acctCurrBal;
    }
    
    public BigDecimal getAcctCreditLimit() {
        return this.acctCreditLimit;
    }
    
    public void setAcctCreditLimit(BigDecimal acctCreditLimit) {
        this.acctCreditLimit = acctCreditLimit;
    }
    
    public BigDecimal getAcctCashCreditLimit() {
        return this.acctCashCreditLimit;
    }
    
    public void setAcctCashCreditLimit(BigDecimal acctCashCreditLimit) {
        this.acctCashCreditLimit = acctCashCreditLimit;
    }
    
    public String getAcctOpenDate() {
        return this.acctOpenDate;
    }
    
    public void setAcctOpenDate(String acctOpenDate) {
        this.acctOpenDate = acctOpenDate;
    }
    
    public String getAcctExpiraionDate() {
        return this.acctExpiraionDate;
    }
    
    public void setAcctExpiraionDate(String acctExpiraionDate) {
        this.acctExpiraionDate = acctExpiraionDate;
    }
    
    public String getAcctReissueDate() {
        return this.acctReissueDate;
    }
    
    public void setAcctReissueDate(String acctReissueDate) {
        this.acctReissueDate = acctReissueDate;
    }
    
    public BigDecimal getAcctCurrCycCredit() {
        return this.acctCurrCycCredit;
    }
    
    public void setAcctCurrCycCredit(BigDecimal acctCurrCycCredit) {
        this.acctCurrCycCredit = acctCurrCycCredit;
    }
    
    public BigDecimal getAcctCurrCycDebit() {
        return this.acctCurrCycDebit;
    }
    
    public void setAcctCurrCycDebit(BigDecimal acctCurrCycDebit) {
        this.acctCurrCycDebit = acctCurrCycDebit;
    }
    
    public String getAcctAddrZip() {
        return this.acctAddrZip;
    }
    
    public void setAcctAddrZip(String acctAddrZip) {
        this.acctAddrZip = acctAddrZip;
    }
    
    public String getAcctGroupId() {
        return this.acctGroupId;
    }
    
    public void setAcctGroupId(String acctGroupId) {
        this.acctGroupId = acctGroupId;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acctId=\"");
        s.append(getAcctId());
        s.append("\" acctActiveStatus=\"");
        s.append(getAcctActiveStatus());
        s.append("\" acctCurrBal=\"");
        s.append(getAcctCurrBal());
        s.append("\" acctCreditLimit=\"");
        s.append(getAcctCreditLimit());
        s.append("\" acctCashCreditLimit=\"");
        s.append(getAcctCashCreditLimit());
        s.append("\" acctOpenDate=\"");
        s.append(getAcctOpenDate());
        s.append("\" acctExpiraionDate=\"");
        s.append(getAcctExpiraionDate());
        s.append("\" acctReissueDate=\"");
        s.append(getAcctReissueDate());
        s.append("\" acctCurrCycCredit=\"");
        s.append(getAcctCurrCycCredit());
        s.append("\" acctCurrCycDebit=\"");
        s.append(getAcctCurrCycDebit());
        s.append("\" acctAddrZip=\"");
        s.append(getAcctAddrZip());
        s.append("\" acctGroupId=\"");
        s.append(getAcctGroupId());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AccountRecord that) {
        return this.acctId == that.acctId &&
            this.acctActiveStatus == that.acctActiveStatus &&
            this.acctCurrBal.compareTo(that.acctCurrBal) == 0 &&
            this.acctCreditLimit.compareTo(that.acctCreditLimit) == 0 &&
            this.acctCashCreditLimit.compareTo(that.acctCashCreditLimit) == 0 &&
            this.acctOpenDate.equals(that.acctOpenDate) &&
            this.acctExpiraionDate.equals(that.acctExpiraionDate) &&
            this.acctReissueDate.equals(that.acctReissueDate) &&
            this.acctCurrCycCredit.compareTo(that.acctCurrCycCredit) == 0 &&
            this.acctCurrCycDebit.compareTo(that.acctCurrCycDebit) == 0 &&
            this.acctAddrZip.equals(that.acctAddrZip) &&
            this.acctGroupId.equals(that.acctGroupId);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AccountRecord) && this.equals((AccountRecord)that);
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(acctId) ^
            Integer.rotateLeft(Character.hashCode(acctActiveStatus), 1) ^
            Integer.rotateLeft(acctCurrBal.unscaledValue().hashCode(), 2) ^
            Integer.rotateLeft(acctCreditLimit.unscaledValue().hashCode(), 3) ^
            Integer.rotateLeft(acctCashCreditLimit.unscaledValue().hashCode(), 4) ^
            Integer.rotateLeft(acctOpenDate.hashCode(), 5) ^
            Integer.rotateLeft(acctExpiraionDate.hashCode(), 6) ^
            Integer.rotateLeft(acctReissueDate.hashCode(), 7) ^
            Integer.rotateLeft(acctCurrCycCredit.unscaledValue().hashCode(), 8) ^
            Integer.rotateLeft(acctCurrCycDebit.unscaledValue().hashCode(), 9) ^
            Integer.rotateLeft(acctAddrZip.hashCode(), 10) ^
            Integer.rotateLeft(acctGroupId.hashCode(), 11);
    }
    
    @Override
    public int compareTo(AccountRecord that) {
        int c = Long.compare(this.acctId, that.acctId);
        if ( c != 0 ) return c;
        c = Character.compare(this.acctActiveStatus, that.acctActiveStatus);
        if ( c != 0 ) return c;
        c = this.acctCurrBal.compareTo(that.acctCurrBal);
        if ( c != 0 ) return c;
        c = this.acctCreditLimit.compareTo(that.acctCreditLimit);
        if ( c != 0 ) return c;
        c = this.acctCashCreditLimit.compareTo(that.acctCashCreditLimit);
        if ( c != 0 ) return c;
        c = this.acctOpenDate.compareTo(that.acctOpenDate);
        if ( c != 0 ) return c;
        c = this.acctExpiraionDate.compareTo(that.acctExpiraionDate);
        if ( c != 0 ) return c;
        c = this.acctReissueDate.compareTo(that.acctReissueDate);
        if ( c != 0 ) return c;
        c = this.acctCurrCycCredit.compareTo(that.acctCurrCycCredit);
        if ( c != 0 ) return c;
        c = this.acctCurrCycDebit.compareTo(that.acctCurrCycDebit);
        if ( c != 0 ) return c;
        c = this.acctAddrZip.compareTo(that.acctAddrZip);
        if ( c != 0 ) return c;
        c = this.acctGroupId.compareTo(that.acctGroupId);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACCTID.putLong(acctId, bytes, offset);
        ACCTACTIVESTATUS.putString(acctActiveStatus, bytes, offset);
        ACCTCURRBAL.putBigDecimal(acctCurrBal, bytes, offset);
        ACCTCREDITLIMIT.putBigDecimal(acctCreditLimit, bytes, offset);
        ACCTCASHCREDITLIMIT.putBigDecimal(acctCashCreditLimit, bytes, offset);
        ACCTOPENDATE.putString(acctOpenDate, bytes, offset);
        ACCTEXPIRAIONDATE.putString(acctExpiraionDate, bytes, offset);
        ACCTREISSUEDATE.putString(acctReissueDate, bytes, offset);
        ACCTCURRCYCCREDIT.putBigDecimal(acctCurrCycCredit, bytes, offset);
        ACCTCURRCYCDEBIT.putBigDecimal(acctCurrCycDebit, bytes, offset);
        ACCTADDRZIP.putString(acctAddrZip, bytes, offset);
        ACCTGROUPID.putString(acctGroupId, bytes, offset);
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
        acctId = ACCTID.getLong(bytes, offset);
        acctActiveStatus = ACCTACTIVESTATUS.getString(bytes, offset);
        acctCurrBal = ACCTCURRBAL.getBigDecimal(bytes, offset);
        acctCreditLimit = ACCTCREDITLIMIT.getBigDecimal(bytes, offset);
        acctCashCreditLimit = ACCTCASHCREDITLIMIT.getBigDecimal(bytes, offset);
        acctOpenDate = ACCTOPENDATE.getString(bytes, offset);
        acctExpiraionDate = ACCTEXPIRAIONDATE.getString(bytes, offset);
        acctReissueDate = ACCTREISSUEDATE.getString(bytes, offset);
        acctCurrCycCredit = ACCTCURRCYCCREDIT.getBigDecimal(bytes, offset);
        acctCurrCycDebit = ACCTCURRCYCDEBIT.getBigDecimal(bytes, offset);
        acctAddrZip = ACCTADDRZIP.getString(bytes, offset);
        acctGroupId = ACCTGROUPID.getString(bytes, offset);
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
