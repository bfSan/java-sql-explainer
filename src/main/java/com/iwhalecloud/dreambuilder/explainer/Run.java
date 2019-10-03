package com.iwhalecloud.dreambuilder.explainer;

import com.iwhalecloud.dreambuilder.explainer.common.PropertiesLoader;

/**
 * 运行程序
 *
 * @author bfSan
 * @date 2019/9/29
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("lololo");
        //初始化，读取配置文件 & 初始化数据库连接
        PropertiesLoader.init();

        //读取配置文件中的package路径 & classNameArray,生成List<Class>

        //调用collector，获取class中的sql

        //使用processor，对每条sql执行explain，返回resultList

        //使用reporter，将resultList转换为报告
    }


}
