package com.ibm.tupc;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AcupNewCustData implements Comparable<AcupNewCustData> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField ACUPNEWCUSTIDX = factory.getStringField(9);
    private static final StringField ACUPNEWCUSTFIRSTNAME = factory.getStringField(25);
    private static final StringField ACUPNEWCUSTGOVTISSUEDID = factory.getStringField(20);
    private static final StringField ACUPNEWCUSTMIDDLENAME = factory.getStringField(25);
    private static final StringField ACUPNEWCUSTDOBYYYYMMDD = factory.getStringField(8);
    private static final StringField ACUPNEWCUSTLASTNAME = factory.getStringField(25);
    private static final StringField ACUPNEWCUSTADDRLINE1 = factory.getStringField(50);
    private static final StringField ACUPNEWCUSTADDRLINE2 = factory.getStringField(50);
    private static final StringField ACUPNEWCUSTADDRLINE3 = factory.getStringField(50);
    private static final StringField ACUPNEWCUSTADDRSTATECD = factory.getStringField(2);
    private static final StringField ACUPNEWCUSTEFTACCOUNTID = factory.getStringField(10);
    private static final StringField ACUPNEWCUSTADDRCOUNTRYCD = factory.getStringField(3);
    private static final StringField ACUPNEWCUSTPRIHOLDERIND = factory.getStringField(1);
    private static final StringField ACUPNEWCUSTADDRZIP = factory.getStringField(10);
    private static final StringField ACUPNEWCUSTFICOSCOREX = factory.getStringField(3);
    private static final ByteArrayField ACUPNEWCUSTPHONENUM1X = factory.getByteArrayField(AcupNewCustPhoneNum1X.SIZE);
    private static final ByteArrayField ACUPNEWCUSTPHONENUM2X = factory.getByteArrayField(AcupNewCustPhoneNum2X.SIZE);
    private static final ByteArrayField ACUPNEWCUSTSSNX = factory.getByteArrayField(AcupNewCustSsnX.SIZE);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String acupNewCustIdX = "";
    private String acupNewCustFirstName = "";
    private String acupNewCustGovtIssuedId = "";
    private String acupNewCustMiddleName = "";
    private String acupNewCustDobYyyyMmDd = "";
    private String acupNewCustLastName = "";
    private String acupNewCustAddrLine1 = "";
    private String acupNewCustAddrLine2 = "";
    private String acupNewCustAddrLine3 = "";
    private String acupNewCustAddrStateCd = "";
    private String acupNewCustEftAccountId = "";
    private String acupNewCustAddrCountryCd = "";
    private char acupNewCustPriHolderInd;
    private String acupNewCustAddrZip = "";
    private String acupNewCustFicoScoreX = "";
    private AcupNewCustPhoneNum1X acupNewCustPhoneNum1X = new AcupNewCustPhoneNum1X();
    private AcupNewCustPhoneNum2X acupNewCustPhoneNum2X = new AcupNewCustPhoneNum2X();
    private AcupNewCustSsnX acupNewCustSsnX = new AcupNewCustSsnX();
    
    public AcupNewCustData() {
    }
    
    public AcupNewCustData(String acupNewCustIdX, String acupNewCustFirstName, String acupNewCustGovtIssuedId, String acupNewCustMiddleName, String acupNewCustDobYyyyMmDd, String acupNewCustLastName, String acupNewCustAddrLine1, String acupNewCustAddrLine2, String acupNewCustAddrLine3, String acupNewCustAddrStateCd, String acupNewCustEftAccountId, String acupNewCustAddrCountryCd, char acupNewCustPriHolderInd, String acupNewCustAddrZip, String acupNewCustFicoScoreX, AcupNewCustPhoneNum1X acupNewCustPhoneNum1X, AcupNewCustPhoneNum2X acupNewCustPhoneNum2X, AcupNewCustSsnX acupNewCustSsnX) {
        this.acupNewCustIdX = acupNewCustIdX;
        this.acupNewCustFirstName = acupNewCustFirstName;
        this.acupNewCustGovtIssuedId = acupNewCustGovtIssuedId;
        this.acupNewCustMiddleName = acupNewCustMiddleName;
        this.acupNewCustDobYyyyMmDd = acupNewCustDobYyyyMmDd;
        this.acupNewCustLastName = acupNewCustLastName;
        this.acupNewCustAddrLine1 = acupNewCustAddrLine1;
        this.acupNewCustAddrLine2 = acupNewCustAddrLine2;
        this.acupNewCustAddrLine3 = acupNewCustAddrLine3;
        this.acupNewCustAddrStateCd = acupNewCustAddrStateCd;
        this.acupNewCustEftAccountId = acupNewCustEftAccountId;
        this.acupNewCustAddrCountryCd = acupNewCustAddrCountryCd;
        this.acupNewCustPriHolderInd = acupNewCustPriHolderInd;
        this.acupNewCustAddrZip = acupNewCustAddrZip;
        this.acupNewCustFicoScoreX = acupNewCustFicoScoreX;
        this.acupNewCustPhoneNum1X = acupNewCustPhoneNum1X;
        this.acupNewCustPhoneNum2X = acupNewCustPhoneNum2X;
        this.acupNewCustSsnX = acupNewCustSsnX;
    }
    
    public AcupNewCustData(AcupNewCustData that) {
        this.acupNewCustIdX = that.acupNewCustIdX;
        this.acupNewCustFirstName = that.acupNewCustFirstName;
        this.acupNewCustGovtIssuedId = that.acupNewCustGovtIssuedId;
        this.acupNewCustMiddleName = that.acupNewCustMiddleName;
        this.acupNewCustDobYyyyMmDd = that.acupNewCustDobYyyyMmDd;
        this.acupNewCustLastName = that.acupNewCustLastName;
        this.acupNewCustAddrLine1 = that.acupNewCustAddrLine1;
        this.acupNewCustAddrLine2 = that.acupNewCustAddrLine2;
        this.acupNewCustAddrLine3 = that.acupNewCustAddrLine3;
        this.acupNewCustAddrStateCd = that.acupNewCustAddrStateCd;
        this.acupNewCustEftAccountId = that.acupNewCustEftAccountId;
        this.acupNewCustAddrCountryCd = that.acupNewCustAddrCountryCd;
        this.acupNewCustPriHolderInd = that.acupNewCustPriHolderInd;
        this.acupNewCustAddrZip = that.acupNewCustAddrZip;
        this.acupNewCustFicoScoreX = that.acupNewCustFicoScoreX;
        this.acupNewCustPhoneNum1X = new AcupNewCustPhoneNum1X(that.acupNewCustPhoneNum1X);
        this.acupNewCustPhoneNum2X = new AcupNewCustPhoneNum2X(that.acupNewCustPhoneNum2X);
        this.acupNewCustSsnX = new AcupNewCustSsnX(that.acupNewCustSsnX);
    }
    
    protected AcupNewCustData(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected AcupNewCustData(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static AcupNewCustData fromBytes(byte[] bytes, int offset) {
        return new AcupNewCustData(bytes, offset);
    }
    
    public static AcupNewCustData fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static AcupNewCustData fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getAcupNewCustIdX() {
        return this.acupNewCustIdX;
    }
    
    public void setAcupNewCustIdX(String acupNewCustIdX) {
        this.acupNewCustIdX = acupNewCustIdX;
    }
    
    public String getAcupNewCustFirstName() {
        return this.acupNewCustFirstName;
    }
    
    public void setAcupNewCustFirstName(String acupNewCustFirstName) {
        this.acupNewCustFirstName = acupNewCustFirstName;
    }
    
    public String getAcupNewCustGovtIssuedId() {
        return this.acupNewCustGovtIssuedId;
    }
    
    public void setAcupNewCustGovtIssuedId(String acupNewCustGovtIssuedId) {
        this.acupNewCustGovtIssuedId = acupNewCustGovtIssuedId;
    }
    
    public String getAcupNewCustMiddleName() {
        return this.acupNewCustMiddleName;
    }
    
    public void setAcupNewCustMiddleName(String acupNewCustMiddleName) {
        this.acupNewCustMiddleName = acupNewCustMiddleName;
    }
    
    public String getAcupNewCustDobYyyyMmDd() {
        return this.acupNewCustDobYyyyMmDd;
    }
    
    public void setAcupNewCustDobYyyyMmDd(String acupNewCustDobYyyyMmDd) {
        this.acupNewCustDobYyyyMmDd = acupNewCustDobYyyyMmDd;
    }
    
    public String getAcupNewCustLastName() {
        return this.acupNewCustLastName;
    }
    
    public void setAcupNewCustLastName(String acupNewCustLastName) {
        this.acupNewCustLastName = acupNewCustLastName;
    }
    
    public String getAcupNewCustAddrLine1() {
        return this.acupNewCustAddrLine1;
    }
    
    public void setAcupNewCustAddrLine1(String acupNewCustAddrLine1) {
        this.acupNewCustAddrLine1 = acupNewCustAddrLine1;
    }
    
    public String getAcupNewCustAddrLine2() {
        return this.acupNewCustAddrLine2;
    }
    
    public void setAcupNewCustAddrLine2(String acupNewCustAddrLine2) {
        this.acupNewCustAddrLine2 = acupNewCustAddrLine2;
    }
    
    public String getAcupNewCustAddrLine3() {
        return this.acupNewCustAddrLine3;
    }
    
    public void setAcupNewCustAddrLine3(String acupNewCustAddrLine3) {
        this.acupNewCustAddrLine3 = acupNewCustAddrLine3;
    }
    
    public String getAcupNewCustAddrStateCd() {
        return this.acupNewCustAddrStateCd;
    }
    
    public void setAcupNewCustAddrStateCd(String acupNewCustAddrStateCd) {
        this.acupNewCustAddrStateCd = acupNewCustAddrStateCd;
    }
    
    public String getAcupNewCustEftAccountId() {
        return this.acupNewCustEftAccountId;
    }
    
    public void setAcupNewCustEftAccountId(String acupNewCustEftAccountId) {
        this.acupNewCustEftAccountId = acupNewCustEftAccountId;
    }
    
    public String getAcupNewCustAddrCountryCd() {
        return this.acupNewCustAddrCountryCd;
    }
    
    public void setAcupNewCustAddrCountryCd(String acupNewCustAddrCountryCd) {
        this.acupNewCustAddrCountryCd = acupNewCustAddrCountryCd;
    }
    
    public char getAcupNewCustPriHolderInd() {
        return this.acupNewCustPriHolderInd;
    }
    
    public void setAcupNewCustPriHolderInd(char acupNewCustPriHolderInd) {
        this.acupNewCustPriHolderInd = acupNewCustPriHolderInd;
    }
    
    public String getAcupNewCustAddrZip() {
        return this.acupNewCustAddrZip;
    }
    
    public void setAcupNewCustAddrZip(String acupNewCustAddrZip) {
        this.acupNewCustAddrZip = acupNewCustAddrZip;
    }
    
    public String getAcupNewCustFicoScoreX() {
        return this.acupNewCustFicoScoreX;
    }
    
    public void setAcupNewCustFicoScoreX(String acupNewCustFicoScoreX) {
        this.acupNewCustFicoScoreX = acupNewCustFicoScoreX;
    }
    
    public AcupNewCustPhoneNum1X getAcupNewCustPhoneNum1X() {
        return this.acupNewCustPhoneNum1X;
    }
    
    public void setAcupNewCustPhoneNum1X(AcupNewCustPhoneNum1X acupNewCustPhoneNum1X) {
        this.acupNewCustPhoneNum1X = acupNewCustPhoneNum1X;
    }
    
    public AcupNewCustPhoneNum2X getAcupNewCustPhoneNum2X() {
        return this.acupNewCustPhoneNum2X;
    }
    
    public void setAcupNewCustPhoneNum2X(AcupNewCustPhoneNum2X acupNewCustPhoneNum2X) {
        this.acupNewCustPhoneNum2X = acupNewCustPhoneNum2X;
    }
    
    public AcupNewCustSsnX getAcupNewCustSsnX() {
        return this.acupNewCustSsnX;
    }
    
    public void setAcupNewCustSsnX(AcupNewCustSsnX acupNewCustSsnX) {
        this.acupNewCustSsnX = acupNewCustSsnX;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ acupNewCustIdX=\"");
        s.append(getAcupNewCustIdX());
        s.append("\" acupNewCustFirstName=\"");
        s.append(getAcupNewCustFirstName());
        s.append("\" acupNewCustGovtIssuedId=\"");
        s.append(getAcupNewCustGovtIssuedId());
        s.append("\" acupNewCustMiddleName=\"");
        s.append(getAcupNewCustMiddleName());
        s.append("\" acupNewCustDobYyyyMmDd=\"");
        s.append(getAcupNewCustDobYyyyMmDd());
        s.append("\" acupNewCustLastName=\"");
        s.append(getAcupNewCustLastName());
        s.append("\" acupNewCustAddrLine1=\"");
        s.append(getAcupNewCustAddrLine1());
        s.append("\" acupNewCustAddrLine2=\"");
        s.append(getAcupNewCustAddrLine2());
        s.append("\" acupNewCustAddrLine3=\"");
        s.append(getAcupNewCustAddrLine3());
        s.append("\" acupNewCustAddrStateCd=\"");
        s.append(getAcupNewCustAddrStateCd());
        s.append("\" acupNewCustEftAccountId=\"");
        s.append(getAcupNewCustEftAccountId());
        s.append("\" acupNewCustAddrCountryCd=\"");
        s.append(getAcupNewCustAddrCountryCd());
        s.append("\" acupNewCustPriHolderInd=\"");
        s.append(getAcupNewCustPriHolderInd());
        s.append("\" acupNewCustAddrZip=\"");
        s.append(getAcupNewCustAddrZip());
        s.append("\" acupNewCustFicoScoreX=\"");
        s.append(getAcupNewCustFicoScoreX());
        s.append("\" acupNewCustPhoneNum1X=\"");
        s.append(getAcupNewCustPhoneNum1X());
        s.append("\" acupNewCustPhoneNum2X=\"");
        s.append(getAcupNewCustPhoneNum2X());
        s.append("\" acupNewCustSsnX=\"");
        s.append(getAcupNewCustSsnX());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(AcupNewCustData that) {
        return this.acupNewCustIdX.equals(that.acupNewCustIdX) &&
            this.acupNewCustFirstName.equals(that.acupNewCustFirstName) &&
            this.acupNewCustGovtIssuedId.equals(that.acupNewCustGovtIssuedId) &&
            this.acupNewCustMiddleName.equals(that.acupNewCustMiddleName) &&
            this.acupNewCustDobYyyyMmDd.equals(that.acupNewCustDobYyyyMmDd) &&
            this.acupNewCustLastName.equals(that.acupNewCustLastName) &&
            this.acupNewCustAddrLine1.equals(that.acupNewCustAddrLine1) &&
            this.acupNewCustAddrLine2.equals(that.acupNewCustAddrLine2) &&
            this.acupNewCustAddrLine3.equals(that.acupNewCustAddrLine3) &&
            this.acupNewCustAddrStateCd.equals(that.acupNewCustAddrStateCd) &&
            this.acupNewCustEftAccountId.equals(that.acupNewCustEftAccountId) &&
            this.acupNewCustAddrCountryCd.equals(that.acupNewCustAddrCountryCd) &&
            this.acupNewCustPriHolderInd == that.acupNewCustPriHolderInd &&
            this.acupNewCustAddrZip.equals(that.acupNewCustAddrZip) &&
            this.acupNewCustFicoScoreX.equals(that.acupNewCustFicoScoreX) &&
            this.acupNewCustPhoneNum1X.equals(that.acupNewCustPhoneNum1X) &&
            this.acupNewCustPhoneNum2X.equals(that.acupNewCustPhoneNum2X) &&
            this.acupNewCustSsnX.equals(that.acupNewCustSsnX);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof AcupNewCustData) && this.equals((AcupNewCustData)that);
    }
    
    @Override
    public int hashCode() {
        return acupNewCustIdX.hashCode() ^
            Integer.rotateLeft(acupNewCustFirstName.hashCode(), 1) ^
            Integer.rotateLeft(acupNewCustGovtIssuedId.hashCode(), 2) ^
            Integer.rotateLeft(acupNewCustMiddleName.hashCode(), 3) ^
            Integer.rotateLeft(acupNewCustDobYyyyMmDd.hashCode(), 4) ^
            Integer.rotateLeft(acupNewCustLastName.hashCode(), 5) ^
            Integer.rotateLeft(acupNewCustAddrLine1.hashCode(), 6) ^
            Integer.rotateLeft(acupNewCustAddrLine2.hashCode(), 7) ^
            Integer.rotateLeft(acupNewCustAddrLine3.hashCode(), 8) ^
            Integer.rotateLeft(acupNewCustAddrStateCd.hashCode(), 9) ^
            Integer.rotateLeft(acupNewCustEftAccountId.hashCode(), 10) ^
            Integer.rotateLeft(acupNewCustAddrCountryCd.hashCode(), 11) ^
            Integer.rotateLeft(Character.hashCode(acupNewCustPriHolderInd), 12) ^
            Integer.rotateLeft(acupNewCustAddrZip.hashCode(), 13) ^
            Integer.rotateLeft(acupNewCustFicoScoreX.hashCode(), 14) ^
            Integer.rotateLeft(acupNewCustPhoneNum1X.hashCode(), 15) ^
            Integer.rotateLeft(acupNewCustPhoneNum2X.hashCode(), 16) ^
            Integer.rotateLeft(acupNewCustSsnX.hashCode(), 17);
    }
    
    @Override
    public int compareTo(AcupNewCustData that) {
        int c = this.acupNewCustIdX.compareTo(that.acupNewCustIdX);
        if ( c != 0 ) return c;
        c = this.acupNewCustFirstName.compareTo(that.acupNewCustFirstName);
        if ( c != 0 ) return c;
        c = this.acupNewCustGovtIssuedId.compareTo(that.acupNewCustGovtIssuedId);
        if ( c != 0 ) return c;
        c = this.acupNewCustMiddleName.compareTo(that.acupNewCustMiddleName);
        if ( c != 0 ) return c;
        c = this.acupNewCustDobYyyyMmDd.compareTo(that.acupNewCustDobYyyyMmDd);
        if ( c != 0 ) return c;
        c = this.acupNewCustLastName.compareTo(that.acupNewCustLastName);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrLine1.compareTo(that.acupNewCustAddrLine1);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrLine2.compareTo(that.acupNewCustAddrLine2);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrLine3.compareTo(that.acupNewCustAddrLine3);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrStateCd.compareTo(that.acupNewCustAddrStateCd);
        if ( c != 0 ) return c;
        c = this.acupNewCustEftAccountId.compareTo(that.acupNewCustEftAccountId);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrCountryCd.compareTo(that.acupNewCustAddrCountryCd);
        if ( c != 0 ) return c;
        c = Character.compare(this.acupNewCustPriHolderInd, that.acupNewCustPriHolderInd);
        if ( c != 0 ) return c;
        c = this.acupNewCustAddrZip.compareTo(that.acupNewCustAddrZip);
        if ( c != 0 ) return c;
        c = this.acupNewCustFicoScoreX.compareTo(that.acupNewCustFicoScoreX);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum1X.compareTo(that.acupNewCustPhoneNum1X);
        if ( c != 0 ) return c;
        c = this.acupNewCustPhoneNum2X.compareTo(that.acupNewCustPhoneNum2X);
        if ( c != 0 ) return c;
        c = this.acupNewCustSsnX.compareTo(that.acupNewCustSsnX);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        ACUPNEWCUSTIDX.putString(acupNewCustIdX, bytes, offset);
        ACUPNEWCUSTFIRSTNAME.putString(acupNewCustFirstName, bytes, offset);
        ACUPNEWCUSTGOVTISSUEDID.putString(acupNewCustGovtIssuedId, bytes, offset);
        ACUPNEWCUSTMIDDLENAME.putString(acupNewCustMiddleName, bytes, offset);
        ACUPNEWCUSTDOBYYYYMMDD.putString(acupNewCustDobYyyyMmDd, bytes, offset);
        ACUPNEWCUSTLASTNAME.putString(acupNewCustLastName, bytes, offset);
        ACUPNEWCUSTADDRLINE1.putString(acupNewCustAddrLine1, bytes, offset);
        ACUPNEWCUSTADDRLINE2.putString(acupNewCustAddrLine2, bytes, offset);
        ACUPNEWCUSTADDRLINE3.putString(acupNewCustAddrLine3, bytes, offset);
        ACUPNEWCUSTADDRSTATECD.putString(acupNewCustAddrStateCd, bytes, offset);
        ACUPNEWCUSTEFTACCOUNTID.putString(acupNewCustEftAccountId, bytes, offset);
        ACUPNEWCUSTADDRCOUNTRYCD.putString(acupNewCustAddrCountryCd, bytes, offset);
        ACUPNEWCUSTPRIHOLDERIND.putString(acupNewCustPriHolderInd, bytes, offset);
        ACUPNEWCUSTADDRZIP.putString(acupNewCustAddrZip, bytes, offset);
        ACUPNEWCUSTFICOSCOREX.putString(acupNewCustFicoScoreX, bytes, offset);
        acupNewCustPhoneNum1X.getBytes(bytes, ACUPNEWCUSTPHONENUM1X.getOffset() + offset);
        acupNewCustPhoneNum2X.getBytes(bytes, ACUPNEWCUSTPHONENUM2X.getOffset() + offset);
        acupNewCustSsnX.getBytes(bytes, ACUPNEWCUSTSSNX.getOffset() + offset);
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
        acupNewCustIdX = ACUPNEWCUSTIDX.getString(bytes, offset);
        acupNewCustFirstName = ACUPNEWCUSTFIRSTNAME.getString(bytes, offset);
        acupNewCustGovtIssuedId = ACUPNEWCUSTGOVTISSUEDID.getString(bytes, offset);
        acupNewCustMiddleName = ACUPNEWCUSTMIDDLENAME.getString(bytes, offset);
        acupNewCustDobYyyyMmDd = ACUPNEWCUSTDOBYYYYMMDD.getString(bytes, offset);
        acupNewCustLastName = ACUPNEWCUSTLASTNAME.getString(bytes, offset);
        acupNewCustAddrLine1 = ACUPNEWCUSTADDRLINE1.getString(bytes, offset);
        acupNewCustAddrLine2 = ACUPNEWCUSTADDRLINE2.getString(bytes, offset);
        acupNewCustAddrLine3 = ACUPNEWCUSTADDRLINE3.getString(bytes, offset);
        acupNewCustAddrStateCd = ACUPNEWCUSTADDRSTATECD.getString(bytes, offset);
        acupNewCustEftAccountId = ACUPNEWCUSTEFTACCOUNTID.getString(bytes, offset);
        acupNewCustAddrCountryCd = ACUPNEWCUSTADDRCOUNTRYCD.getString(bytes, offset);
        acupNewCustPriHolderInd = ACUPNEWCUSTPRIHOLDERIND.getString(bytes, offset);
        acupNewCustAddrZip = ACUPNEWCUSTADDRZIP.getString(bytes, offset);
        acupNewCustFicoScoreX = ACUPNEWCUSTFICOSCOREX.getString(bytes, offset);
        acupNewCustPhoneNum1X.setBytes(bytes, ACUPNEWCUSTPHONENUM1X.getOffset() + offset);
        acupNewCustPhoneNum2X.setBytes(bytes, ACUPNEWCUSTPHONENUM2X.getOffset() + offset);
        acupNewCustSsnX.setBytes(bytes, ACUPNEWCUSTSSNX.getOffset() + offset);
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
