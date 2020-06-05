package com.prodhani.util;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

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
