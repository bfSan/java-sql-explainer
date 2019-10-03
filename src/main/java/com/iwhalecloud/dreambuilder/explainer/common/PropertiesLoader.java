package com.iwhalecloud.dreambuilder.explainer.common;

import java.io.IOException;
import java.util.Properties;

/**
 * 加载config.properties,生成properties对象
 *
 * @author bfSan
 * @date 2019/9/30
 */
public class PropertiesLoader {
    private static Properties properties;
    private static boolean init;

    public static Properties getProperties() {
        if (init) {
            return properties;
        }
        return init();
    }

    /**
     * 加载properties文件
     */
    public static Properties init() {
        try {
            properties.load(PropertiesLoader.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            return new Properties();
        }
        init = true;
        return properties;
    }
}
