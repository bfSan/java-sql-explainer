package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;

import java.util.List;

/**
 * Explain处理器
 * @author bfSan
 * @date 2019/9/30
 */
public interface Processor {
    /**
     * 对传入的sqlScripts执行explain，生成ExplainResult
     * @param sqlScripts sql语句
     * @return explain result List
     */
    List<ExplainResult> process(List<String> sqlScripts);
}
