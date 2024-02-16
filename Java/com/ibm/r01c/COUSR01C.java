package com.ibm.r01c;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class COUSR01C implements Comparable<COUSR01C> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    public COUSR01C() {
    }
    
    public COUSR01C(COUSR01C that) {
    }
    
    protected COUSR01C(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected COUSR01C(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static COUSR01C fromBytes(byte[] bytes, int offset) {
        return new COUSR01C(bytes, offset);
    }
    
    public static COUSR01C fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static COUSR01C fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args){
    CcdaScreenTitle ccdaScreenTitle = new CcdaScreenTitle();
    Cousr1ao cousr1ao = new Cousr1ao();
    WsDateTime wsDateTime = new WsDateTime();
    WsVariables wsVariables = new WsVariables();

    wsDateTime.wsCurdateData.wsCurdate.wsCurdateMonth = Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1));
    wsDateTime.wsCurdateData.wsCurdate.wsCurdateDay = Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
    wsDateTime.wsCurdateData.wsCurdate.wsCurdateYear = Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));

    cousr1ao.setTitle01o(ccdaScreenTitle.getCcdaTitle01());
    cousr1ao.setTitle02o(ccdaScreenTitle.getCcdaTitle02());
    cousr1ao.setTrnnameo(wsVariables.getWsTranid());
    cousr1ao.setPgmnameo(wsVariables.getWsPgmname());

    wsDateTime.wsCurdateMmDdYy.wsCurdateMm = wsDateTime.wsCurdateData.wsCurdate.wsCurdateMonth;
    wsDateTime.wsCurdateMmDdYy.wsCurdateDd = wsDateTime.wsCurdateData.wsCurdate.wsCurdateDay;
    wsDateTime.wsCurdateMmDdYy.wsCurdateYy = wsDateTime.wsCurdateData.wsCurdate.wsCurdateYear.toString().substring(2, 4);

    cousr1ao.setCurdateo(wsDateTime.wsCurdateMmDdYy.wsCurdateMmDdYy);

    wsDateTime.wsCurtimeHhMmSs.wsCurtimeHh = wsDateTime.wsCurdateData.wsCurtime.wsCurtimeHours;
    wsDateTime.wsCurtimeHhMmSs.wsCurtimeMm = wsDateTime.wsCurdateData.wsCurtime.wsCurtimeMinute;
    wsDateTime.wsCurtimeHhMmSs.wsCurtimeSs = wsDateTime.wsCurdateData.wsCurtime.wsCurtimeSecond;

    cousr1ao.setCurtimeo(wsDateTime.wsCurtimeHhMmSs.wsCurtimeHhMmSs);
}



    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(COUSR01C that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof COUSR01C) && this.equals((COUSR01C)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(COUSR01C that) {
        int c = 0;
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
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
