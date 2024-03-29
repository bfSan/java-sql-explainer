package com.iwhalecloud.dreambuilder.explainer.mapper;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author bfSan
 * @date 2019/10/3
 */
@Mapper
public interface ExplainMapper {
    @Select("explain ${sql}")
    List<ExplainResult> explainSqlScript(@Param("sql") String sql);
}
