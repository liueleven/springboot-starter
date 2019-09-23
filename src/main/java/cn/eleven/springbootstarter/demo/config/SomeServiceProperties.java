package cn.eleven.springbootstarter.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description: 配置文件中的格式要求为：some.service.prefix=@,some.service.suffix=@
 * @date: 2019-09-23 21:26
 * @author: 十一
 */
@Data
@ConfigurationProperties(prefix = "some.service") // 匹配前缀
public class SomeServiceProperties {

    private String prefix;

    private String suffix;
}
