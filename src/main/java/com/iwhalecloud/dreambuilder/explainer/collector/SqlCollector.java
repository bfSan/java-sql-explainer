package com.iwhalecloud.dreambuilder.explainer.collector;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;

import java.util.List;

/**
 * 获取SQL语句
 *
 * @author bfSan
 * @date 2019/9/29
 */
public interface SqlCollector {
    /**
     * 获取sql语句，包装为explainContext
     *
     * @return context
     */
    List<ExplainContext> collect();
}
