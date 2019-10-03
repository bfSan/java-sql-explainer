package com.iwhalecloud.dreambuilder.explainer.model;

/**
 * 对应explain的执行结果对象
 *
 * @author bfSan
 * @date 2019/9/30
 */
public class ExplainEntity {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getPartitions() {
        return partitions;
    }

    public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPossibleKeys() {
        return possibleKeys;
    }

    public void setPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getKeyLen() {
        return keyLen;
    }

    public void setKeyLen(long keyLen) {
        this.keyLen = keyLen;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public long getRows() {
        return rows;
    }

    public void setRows(long rows) {
        this.rows = rows;
    }

    public long getFiltered() {
        return filtered;
    }

    public void setFiltered(long filtered) {
        this.filtered = filtered;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", selectType='" + selectType + '\'' +
                ", table='" + table + '\'' +
                ", partitions='" + partitions + '\'' +
                ", type='" + type + '\'' +
                ", possibleKeys='" + possibleKeys + '\'' +
                ", key='" + key + '\'' +
                ", keyLen=" + keyLen +
                ", ref='" + ref + '\'' +
                ", rows=" + rows +
                ", filtered=" + filtered +
                ", extra='" + extra + '\'' +
                '}';
    }
}
