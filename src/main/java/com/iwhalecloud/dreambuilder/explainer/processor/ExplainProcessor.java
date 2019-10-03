package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bfSan
 * @date 2019/9/30
 */
@Component
public class ExplainProcessor implements Processor{


    @Override
    public List<ExplainResult> process(List<String> sqlScripts) {
        List<ExplainResult> results = new ArrayList<>();

        return results;
    }
}
