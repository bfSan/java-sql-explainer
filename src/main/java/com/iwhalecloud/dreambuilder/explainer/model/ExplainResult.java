package com.iwhalecloud.dreambuilder.explainer.model;

import java.util.List;

/**
 * 封装的explain执行结果
 *
 * @author bfSan
 * @date 2019/9/29
 */
public class ExplainResult {
    private List<ExplainEntity> result;
    private String className;
    private String methodName;
    private String sqlScript;

    public List<ExplainEntity> getResult() {
        return result;
    }

    public void setResult(List<ExplainEntity> result) {
        this.result = result;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }
}
