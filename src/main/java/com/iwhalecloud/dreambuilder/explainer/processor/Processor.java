package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;

import java.util.List;
/**
 * @author bfSan
 * @date 2019/9/30
 */
public interface Processor {
    List<ExplainResult> process(List<String> sqlScripts);
}
