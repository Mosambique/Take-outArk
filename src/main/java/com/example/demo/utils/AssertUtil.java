package com.example.demo.utils;

import com.example.demo.exception.ParamsException;

import java.awt.print.PrinterException;

public class AssertUtil {
    /**
     * 判断结果是否为true
     * @param flag
     * @param msg
     */
    public static void isTrue(Boolean flag, String msg){
        if(flag){
            throw new ParamsException(msg);
        }

    }
}
