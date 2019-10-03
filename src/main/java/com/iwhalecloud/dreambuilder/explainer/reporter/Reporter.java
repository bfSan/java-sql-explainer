package com.iwhalecloud.dreambuilder.explainer.reporter;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;

import java.io.OutputStream;
import java.util.List;

/**
 * @author bfSan
 * @date 2019/9/30
 */
public interface Reporter {
    void generateReport(List<ExplainContext> explainContexts, OutputStream outputStream);
}
