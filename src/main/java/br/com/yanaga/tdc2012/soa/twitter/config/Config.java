package br.com.yanaga.tdc2012.soa.twitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("br.com.yanaga.tdc2012.soa.twitter")
@ImportResource("classpath*:META-INF/spring/applicationContext*.xml")
public class Config {

}
