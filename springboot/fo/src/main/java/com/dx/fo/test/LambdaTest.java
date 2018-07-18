package com.dx.fo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lambda表达式 练习
 */
public class LambdaTest {
    public static void test(){

        List<Object> list=new ArrayList<Object>();
        Thread gaoDuanDaQiShangDangCi = new Thread( () -> {
            System.out.println("This is from an anonymous method (lambda exp).");
        } );
        Runnable r=()->{};

    }


}
