package com.iwhalecloud.dreambuilder.explainer;

import com.iwhalecloud.dreambuilder.explainer.collector.SqlCollector;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;
import com.iwhalecloud.dreambuilder.explainer.processor.Processor;
import com.iwhalecloud.dreambuilder.explainer.reporter.Reporter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * 运行程序
 *
 * @author bfSan
 * @date 2019/10/3
 */
@MapperScan("com.iwhalecloud.dreambuilder.explainer.mapper")
@SpringBootApplication(scanBasePackages = {"com.iwhalecloud.dreambuilder.explainer"})
public class Application implements ApplicationRunner {

    @Autowired
    private Processor processor;
    @Autowired
    private Reporter reporter;
    @Autowired
    private SqlCollector sqlCollector;

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) {
        //调用collector获取sql及相关信息,封装成ExplainContext
        List<ExplainContext> contexts = sqlCollector.collect();

        //使用processor，对每条sql执行explain；将结果集放入context中
        processor.process(contexts);

        //使用reporter，将resultList转换为报告
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        reporter.generateReport(contexts, outputStream);
        System.out.println(outputStream.toString());
    }
}
