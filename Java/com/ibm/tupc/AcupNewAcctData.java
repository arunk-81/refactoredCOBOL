package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewAcctData implements Comparable<AcupNewAcctData> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPNEWEXPIRAIONDATE = factory.getStringField(8);
    private static final StringField ACUPNEWACCTIDX = factory.getStringField(11);
    private static final StringField ACUPNEWACTIVESTATUS = factory.getStringField(1);
    private static final StringField ACUPNEWCURRBAL = factory.getStringField(12);
    private static final StringField ACUPNEWREISSUEDATE = factory.getStringField(8);
    private static final StringField ACUPNEWCREDITLIMIT = factory.getStringField(12);
    private static final StringField ACUPNEWCASHCREDITLIMIT = factory.getStringField(12);
    private static final StringField ACUPNEWCURRCYCCREDIT = factory.getStringField(12);
    private static final StringField ACUPNEWOPENDATE = factory.getStringField(8);
    private static final StringField ACUPNEWCURRCYCDEBIT = factory.getStringField(12);
    private static final StringField ACUPNEWGROUPID = factory.getStringField(10);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupNewExpiraionDate = "";
    private String acupNewAcctIdX = "";
    private char acupNewActiveStatus;
    private String acupNewCurrBal = "";
    private String acupNewReissueDate = "";
    private String acupNewCreditLimit = "";
    private String acupNewCashCreditLimit = "";
    private String acupNewCurrCycCredit = "";
    private String acupNewOpenDate = "";
    private String acupNewCurrCycDebit = "";
    private String acupNewGroupId = "";
    
    public AcupNewAcctData() {
    }
    
    public AcupNewAcctData(String acupNewExpiraionDate, String acupNewAcctIdX, char acupNewActiveStatus, String acupNewCurrBal, String acupNewReissueDate, String acupNewCreditLimit, String acupNewCashCreditLimit, String acupNewCurrCycCredit, String acupNewOpenDate, String acupNewCurrCycDebit, String acupNewGroupId) {
        this.acupNewExpiraionDate = acupNewExpiraionDate;
        this.acupNewAcctIdX = acupNewAcctIdX;
        this.acupNewActiveStatus = acupNewActiveStatus;
        this.acupNewCurrBal = acupNewCurrBal;
        this.acupNewReissueDate = acupNewReissueDate;
        this.acupNewCreditLimit = acupNewCreditLimit;
        this.acupNewCashCreditLimit = acupNewCashCreditLimit;
        this.acupNewCurrCycCredit = acupNewCurrCycCredit;
        this.acupNewOpenDate = acupNewOpenDate;
        this.acupNewCurrCycDebit = acupNewCurrCycDebit;
        this.acupNewGroupId = acupNewGroupId;
    }
    
    public AcupNewAcctData(AcupNewAcctData that) {
        this.acupNewExpiraionDate = that.acupNewExpiraionDate;
        this.acupNewAcctIdX = that.acupNewAcctIdX;
        this.acupNewActiveStatus = that.acupNewActiveStatus;
        this.acupNewCurrBal = that.acupNewCurrBal;
        this.acupNewReissueDate = that.acupNewReissueDate;
        this.acupNewCreditLimit = that.acupNewCreditLimit;
        this.acupNewCashCreditLimit = that.acupNewCashCreditLimit;
        this.acupNewCurrCycCredit = that.acupNewCurrCycCredit;
        this.acupNewOpenDate = that.acupNewOpenDate;
        this.acupNewCurrCycDebit = that.acupNewCurrCycDebit;
        this.acupNewGroupId = that.acupNewGroupId;
    }
    
    protected AcupNewAcctData(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewAcctData(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewAcctData fromBytes(byte[] bytes, int offset) {
        return new AcupNewAcctData(bytes, offset);
    }
    
    public static AcupNewAcctData fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewAcctData fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupNewExpiraionDate() {
        return this.acupNewExpiraionDate;
    }
    
    public void setAcupNewExpiraionDate(String acupNewExpiraionDate) {
        this.acupNewExpiraionDate = acupNewExpiraionDate;
    }
    
    public String getAcupNewAcctIdX() {
        return this.acupNewAcctIdX;
    }
    
    public void setAcupNewAcctIdX(String acupNewAcctIdX) {
        this.acupNewAcctIdX = acupNewAcctIdX;
    }
    
    public char getAcupNewActiveStatus() {
        return this.acupNewActiveStatus;
    }
    
    public void setAcupNewActiveStatus(char acupNewActiveStatus) {
        this.acupNewActiveStatus = acupNewActiveStatus;
    }
    
    public String getAcupNewCurrBal() {
        return this.acupNewCurrBal;
    }
    
    public void setAcupNewCurrBal(String acupNewCurrBal) {
        this.acupNewCurrBal = acupNewCurrBal;
    }
    
    public String getAcupNewReissueDate() {
        return this.acupNewReissueDate;
    }
    
    public void setAcupNewReissueDate(String acupNewReissueDate) {
        this.acupNewReissueDate = acupNewReissueDate;
    }
    
    public String getAcupNewCreditLimit() {
        return this.acupNewCreditLimit;
    }
    
    public void setAcupNewCreditLimit(String acupNewCreditLimit) {
        this.acupNewCreditLimit = acupNewCreditLimit;
    }
    
    public String getAcupNewCashCreditLimit() {
        return this.acupNewCashCreditLimit;
    }
    
    public void setAcupNewCashCreditLimit(String acupNewCashCreditLimit) {
        this.acupNewCashCreditLimit = acupNewCashCreditLimit;
    }
    
    public String getAcupNewCurrCycCredit() {
        return this.acupNewCurrCycCredit;
    }
    
    public void setAcupNewCurrCycCredit(String acupNewCurrCycCredit) {
        this.acupNewCurrCycCredit = acupNewCurrCycCredit;
    }
    
    public String getAcupNewOpenDate() {
        return this.acupNewOpenDate;
    }
    
    public void setAcupNewOpenDate(String acupNewOpenDate) {
        this.acupNewOpenDate = acupNewOpenDate;
    }
    
    public String getAcupNewCurrCycDebit() {
        return this.acupNewCurrCycDebit;
    }
    
    public void setAcupNewCurrCycDebit(String acupNewCurrCycDebit) {
        this.acupNewCurrCycDebit = acupNewCurrCycDebit;
    }
    
    public String getAcupNewGroupId() {
        return this.acupNewGroupId;
    }
    
    public void setAcupNewGroupId(String acupNewGroupId) {
        this.acupNewGroupId = acupNewGroupId;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewExpiraionDate=\"");
        s.append(getAcupNewExpiraionDate());
        s.append("\" acupNewAcctIdX=\"");
        s.append(getAcupNewAcctIdX());
        s.append("\" acupNewActiveStatus=\"");
        s.append(getAcupNewActiveStatus());
        s.append("\" acupNewCurrBal=\"");
        s.append(getAcupNewCurrBal());
        s.append("\" acupNewReissueDate=\"");
        s.append(getAcupNewReissueDate());
        s.append("\" acupNewCreditLimit=\"");
        s.append(getAcupNewCreditLimit());
        s.append("\" acupNewCashCreditLimit=\"");
        s.append(getAcupNewCashCreditLimit());
        s.append("\" acupNewCurrCycCredit=\"");
        s.append(getAcupNewCurrCycCredit());
        s.append("\" acupNewOpenDate=\"");
        s.append(getAcupNewOpenDate());
        s.append("\" acupNewCurrCycDebit=\"");
        s.append(getAcupNewCurrCycDebit());
        s.append("\" acupNewGroupId=\"");
        s.append(getAcupNewGroupId());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewAcctData that) {
        return this.acupNewExpiraionDate.equals(that.acupNewExpiraionDate) &&
            this.acupNewAcctIdX.equals(that.acupNewAcctIdX) &&
            this.acupNewActiveStatus == that.acupNewActiveStatus &&
            this.acupNewCurrBal.equals(that.acupNewCurrBal) &&
            this.acupNewReissueDate.equals(that.acupNewReissueDate) &&
            this.acupNewCreditLimit.equals(that.acupNewCreditLimit) &&
            this.acupNewCashCreditLimit.equals(that.acupNewCashCreditLimit) &&
            this.acupNewCurrCycCredit.equals(that.acupNewCurrCycCredit) &&
            this.acupNewOpenDate.equals(that.acupNewOpenDate) &&
            this.acupNewCurrCycDebit.equals(that.acupNewCurrCycDebit) &&
            this.acupNewGroupId.equals(that.acupNewGroupId);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewAcctData) && this.equals((AcupNewAcctData)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewExpiraionDate.hashCode() ^
            Integer.rotateLeft(acupNewAcctIdX.hashCode(), 1) ^
            Integer.rotateLeft(Character.hashCode(acupNewActiveStatus), 2) ^
            Integer.rotateLeft(acupNewCurrBal.hashCode(), 3) ^
            Integer.rotateLeft(acupNewReissueDate.hashCode(), 4) ^
            Integer.rotateLeft(acupNewCreditLimit.hashCode(), 5) ^
            Integer.rotateLeft(acupNewCashCreditLimit.hashCode(), 6) ^
            Integer.rotateLeft(acupNewCurrCycCredit.hashCode(), 7) ^
            Integer.rotateLeft(acupNewOpenDate.hashCode(), 8) ^
            Integer.rotateLeft(acupNewCurrCycDebit.hashCode(), 9) ^
            Integer.rotateLeft(acupNewGroupId.hashCode(), 10);
    }
    
    @Override
    public int compareTo(AcupNewAcctData that) {
        int c = this.acupNewExpiraionDate.compareTo(that.acupNewExpiraionDate);
        if ( c != 0 ) return c;
        c = this.acupNewAcctIdX.compareTo(that.acupNewAcctIdX);
        if ( c != 0 ) return c;
        c = Character.compare(this.acupNewActiveStatus, that.acupNewActiveStatus);
        if ( c != 0 ) return c;
        c = this.acupNewCurrBal.compareTo(that.acupNewCurrBal);
        if ( c != 0 ) return c;
        c = this.acupNewReissueDate.compareTo(that.acupNewReissueDate);
        if ( c != 0 ) return c;
        c = this.acupNewCreditLimit.compareTo(that.acupNewCreditLimit);
        if ( c != 0 ) return c;
        c = this.acupNewCashCreditLimit.compareTo(that.acupNewCashCreditLimit);
        if ( c != 0 ) return c;
        c = this.acupNewCurrCycCredit.compareTo(that.acupNewCurrCycCredit);
        if ( c != 0 ) return c;
        c = this.acupNewOpenDate.compareTo(that.acupNewOpenDate);
        if ( c != 0 ) return c;
        c = this.acupNewCurrCycDebit.compareTo(that.acupNewCurrCycDebit);
        if ( c != 0 ) return c;
        c = this.acupNewGroupId.compareTo(that.acupNewGroupId);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPNEWEXPIRAIONDATE.putString(acupNewExpiraionDate, bytes, offset);
        ACUPNEWACCTIDX.putString(acupNewAcctIdX, bytes, offset);
        ACUPNEWACTIVESTATUS.putString(acupNewActiveStatus, bytes, offset);
        ACUPNEWCURRBAL.putString(acupNewCurrBal, bytes, offset);
        ACUPNEWREISSUEDATE.putString(acupNewReissueDate, bytes, offset);
        ACUPNEWCREDITLIMIT.putString(acupNewCreditLimit, bytes, offset);
        ACUPNEWCASHCREDITLIMIT.putString(acupNewCashCreditLimit, bytes, offset);
        ACUPNEWCURRCYCCREDIT.putString(acupNewCurrCycCredit, bytes, offset);
        ACUPNEWOPENDATE.putString(acupNewOpenDate, bytes, offset);
        ACUPNEWCURRCYCDEBIT.putString(acupNewCurrCycDebit, bytes, offset);
        ACUPNEWGROUPID.putString(acupNewGroupId, bytes, offset);
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
        acupNewExpiraionDate = ACUPNEWEXPIRAIONDATE.getString(bytes, offset);
        acupNewAcctIdX = ACUPNEWACCTIDX.getString(bytes, offset);
        acupNewActiveStatus = ACUPNEWACTIVESTATUS.getString(bytes, offset);
        acupNewCurrBal = ACUPNEWCURRBAL.getString(bytes, offset);
        acupNewReissueDate = ACUPNEWREISSUEDATE.getString(bytes, offset);
        acupNewCreditLimit = ACUPNEWCREDITLIMIT.getString(bytes, offset);
        acupNewCashCreditLimit = ACUPNEWCASHCREDITLIMIT.getString(bytes, offset);
        acupNewCurrCycCredit = ACUPNEWCURRCYCCREDIT.getString(bytes, offset);
        acupNewOpenDate = ACUPNEWOPENDATE.getString(bytes, offset);
        acupNewCurrCycDebit = ACUPNEWCURRCYCDEBIT.getString(bytes, offset);
        acupNewGroupId = ACUPNEWGROUPID.getString(bytes, offset);
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
