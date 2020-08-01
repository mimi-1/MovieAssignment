/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.adminclient.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Marina
 */
public class Utils {
    
     public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
            System.out.println("Date is converted " +xmlCalendar.toString());
        } catch (DatatypeConfigurationException ex) {
            System.out.println(ex.getMessage());
        }
        return xmlCalendar;
    }
  
    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
    
    public static String ImageToString(byte[] data){ 
        //looks like it encodes jpeg too
        if(data!=null){
             BASE64Encoder base64Encoder = new BASE64Encoder();
	     StringBuilder imageString = new StringBuilder();
	     imageString.append("data:image/png;base64,");
	     imageString.append(base64Encoder.encode(data));
             //imageString.append(data);
	     return imageString.toString();
        }
        return null;
             
    }
    
    
}
