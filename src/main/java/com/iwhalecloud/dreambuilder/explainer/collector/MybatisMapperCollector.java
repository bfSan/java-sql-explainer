package com.iwhalecloud.dreambuilder.explainer.collector;

import com.google.common.collect.Sets;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainBean;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author bfSan
 * @date 2019/9/29
 */
@Component
public class MybatisMapperCollector implements SqlCollector {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public List<ExplainContext> collect() {
        List<ExplainContext> contexts = new ArrayList<>();

        //获取mybatis的所有statement(需要使用set去重)
        Set<MappedStatement> statements = Sets.newHashSet(sqlSessionFactory.getConfiguration().getMappedStatements());
        for (MappedStatement statement : statements) {
            BoundSql boundSql = statement.getBoundSql(null);

            //build context
            ExplainContext context = new ExplainContext();
            context.setMapperResourceName(statement.getResource());
            context.setMethodName(statement.getId());
            context.setExplainBean(new ExplainBean(boundSql.getSql()));
            contexts.add(context);
        }

        return contexts;
    }
}
