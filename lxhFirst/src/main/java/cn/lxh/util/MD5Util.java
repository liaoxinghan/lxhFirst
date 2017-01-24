package cn.lxh.util;

import java.security.MessageDigest;

/**
* <p>Title: MD5Util</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-27
*/
public class MD5Util {

	public static String MD5(String strContent) {
    	try {
    		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        	byte[] tempBytes =  messageDigest.digest(strContent.getBytes("utf-8"));
        	StringBuilder stringBuilder = new StringBuilder();
        	for(byte bytes: tempBytes) {
        		String tempByte = Integer.toHexString(bytes & 0xFF);
        		if(tempByte.length() == 1) {
        			stringBuilder.append("0");
        		}
        		stringBuilder.append(tempByte);
        	}
        	return stringBuilder.toString();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    } 
	
	public static void main(String[] args) {
	}
}
