package com.goldwind.mxm.goplus.tool.databasecompare.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: WebConfiguration
 * @Description: web 配置类
 * @author: 31618 陶志明 taozhiming@goldwind.com.cn
 * @date: 2016年12月29日 下午2:09:58
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
	@Value("${cors.enable}")
	private boolean enbaleCors;
	/**
	 * @Description: 注册StatViewServlet
	 * @return
	 * @return: ServletRegistrationBean
	 */
	@Bean
	public ServletRegistrationBean druidStatViewServle2() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),
				"/druid/*");
		// 登录查看信息的账号密码.
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "123456");
		// 是否能够重置数据.
		servletRegistrationBean.addInitParameter("resetEnable", "false");
		return servletRegistrationBean;
	}
	/**
	 * @Description: 注册filterRegistrationBean
	 * @return
	 * @return: FilterRegistrationBean
	 */
	@Bean
	public FilterRegistrationBean druidStatFilter2() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		// 添加过滤规则.
		filterRegistrationBean.addUrlPatterns("/*");
		// 添加不需要忽略的格式信息.
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}
	/*
	 * (non Javadoc)
	 * @Description: 注册拦截器
	 * @param registry
	 * @see
	 * org.springframework.web.servlet.cn.dbfinger.service.base.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org
	 * .springframework.web.servlet.cn.dbfinger.service.base.config.annotation.InterceptorRegistry)
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
	}
	/*
	 * (non Javadoc)
	 * @Description: 配置跨域访问
	 * @param registry
	 * @see
	 * org.springframework.web.servlet.cn.dbfinger.service.base.config.annotation.WebMvcConfigurerAdapter#addCorsMappings(org
	 * .springframework.web.servlet.cn.dbfinger.service.base.config.annotation.CorsRegistry)
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		if(enbaleCors) {
			registry.addMapping("/**").allowedOrigins("*").allowCredentials(true)
					.allowedMethods("GET", "POST", "DELETE", "PUT").maxAge(3600);
		}
	}




}
