package com.edu.nbu.utils;


/**
 * Created by Administrator on 2020/3/4 0004.
 */
public class ArrayUtilsTest {

    public static void main(String[] args) {
        String[] strArr = {"1","2","3"};
        Float[] floatArr = new Float[strArr.length];
        ArrayUtils.transArray(strArr,floatArr, v ->strToFloat(v));
        for (int i=0 ;i<strArr.length;i ++){
            System.out.println(floatArr[i]);
        }
    }



    private static Float strToFloat(String str){
        if(str == null || str.trim().length() == 0){
            return 0.0F;
        }
        return Float.valueOf(str);
    }

}
