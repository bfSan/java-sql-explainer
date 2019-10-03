package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;

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
     * @param explainContexts 尚未执行过explain的对象集，应包含sql语句
     * @return explain result List
     */
    List<ExplainContext> process(List<ExplainContext> explainContexts);
}
