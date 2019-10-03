package com.iwhalecloud.dreambuilder.explainer.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author bfSan
 * @date 2019/9/30
 */
public class ConnectionLoader {

    public static void test(String url, String driverClass, String username, String password) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(driverClass);
            ResultSet rs = null;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
