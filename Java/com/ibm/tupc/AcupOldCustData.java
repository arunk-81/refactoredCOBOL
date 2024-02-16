package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupOldCustData implements Comparable<AcupOldCustData> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPOLDCUSTADDRCOUNTRYCD = factory.getStringField(3);
    private static final StringField ACUPOLDCUSTADDRZIP = factory.getStringField(10);
    private static final ByteArrayField ACUPOLDCUSTPHONENUM1X = factory.getByteArrayField(AcupOldCustPhoneNum1X.SIZE);
    private static final ByteArrayField ACUPOLDCUSTPHONENUM2X = factory.getByteArrayField(AcupOldCustPhoneNum2X.SIZE);
    private static final StringField ACUPOLDCUSTSSNX = factory.getStringField(9);
    private static final StringField ACUPOLDCUSTGOVTISSUEDID = factory.getStringField(20);
    private static final StringField ACUPOLDCUSTIDX = factory.getStringField(9);
    private static final StringField ACUPOLDCUSTDOBYYYYMMDD = factory.getStringField(8);
    private static final StringField ACUPOLDCUSTFIRSTNAME = factory.getStringField(25);
    private static final StringField ACUPOLDCUSTMIDDLENAME = factory.getStringField(25);
    private static final StringField ACUPOLDCUSTLASTNAME = factory.getStringField(25);
    private static final StringField ACUPOLDCUSTADDRLINE1 = factory.getStringField(50);
    private static final StringField ACUPOLDCUSTEFTACCOUNTID = factory.getStringField(10);
    private static final StringField ACUPOLDCUSTADDRLINE2 = factory.getStringField(50);
    private static final StringField ACUPOLDCUSTPRIHOLDERIND = factory.getStringField(1);
    private static final StringField ACUPOLDCUSTADDRLINE3 = factory.getStringField(50);
    private static final StringField ACUPOLDCUSTFICOSCOREX = factory.getStringField(3);
    private static final StringField ACUPOLDCUSTADDRSTATECD = factory.getStringField(2);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupOldCustAddrCountryCd = "";
    private String acupOldCustAddrZip = "";
    private AcupOldCustPhoneNum1X acupOldCustPhoneNum1X = new AcupOldCustPhoneNum1X();
    private AcupOldCustPhoneNum2X acupOldCustPhoneNum2X = new AcupOldCustPhoneNum2X();
    private String acupOldCustSsnX = "";
    private String acupOldCustGovtIssuedId = "";
    private String acupOldCustIdX = "";
    private String acupOldCustDobYyyyMmDd = "";
    private String acupOldCustFirstName = "";
    private String acupOldCustMiddleName = "";
    private String acupOldCustLastName = "";
    private String acupOldCustAddrLine1 = "";
    private String acupOldCustEftAccountId = "";
    private String acupOldCustAddrLine2 = "";
    private char acupOldCustPriHolderInd;
    private String acupOldCustAddrLine3 = "";
    private String acupOldCustFicoScoreX = "";
    private String acupOldCustAddrStateCd = "";
    
    public AcupOldCustData() {
    }
    
    public AcupOldCustData(String acupOldCustAddrCountryCd, String acupOldCustAddrZip, AcupOldCustPhoneNum1X acupOldCustPhoneNum1X, AcupOldCustPhoneNum2X acupOldCustPhoneNum2X, String acupOldCustSsnX, String acupOldCustGovtIssuedId, String acupOldCustIdX, String acupOldCustDobYyyyMmDd, String acupOldCustFirstName, String acupOldCustMiddleName, String acupOldCustLastName, String acupOldCustAddrLine1, String acupOldCustEftAccountId, String acupOldCustAddrLine2, char acupOldCustPriHolderInd, String acupOldCustAddrLine3, String acupOldCustFicoScoreX, String acupOldCustAddrStateCd) {
        this.acupOldCustAddrCountryCd = acupOldCustAddrCountryCd;
        this.acupOldCustAddrZip = acupOldCustAddrZip;
        this.acupOldCustPhoneNum1X = acupOldCustPhoneNum1X;
        this.acupOldCustPhoneNum2X = acupOldCustPhoneNum2X;
        this.acupOldCustSsnX = acupOldCustSsnX;
        this.acupOldCustGovtIssuedId = acupOldCustGovtIssuedId;
        this.acupOldCustIdX = acupOldCustIdX;
        this.acupOldCustDobYyyyMmDd = acupOldCustDobYyyyMmDd;
        this.acupOldCustFirstName = acupOldCustFirstName;
        this.acupOldCustMiddleName = acupOldCustMiddleName;
        this.acupOldCustLastName = acupOldCustLastName;
        this.acupOldCustAddrLine1 = acupOldCustAddrLine1;
        this.acupOldCustEftAccountId = acupOldCustEftAccountId;
        this.acupOldCustAddrLine2 = acupOldCustAddrLine2;
        this.acupOldCustPriHolderInd = acupOldCustPriHolderInd;
        this.acupOldCustAddrLine3 = acupOldCustAddrLine3;
        this.acupOldCustFicoScoreX = acupOldCustFicoScoreX;
        this.acupOldCustAddrStateCd = acupOldCustAddrStateCd;
    }
    
    public AcupOldCustData(AcupOldCustData that) {
        this.acupOldCustAddrCountryCd = that.acupOldCustAddrCountryCd;
        this.acupOldCustAddrZip = that.acupOldCustAddrZip;
        this.acupOldCustPhoneNum1X = new AcupOldCustPhoneNum1X(that.acupOldCustPhoneNum1X);
        this.acupOldCustPhoneNum2X = new AcupOldCustPhoneNum2X(that.acupOldCustPhoneNum2X);
        this.acupOldCustSsnX = that.acupOldCustSsnX;
        this.acupOldCustGovtIssuedId = that.acupOldCustGovtIssuedId;
        this.acupOldCustIdX = that.acupOldCustIdX;
        this.acupOldCustDobYyyyMmDd = that.acupOldCustDobYyyyMmDd;
        this.acupOldCustFirstName = that.acupOldCustFirstName;
        this.acupOldCustMiddleName = that.acupOldCustMiddleName;
        this.acupOldCustLastName = that.acupOldCustLastName;
        this.acupOldCustAddrLine1 = that.acupOldCustAddrLine1;
        this.acupOldCustEftAccountId = that.acupOldCustEftAccountId;
        this.acupOldCustAddrLine2 = that.acupOldCustAddrLine2;
        this.acupOldCustPriHolderInd = that.acupOldCustPriHolderInd;
        this.acupOldCustAddrLine3 = that.acupOldCustAddrLine3;
        this.acupOldCustFicoScoreX = that.acupOldCustFicoScoreX;
        this.acupOldCustAddrStateCd = that.acupOldCustAddrStateCd;
    }
    
    protected AcupOldCustData(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupOldCustData(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupOldCustData fromBytes(byte[] bytes, int offset) {
        return new AcupOldCustData(bytes, offset);
    }
    
    public static AcupOldCustData fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupOldCustData fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupOldCustAddrCountryCd() {
        return this.acupOldCustAddrCountryCd;
    }
    
    public void setAcupOldCustAddrCountryCd(String acupOldCustAddrCountryCd) {
        this.acupOldCustAddrCountryCd = acupOldCustAddrCountryCd;
    }
    
    public String getAcupOldCustAddrZip() {
        return this.acupOldCustAddrZip;
    }
    
    public void setAcupOldCustAddrZip(String acupOldCustAddrZip) {
        this.acupOldCustAddrZip = acupOldCustAddrZip;
    }
    
    public AcupOldCustPhoneNum1X getAcupOldCustPhoneNum1X() {
        return this.acupOldCustPhoneNum1X;
    }
    
    public void setAcupOldCustPhoneNum1X(AcupOldCustPhoneNum1X acupOldCustPhoneNum1X) {
        this.acupOldCustPhoneNum1X = acupOldCustPhoneNum1X;
    }
    
    public AcupOldCustPhoneNum2X getAcupOldCustPhoneNum2X() {
        return this.acupOldCustPhoneNum2X;
    }
    
    public void setAcupOldCustPhoneNum2X(AcupOldCustPhoneNum2X acupOldCustPhoneNum2X) {
        this.acupOldCustPhoneNum2X = acupOldCustPhoneNum2X;
    }
    
    public String getAcupOldCustSsnX() {
        return this.acupOldCustSsnX;
    }
    
    public void setAcupOldCustSsnX(String acupOldCustSsnX) {
        this.acupOldCustSsnX = acupOldCustSsnX;
    }
    
    public String getAcupOldCustGovtIssuedId() {
        return this.acupOldCustGovtIssuedId;
    }
    
    public void setAcupOldCustGovtIssuedId(String acupOldCustGovtIssuedId) {
        this.acupOldCustGovtIssuedId = acupOldCustGovtIssuedId;
    }
    
    public String getAcupOldCustIdX() {
        return this.acupOldCustIdX;
    }
    
    public void setAcupOldCustIdX(String acupOldCustIdX) {
        this.acupOldCustIdX = acupOldCustIdX;
    }
    
    public String getAcupOldCustDobYyyyMmDd() {
        return this.acupOldCustDobYyyyMmDd;
    }
    
    public void setAcupOldCustDobYyyyMmDd(String acupOldCustDobYyyyMmDd) {
        this.acupOldCustDobYyyyMmDd = acupOldCustDobYyyyMmDd;
    }
    
    public String getAcupOldCustFirstName() {
        return this.acupOldCustFirstName;
    }
    
    public void setAcupOldCustFirstName(String acupOldCustFirstName) {
        this.acupOldCustFirstName = acupOldCustFirstName;
    }
    
    public String getAcupOldCustMiddleName() {
        return this.acupOldCustMiddleName;
    }
    
    public void setAcupOldCustMiddleName(String acupOldCustMiddleName) {
        this.acupOldCustMiddleName = acupOldCustMiddleName;
    }
    
    public String getAcupOldCustLastName() {
        return this.acupOldCustLastName;
    }
    
    public void setAcupOldCustLastName(String acupOldCustLastName) {
        this.acupOldCustLastName = acupOldCustLastName;
    }
    
    public String getAcupOldCustAddrLine1() {
        return this.acupOldCustAddrLine1;
    }
    
    public void setAcupOldCustAddrLine1(String acupOldCustAddrLine1) {
        this.acupOldCustAddrLine1 = acupOldCustAddrLine1;
    }
    
    public String getAcupOldCustEftAccountId() {
        return this.acupOldCustEftAccountId;
    }
    
    public void setAcupOldCustEftAccountId(String acupOldCustEftAccountId) {
        this.acupOldCustEftAccountId = acupOldCustEftAccountId;
    }
    
    public String getAcupOldCustAddrLine2() {
        return this.acupOldCustAddrLine2;
    }
    
    public void setAcupOldCustAddrLine2(String acupOldCustAddrLine2) {
        this.acupOldCustAddrLine2 = acupOldCustAddrLine2;
    }
    
    public char getAcupOldCustPriHolderInd() {
        return this.acupOldCustPriHolderInd;
    }
    
    public void setAcupOldCustPriHolderInd(char acupOldCustPriHolderInd) {
        this.acupOldCustPriHolderInd = acupOldCustPriHolderInd;
    }
    
    public String getAcupOldCustAddrLine3() {
        return this.acupOldCustAddrLine3;
    }
    
    public void setAcupOldCustAddrLine3(String acupOldCustAddrLine3) {
        this.acupOldCustAddrLine3 = acupOldCustAddrLine3;
    }
    
    public String getAcupOldCustFicoScoreX() {
        return this.acupOldCustFicoScoreX;
    }
    
    public void setAcupOldCustFicoScoreX(String acupOldCustFicoScoreX) {
        this.acupOldCustFicoScoreX = acupOldCustFicoScoreX;
    }
    
    public String getAcupOldCustAddrStateCd() {
        return this.acupOldCustAddrStateCd;
    }
    
    public void setAcupOldCustAddrStateCd(String acupOldCustAddrStateCd) {
        this.acupOldCustAddrStateCd = acupOldCustAddrStateCd;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupOldCustAddrCountryCd=\"");
        s.append(getAcupOldCustAddrCountryCd());
        s.append("\" acupOldCustAddrZip=\"");
        s.append(getAcupOldCustAddrZip());
        s.append("\" acupOldCustPhoneNum1X=\"");
        s.append(getAcupOldCustPhoneNum1X());
        s.append("\" acupOldCustPhoneNum2X=\"");
        s.append(getAcupOldCustPhoneNum2X());
        s.append("\" acupOldCustSsnX=\"");
        s.append(getAcupOldCustSsnX());
        s.append("\" acupOldCustGovtIssuedId=\"");
        s.append(getAcupOldCustGovtIssuedId());
        s.append("\" acupOldCustIdX=\"");
        s.append(getAcupOldCustIdX());
        s.append("\" acupOldCustDobYyyyMmDd=\"");
        s.append(getAcupOldCustDobYyyyMmDd());
        s.append("\" acupOldCustFirstName=\"");
        s.append(getAcupOldCustFirstName());
        s.append("\" acupOldCustMiddleName=\"");
        s.append(getAcupOldCustMiddleName());
        s.append("\" acupOldCustLastName=\"");
        s.append(getAcupOldCustLastName());
        s.append("\" acupOldCustAddrLine1=\"");
        s.append(getAcupOldCustAddrLine1());
        s.append("\" acupOldCustEftAccountId=\"");
        s.append(getAcupOldCustEftAccountId());
        s.append("\" acupOldCustAddrLine2=\"");
        s.append(getAcupOldCustAddrLine2());
        s.append("\" acupOldCustPriHolderInd=\"");
        s.append(getAcupOldCustPriHolderInd());
        s.append("\" acupOldCustAddrLine3=\"");
        s.append(getAcupOldCustAddrLine3());
        s.append("\" acupOldCustFicoScoreX=\"");
        s.append(getAcupOldCustFicoScoreX());
        s.append("\" acupOldCustAddrStateCd=\"");
        s.append(getAcupOldCustAddrStateCd());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupOldCustData that) {
        return this.acupOldCustAddrCountryCd.equals(that.acupOldCustAddrCountryCd) &&
            this.acupOldCustAddrZip.equals(that.acupOldCustAddrZip) &&
            this.acupOldCustPhoneNum1X.equals(that.acupOldCustPhoneNum1X) &&
            this.acupOldCustPhoneNum2X.equals(that.acupOldCustPhoneNum2X) &&
            this.acupOldCustSsnX.equals(that.acupOldCustSsnX) &&
            this.acupOldCustGovtIssuedId.equals(that.acupOldCustGovtIssuedId) &&
            this.acupOldCustIdX.equals(that.acupOldCustIdX) &&
            this.acupOldCustDobYyyyMmDd.equals(that.acupOldCustDobYyyyMmDd) &&
            this.acupOldCustFirstName.equals(that.acupOldCustFirstName) &&
            this.acupOldCustMiddleName.equals(that.acupOldCustMiddleName) &&
            this.acupOldCustLastName.equals(that.acupOldCustLastName) &&
            this.acupOldCustAddrLine1.equals(that.acupOldCustAddrLine1) &&
            this.acupOldCustEftAccountId.equals(that.acupOldCustEftAccountId) &&
            this.acupOldCustAddrLine2.equals(that.acupOldCustAddrLine2) &&
            this.acupOldCustPriHolderInd == that.acupOldCustPriHolderInd &&
            this.acupOldCustAddrLine3.equals(that.acupOldCustAddrLine3) &&
            this.acupOldCustFicoScoreX.equals(that.acupOldCustFicoScoreX) &&
            this.acupOldCustAddrStateCd.equals(that.acupOldCustAddrStateCd);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupOldCustData) && this.equals((AcupOldCustData)that);
    }
    
    @Override
    public int hashCode() {
        return acupOldCustAddrCountryCd.hashCode() ^
            Integer.rotateLeft(acupOldCustAddrZip.hashCode(), 1) ^
            Integer.rotateLeft(acupOldCustPhoneNum1X.hashCode(), 2) ^
            Integer.rotateLeft(acupOldCustPhoneNum2X.hashCode(), 3) ^
            Integer.rotateLeft(acupOldCustSsnX.hashCode(), 4) ^
            Integer.rotateLeft(acupOldCustGovtIssuedId.hashCode(), 5) ^
            Integer.rotateLeft(acupOldCustIdX.hashCode(), 6) ^
            Integer.rotateLeft(acupOldCustDobYyyyMmDd.hashCode(), 7) ^
            Integer.rotateLeft(acupOldCustFirstName.hashCode(), 8) ^
            Integer.rotateLeft(acupOldCustMiddleName.hashCode(), 9) ^
            Integer.rotateLeft(acupOldCustLastName.hashCode(), 10) ^
            Integer.rotateLeft(acupOldCustAddrLine1.hashCode(), 11) ^
            Integer.rotateLeft(acupOldCustEftAccountId.hashCode(), 12) ^
            Integer.rotateLeft(acupOldCustAddrLine2.hashCode(), 13) ^
            Integer.rotateLeft(Character.hashCode(acupOldCustPriHolderInd), 14) ^
            Integer.rotateLeft(acupOldCustAddrLine3.hashCode(), 15) ^
            Integer.rotateLeft(acupOldCustFicoScoreX.hashCode(), 16) ^
            Integer.rotateLeft(acupOldCustAddrStateCd.hashCode(), 17);
    }
    
    @Override
    public int compareTo(AcupOldCustData that) {
        int c = this.acupOldCustAddrCountryCd.compareTo(that.acupOldCustAddrCountryCd);
        if ( c != 0 ) return c;
        c = this.acupOldCustAddrZip.compareTo(that.acupOldCustAddrZip);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum1X.compareTo(that.acupOldCustPhoneNum1X);
        if ( c != 0 ) return c;
        c = this.acupOldCustPhoneNum2X.compareTo(that.acupOldCustPhoneNum2X);
        if ( c != 0 ) return c;
        c = this.acupOldCustSsnX.compareTo(that.acupOldCustSsnX);
        if ( c != 0 ) return c;
        c = this.acupOldCustGovtIssuedId.compareTo(that.acupOldCustGovtIssuedId);
        if ( c != 0 ) return c;
        c = this.acupOldCustIdX.compareTo(that.acupOldCustIdX);
        if ( c != 0 ) return c;
        c = this.acupOldCustDobYyyyMmDd.compareTo(that.acupOldCustDobYyyyMmDd);
        if ( c != 0 ) return c;
        c = this.acupOldCustFirstName.compareTo(that.acupOldCustFirstName);
        if ( c != 0 ) return c;
        c = this.acupOldCustMiddleName.compareTo(that.acupOldCustMiddleName);
        if ( c != 0 ) return c;
        c = this.acupOldCustLastName.compareTo(that.acupOldCustLastName);
        if ( c != 0 ) return c;
        c = this.acupOldCustAddrLine1.compareTo(that.acupOldCustAddrLine1);
        if ( c != 0 ) return c;
        c = this.acupOldCustEftAccountId.compareTo(that.acupOldCustEftAccountId);
        if ( c != 0 ) return c;
        c = this.acupOldCustAddrLine2.compareTo(that.acupOldCustAddrLine2);
        if ( c != 0 ) return c;
        c = Character.compare(this.acupOldCustPriHolderInd, that.acupOldCustPriHolderInd);
        if ( c != 0 ) return c;
        c = this.acupOldCustAddrLine3.compareTo(that.acupOldCustAddrLine3);
        if ( c != 0 ) return c;
        c = this.acupOldCustFicoScoreX.compareTo(that.acupOldCustFicoScoreX);
        if ( c != 0 ) return c;
        c = this.acupOldCustAddrStateCd.compareTo(that.acupOldCustAddrStateCd);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPOLDCUSTADDRCOUNTRYCD.putString(acupOldCustAddrCountryCd, bytes, offset);
        ACUPOLDCUSTADDRZIP.putString(acupOldCustAddrZip, bytes, offset);
        acupOldCustPhoneNum1X.getBytes(bytes, ACUPOLDCUSTPHONENUM1X.getOffset() + offset);
        acupOldCustPhoneNum2X.getBytes(bytes, ACUPOLDCUSTPHONENUM2X.getOffset() + offset);
        ACUPOLDCUSTSSNX.putString(acupOldCustSsnX, bytes, offset);
        ACUPOLDCUSTGOVTISSUEDID.putString(acupOldCustGovtIssuedId, bytes, offset);
        ACUPOLDCUSTIDX.putString(acupOldCustIdX, bytes, offset);
        ACUPOLDCUSTDOBYYYYMMDD.putString(acupOldCustDobYyyyMmDd, bytes, offset);
        ACUPOLDCUSTFIRSTNAME.putString(acupOldCustFirstName, bytes, offset);
        ACUPOLDCUSTMIDDLENAME.putString(acupOldCustMiddleName, bytes, offset);
        ACUPOLDCUSTLASTNAME.putString(acupOldCustLastName, bytes, offset);
        ACUPOLDCUSTADDRLINE1.putString(acupOldCustAddrLine1, bytes, offset);
        ACUPOLDCUSTEFTACCOUNTID.putString(acupOldCustEftAccountId, bytes, offset);
        ACUPOLDCUSTADDRLINE2.putString(acupOldCustAddrLine2, bytes, offset);
        ACUPOLDCUSTPRIHOLDERIND.putString(acupOldCustPriHolderInd, bytes, offset);
        ACUPOLDCUSTADDRLINE3.putString(acupOldCustAddrLine3, bytes, offset);
        ACUPOLDCUSTFICOSCOREX.putString(acupOldCustFicoScoreX, bytes, offset);
        ACUPOLDCUSTADDRSTATECD.putString(acupOldCustAddrStateCd, bytes, offset);
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
        acupOldCustAddrCountryCd = ACUPOLDCUSTADDRCOUNTRYCD.getString(bytes, offset);
        acupOldCustAddrZip = ACUPOLDCUSTADDRZIP.getString(bytes, offset);
        acupOldCustPhoneNum1X.setBytes(bytes, ACUPOLDCUSTPHONENUM1X.getOffset() + offset);
        acupOldCustPhoneNum2X.setBytes(bytes, ACUPOLDCUSTPHONENUM2X.getOffset() + offset);
        acupOldCustSsnX = ACUPOLDCUSTSSNX.getString(bytes, offset);
        acupOldCustGovtIssuedId = ACUPOLDCUSTGOVTISSUEDID.getString(bytes, offset);
        acupOldCustIdX = ACUPOLDCUSTIDX.getString(bytes, offset);
        acupOldCustDobYyyyMmDd = ACUPOLDCUSTDOBYYYYMMDD.getString(bytes, offset);
        acupOldCustFirstName = ACUPOLDCUSTFIRSTNAME.getString(bytes, offset);
        acupOldCustMiddleName = ACUPOLDCUSTMIDDLENAME.getString(bytes, offset);
        acupOldCustLastName = ACUPOLDCUSTLASTNAME.getString(bytes, offset);
        acupOldCustAddrLine1 = ACUPOLDCUSTADDRLINE1.getString(bytes, offset);
        acupOldCustEftAccountId = ACUPOLDCUSTEFTACCOUNTID.getString(bytes, offset);
        acupOldCustAddrLine2 = ACUPOLDCUSTADDRLINE2.getString(bytes, offset);
        acupOldCustPriHolderInd = ACUPOLDCUSTPRIHOLDERIND.getString(bytes, offset);
        acupOldCustAddrLine3 = ACUPOLDCUSTADDRLINE3.getString(bytes, offset);
        acupOldCustFicoScoreX = ACUPOLDCUSTFICOSCOREX.getString(bytes, offset);
        acupOldCustAddrStateCd = ACUPOLDCUSTADDRSTATECD.getString(bytes, offset);
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
