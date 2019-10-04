package com.iwhalecloud.dreambuilder.explainer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author bfSan
 * @date 2019/10/4
 */
@Mapper
public interface TestMapper2 {
    @Select("select * from rwsdb_dev_ticketorder.task_campaign")
    void test();
}
