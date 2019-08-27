package com.plugin.component.support

/**
 *  logger 管理
 *  created by yummylau 2019/08/09
 */
class Logger {

    static void buildOutput(String log) {
        System.out.println("  " + log)
    }

    static void buildOutput(Object start, Object end) {
        System.out.println("  " + start + " = " + end)
    }
}