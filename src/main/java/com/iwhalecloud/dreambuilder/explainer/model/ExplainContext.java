package com.iwhalecloud.dreambuilder.explainer.model;

/**
 * @author bfSan
 * @date 2019/10/3
 **/
public class ExplainContext {
    private ExplainBean explainBean;
    private String methodName;
    private String mapperClassName;

    public ExplainContext() {
    }

    public ExplainContext(ExplainBean explainBean) {
        this.explainBean = explainBean;
    }

    public ExplainContext(String methodName, String mapperClassName) {
        this.methodName = methodName;
        this.mapperClassName = mapperClassName;
    }

    public ExplainContext(ExplainBean explainBean, String methodName, String mapperClassName) {
        this.explainBean = explainBean;
        this.methodName = methodName;
        this.mapperClassName = mapperClassName;
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
