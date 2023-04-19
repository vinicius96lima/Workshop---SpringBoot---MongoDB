package com.vinicius.workshop_mongodb.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {
	
	public static String decodeFor (String text) {
		try {
			 return  URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "" ;
		}
	}
	
	public static Date convert (String textDate, Date defaultValue) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return sdf.parse(textDate);
		} catch (ParseException e) {
			return defaultValue;
		}
	}

}
