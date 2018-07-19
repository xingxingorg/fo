package com.dx.fo.base.common;

import java.util.UUID;

/**
 * Created by Administrator on 2018/7/19.
 */
public class UUIDHelp {
    public static String newUUID(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
