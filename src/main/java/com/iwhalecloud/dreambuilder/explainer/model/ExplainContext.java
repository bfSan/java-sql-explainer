package com.iwhalecloud.dreambuilder.explainer.model;

/**
 * @author bfSan
 * @date 2019/9/29
 **/
public class ExplainContext {
    private ExplainBean explainBean;
    private String methodName;
    private String mapperClassName;

    public ExplainContext() {
    }

    public ExplainBean getExplainBean() {
        return explainBean;
    }

    public void setExplainBean(ExplainBean explainBean) {
        this.explainBean = explainBean;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMapperClassName() {
        return mapperClassName;
    }

    public void setMapperClassName(String mapperClassName) {
        this.mapperClassName = mapperClassName;
    }

    @Override
    public String toString() {
        return "ExplainContext{" +
                "explainBean=" + explainBean +
                ", methodName='" + methodName + '\'' +
                ", mapperClassName='" + mapperClassName + '\'' +
                '}';
    }
}
