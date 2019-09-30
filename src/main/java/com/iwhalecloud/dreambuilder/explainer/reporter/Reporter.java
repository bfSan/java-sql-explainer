package com.iwhalecloud.dreambuilder.explainer.reporter;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;

import java.io.OutputStream;
import java.util.List;

/**
 * @author bfSan
 * @date 2019/9/30
 */
public interface Reporter {
    void generateReport(List<ExplainResult> explainResults, OutputStream outputStream);
}
