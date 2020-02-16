package com.zaj.Subdatabase_Subtable;

import com.zaj.Subdatabase_Subtable.datasource.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@MapperScan("com.zaj.Subdatabase_Subtable.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
public class SubDatabaseSubTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubDatabaseSubTableApplication.class, args);
	}

}
