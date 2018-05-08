/**   
 * Copyright © 2016 GW-SES. All rights reserved.
 * @Prject: mxm-loganalyze
 */
package com.goldwind.mxm.goplus.tool.databasecompare.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @ClassName: MyBatisConfiguration
 * @Description: 注册MyBatis分页插件PageHelper
 * @author: zhangjie
 * @date: 2016年12月22日 下午1:40:33
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfiguration implements TransactionManagementConfigurer {
	@Autowired
	DataSource dataSource;
	protected static Logger log = LoggerFactory.getLogger(MyBatisConfiguration.class);

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		/*分页插件*/ 
		PageHelper pageHelper = new PageHelper();
		Properties props = new Properties();
		props.setProperty("offsetAsPageNum", "true");
		props.setProperty("rowBoundsWithCount", "true");
		props.setProperty("reasonable", "true");
		props.setProperty("supportMethodsArguments", "true");
		props.setProperty("returnPageInfo", "check");
		props.setProperty("params", "count=countSql");
		pageHelper.setProperties(props);
		/*添加插件*/ 
		bean.setPlugins(new Interceptor[] { pageHelper });
		/*添加 Mapper 扫描路径 */
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
		return bean.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	@Bean
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
