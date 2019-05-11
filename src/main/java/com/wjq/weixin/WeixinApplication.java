package com.wjq.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.xml.StaxUtils;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class WeixinApplication {
@Bean
public  XmlMapper xmlMapper() {
	XmlMapper mapper=new XmlMapper(StaxUtils.createDefensiveInputFactory());
	return mapper;
}
	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
