package com.iwhalecloud.dreambuilder.explainer.processor;

import com.iwhalecloud.dreambuilder.explainer.mapper.ExplainMapper;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainBean;
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
    public List<ExplainBean> process(List<ExplainBean> readyExplainBeans) {
        if (CollectionUtils.isEmpty(readyExplainBeans)) {
            return new ArrayList<>();
        }

        for (Iterator<ExplainBean> iterator = readyExplainBeans.iterator(); iterator.hasNext(); ) {
            ExplainBean explainBean = iterator.next();
            if (StringUtils.isEmpty(explainBean.getSqlScript())) {
                iterator.remove();
            }
            explainBean.setResults(explainMapper.explainSqlScript(explainBean.getSqlScript()));
        }
        return readyExplainBeans;

    }
}
