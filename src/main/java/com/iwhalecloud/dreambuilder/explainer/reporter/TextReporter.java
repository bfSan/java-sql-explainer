package com.iwhalecloud.dreambuilder.explainer.reporter;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * 文本类型的报告器，将context转换为Text(String) report
 *
 * @author bfSan
 * @date 2019/10/3
 **/
@Component
public class TextReporter implements Reporter {
    /**
     * 默认换行符
     */
    private static final String NEWLINE_CHARACTER = "\r\n";

    @Override
    public void generateReport(List<ExplainContext> explainContexts, OutputStream outputStream) {
        if (CollectionUtils.isEmpty(explainContexts)) {
            return;
        }
        for (ExplainContext context : explainContexts) {
            StringBuilder textBuilder = new StringBuilder();

            //类名
            textBuilder.append("ClassName: ").append(context.getMapperResourceName()).append(NEWLINE_CHARACTER);
            //方法名
            textBuilder.append("MethodName: ").append(context.getMethodName()).append(NEWLINE_CHARACTER);
            //explain result
            textBuilder.append("ExplainResult: ");
            for (ExplainResult explainResult : context.getExplainBean().getResults()) {
                textBuilder.append(explainResult).append(NEWLINE_CHARACTER);
            }

            //向流写入
            try {
                outputStream.write(textBuilder.toString().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
