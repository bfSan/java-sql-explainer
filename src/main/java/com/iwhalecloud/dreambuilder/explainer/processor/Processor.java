package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainBean;

import java.util.List;

/**
 * Explain处理器
 *
 * @author bfSan
 * @date 2019/9/30
 */
public interface Processor {
    /**
     * 对传入的sqlScripts执行explain，生成ExplainResult
     *
     * @param readyExplainBeans 尚未执行过explain的对象集，应包含sql语句
     * @return explain result List
     */
    List<ExplainBean> process(List<ExplainBean> readyExplainBeans);
}
