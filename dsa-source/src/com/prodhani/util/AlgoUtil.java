package com.prodhani.util;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

public class AlgoUtil {

    public static int getGCM(int a, int b){
        if(b==0){
            return a;
        }else {
            int r = a % b;
            if(b>r){
                return getGCM(b, r);
            }else{
                return getGCM(r, b);
            }
        }
    }

    public static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static  <T> void  traverseArray(T[] arr)
    {
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


         String vpa = "sdsfdsfds@dfdf";
         System.out.println(vpa.indexOf('@'));
         
         System.out.println("/"+" "+"/"+" "+"\\");
         
         // 2+2295+2295 = 4592-100=4492
         double d1 = 2295*100/4492;
         d1 = 49.978223;
         System.out.println("  discount "+d1);
         d1 =  BigDecimal.valueOf(2295-d1).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
         System.out.println(" prorated discount "+d1);
        
         
         double d2 =0.04355401; //1.9564
         System.out.println("  discount "+d2);
         d2 =  BigDecimal.valueOf(2-d2).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
         System.out.println(" prorated discount "+d2);
        
          
         double d3 =  BigDecimal.valueOf(d1+d1+d2).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();;
         System.out.println(" total amount "+d3);
         
         
         
         
         d1 = 49.978223;
         d1 =  BigDecimal.valueOf(2295-d1).setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
         System.out.println(" prorated discount "+d1);
         d2 =0.04355401;
         d2 =  BigDecimal.valueOf(2-d2).setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
         System.out.println(" prorated discount "+d2);
         
         d3 =  BigDecimal.valueOf(d1+d1+d2).setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
         System.out.println(" total amount "+d3);
         
         System.out.println("scale to 2 -> "+BigDecimal.valueOf(3.857).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
         
         
         
//        AlgoUtil util = new AlgoUtil();
//        if(util instanceof Object)   {
//            System.out.println("done");
//        }
//
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime());
//        cal.add(Calendar.DAY_OF_MONTH,2);
//        System.out.println(cal.getTime());
    }
}
