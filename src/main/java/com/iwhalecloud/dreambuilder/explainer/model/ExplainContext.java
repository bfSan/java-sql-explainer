package com.iwhalecloud.dreambuilder.explainer.model;

/**
 * @author bfSan
 * @date 2019/10/3
 **/
public class ExplainContext {
    private ExplainBean explainBean;
    private String methodName;
    private String mapperResourceName;

    public ExplainContext() {
    }

    public ExplainContext(ExplainBean explainBean) {
        this.explainBean = explainBean;
    }

    public ExplainContext(String methodName, String mapperResourceName) {
        this.methodName = methodName;
        this.mapperResourceName = mapperResourceName;
    }

    public ExplainContext(ExplainBean explainBean, String methodName, String mapperResourceName) {
        this.explainBean = explainBean;
        this.methodName = methodName;
        this.mapperResourceName = mapperResourceName;
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

    public String getMapperResourceName() {
        return mapperResourceName;
    }

    public void setMapperResourceName(String mapperResourceName) {
        this.mapperResourceName = mapperResourceName;
    }

    @Override
    public String toString() {
        return "ExplainContext{" +
                "explainBean=" + explainBean +
                ", methodName='" + methodName + '\'' +
                ", mapperResourceName='" + mapperResourceName + '\'' +
                '}';
    }
}
