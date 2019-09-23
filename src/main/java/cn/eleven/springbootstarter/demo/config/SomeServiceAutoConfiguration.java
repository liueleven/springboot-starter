package cn.eleven.springbootstarter.demo.config;

import cn.eleven.springbootstarter.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-23 21:24
 * @author: 十一
 */
@Configuration  // 配置注解
@ConditionalOnClass(SomeService.class) // 存在SomeService这个类才生效
@EnableConfigurationProperties(SomeServiceProperties.class) // 加载配置属性
public class SomeServiceAutoConfiguration {

    @Autowired
    private SomeServiceProperties someServiceProperties;

    @Bean
    // some.service.enable=treu 符合属性才生效
    @ConditionalOnProperty(havingValue = "true"
            ,name = "some.service.enable"
            // 如果条件不匹配就不设置
            ,matchIfMissing = true)
    public SomeService someService() {
        return new SomeService(someServiceProperties.getPrefix(), someServiceProperties.getSuffix());
    }

}
