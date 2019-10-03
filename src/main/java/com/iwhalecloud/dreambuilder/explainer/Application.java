package com.iwhalecloud.dreambuilder.explainer;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainBean;
import com.iwhalecloud.dreambuilder.explainer.model.ExplainContext;
import com.iwhalecloud.dreambuilder.explainer.processor.Processor;
import com.iwhalecloud.dreambuilder.explainer.reporter.Reporter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.Resource;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 运行程序
 *
 * @author bfSan
 * @date 2019/10/3
 */

@SpringBootApplication(scanBasePackages = {"com.iwhalecloud.dreambuilder.explainer"})
public class Application implements ApplicationRunner {

    @Resource
    private Processor processor;
    @Resource
    private Reporter reporter;

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("lololo");
        //TODO 读取配置文件中的package路径 & classNameArray,生成List<Class>；

        //TODO 调用collector，获取class中的sql；封装成List<ExplainContext>
        List<ExplainContext> contexts = new ArrayList<>();
        contexts.add(
                new ExplainContext(new ExplainBean("select * from rwsdb_dev_ticketorder.task_campaign")));

        //使用processor，对每条sql执行explain；将结果集放入context中
        processor.process(contexts);

        //使用reporter，将resultList转换为报告
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        reporter.generateReport(contexts, outputStream);
        System.out.println(outputStream.toString());
    }
}
