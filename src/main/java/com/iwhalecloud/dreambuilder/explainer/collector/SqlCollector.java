package com.iwhalecloud.dreambuilder.explainer.collector;

import java.util.List;

/**
 * 获取SQL语句
 *
 * @author bfSan
 * @date 2019/9/29
 */
public interface SqlCollector {
    /**
     * @param classes 收集的类
     * @return sql script List
     */
    List<String> collect(List<Class> classes);
}
