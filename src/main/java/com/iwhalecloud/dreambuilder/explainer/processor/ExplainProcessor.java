package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.mapper.ExplainMapper;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainBean;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bfSan
 * @date 2019/9/30
 */
@Component
public class ExplainProcessor implements Processor {

    @Resource
    private ExplainMapper explainMapper;

    @Override
    public List<ExplainContext> process(List<ExplainContext> explainContexts) {
        if (CollectionUtils.isEmpty(explainContexts)) {
            return new ArrayList<>();
        }

        for (Iterator<ExplainContext> iterator = explainContexts.iterator(); iterator.hasNext(); ) {
            ExplainContext explainContext = iterator.next();
            ExplainBean explainBean = explainContext.getExplainBean();
            //不包含sql语句的context，移除
            if (StringUtils.isEmpty(explainBean.getSqlScript())) {
                iterator.remove();
            }
            explainBean.setResults(explainMapper.explainSqlScript(explainBean.getSqlScript()));
        }
        return explainContexts;
    }
}
