package com.prodhani.hash;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.google.gson.Gson;
import com.sun.xml.internal.ws.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

public class HashCalculation {

	

    public static void main(String[] args) {
       String hash =  generatePayuHash("9uMuDK|cancel_refund_transaction|403993715520976896|4YlOprXr");
       String ss = null;
       System.out.println("sss".equals(ss));
       final StringBuilder builder = new StringBuilder();
		builder.append("PlanDetails [plan_code=");
		//builder.append(n);
      
       System.out.println(hash);
    }

    protected static String generatePayuHash(final String hashString)
    {
        try
        {     
            final MessageDigest digest = MessageDigest.getInstance("SHA-512");
            final byte[] encodedhash = digest.digest(hashString.getBytes(StandardCharsets.UTF_8));
            Double db = new Double(10000000000.0);
            System.out.println(Double.toString(db));
            return bytesToHex(encodedhash);
        }
        catch (final Exception e)
        {
            throw new RuntimeException(e);
        }


    }

    private static String bytesToHex(final byte[] hash)
    {
        final StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++)
        {
            final String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    

   
    
    
}

