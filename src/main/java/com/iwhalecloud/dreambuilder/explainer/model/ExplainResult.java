package com.iwhalecloud.dreambuilder.explainer.model;

/**
 * @author bfSan
 * @date 2019/9/29
 */
public class ExplainResult {
    private long id;
    private String selectType;
    private String table;
    private String partitions;
    private String type;
    private String possibleKeys;
    private String key;
    private long keyLen;
    private String ref;
    private long rows;
    private long filtered;
    private String extra;

    private String className;
    private String methodName;
    private String sqlScript;
}
