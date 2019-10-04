package com.iwhalecloud.dreambuilder.explainer.mapper;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author bfSan
 * @date 2019/10/4
 */
@Mapper
public interface TestMapper1 {
    @Select("select * from rwsdb_dev_ticketorder.task_dictionary where id = #{id}")
    void test2(@Param("id") Integer id);
}
