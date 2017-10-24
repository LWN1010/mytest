package com.itheima.configuration;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataSourceConfiguration {
	@Bean(name = "dataSource")
	@Primary	// 设置为首选Bean
	@ConfigurationProperties(prefix="spring.datasource.c3p0")	// 创建该Bean需要的配置信息
	public DataSource createDataSource() {
		return DataSourceBuilder.create()		// 创建数据源构建对象
							    .type(ComboPooledDataSource.class)	// 指定数据源类型
							    .build();		// 构建数据源
	}
}
