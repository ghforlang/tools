package com.edu.nbu.utils;

import java.util.function.Function;

/**
 * Created by Administrator on 2020/3/4 0004.
 */

public class ArrayUtils {

    private ArrayUtils(){}


    public static <S,T> T[]  transArray(S[] sourceArr, T[] targetArr,Function<S,T> mapper){
        for(int i=0;i<sourceArr.length;i++){
            targetArr[i] = mapper.apply(sourceArr[i]);
        }
        return targetArr;
    }
}
