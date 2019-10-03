package com.iwhalecloud.dreambuilder.explainer.model;

import java.util.List;

/**
 * 封装的explain执行结果
 *
 * @author bfSan
 * @date 2019/9/29
 */
public class ExplainBean {
    private String sqlScript;
    private List<ExplainResult> results;

    public ExplainBean() {
    }

    public ExplainBean(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    public List<ExplainResult> getResults() {
        return results;
    }

    public void setResults(List<ExplainResult> results) {
        this.results = results;
    }

    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    @Override
    public String toString() {
        return "ExplainBean{" +
                "sqlScript='" + sqlScript + '\'' +
                ", results=" + results +
                '}';
    }
}
