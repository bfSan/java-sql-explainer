package com.iwhalecloud.dreambuilder.explainer;

import com.iwhalecloud.dreambuilder.explainer.model.ExplainResult;
import com.iwhalecloud.dreambuilder.explainer.processor.Processor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.Resource;
import java.util.List;

/**
 * 运行程序
 *
 * @author bfSan
 * @date 2019/9/29
 */

@SpringBootApplication(scanBasePackages = {"com.iwhalecloud.dreambuilder.explainer"})
public class Application implements ApplicationRunner {

    @Resource
    private Processor processor;

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("lololo");
        //TODO 读取配置文件中的package路径 & classNameArray,生成List<Class>

        //TODO 调用collector，获取class中的sql

        //TODO 使用processor，对每条sql执行explain，返回resultList
        List<ExplainResult> explainResults = processor.process(null);

        //TODO 使用reporter，将resultList转换为报告
    }
}
