package com.goldwind.mxm.goplus.tool.databasecompare.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @ClassName: LocaleMessageSourceUtil 
 * @Description: 读取配置信息
 * @author: YYH
 * @date: 2017年5月4日 上午8:52:12
 */
@Component
public class LocaleMessageSourceUtil {

	@Autowired
	private MessageSource messageSource;

	/**
	 * 
	 * @param code 对应messages配置的key
	 * @return
	 */
	public String getMessage(String code) {
		return getMessage(code, null);
	}

	/**
	 *
	 * @param code 对应messages配置的key.
	 * @param args  数组参数.
	 * @return
	 */
	public String getMessage(String code, Object[] args) {
		return getMessage(code, args, "");
	}

	/**
	 *
	 * @param code 对应messages配置的key.
	 * @param args 数组参数.
	 * @param defaultMessage 没有设置key的时候的默认值.
	 * @return
	 */
	public String getMessage(String code, Object[] args, String defaultMessage) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(code, args, defaultMessage, locale);
	}
}
