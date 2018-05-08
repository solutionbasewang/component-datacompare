package com.goldwind.mxm.goplus.tool.databasecompare.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName: DateUtil
 * @Description: 时间处理类
 * @author: YYH
 * @date: 2017年5月5日 上午9:38:40
 */
public class DateUtil extends DateUtils {
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM_DD_HH_MM_SS_FFF="yyyy-MM-dd HH:mm:ss.fff";
	public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String YYYYMMDD = "yyyyMMdd";
	public static final String YYYY_MM = "yyyy-MM";
	public static final String YYYY = "yyyy";
	public static final String YYYY_MM_DD_HH_MM_SS_ZH = "yyyy年MM月dd日HH时mm分ss秒";
	public static final String YYYY_MM_DD_HH_MM_ZH = "yyyy年MM月dd日HH时mm分";
	public static final String YYYY_MM_DD_ZH = "yyyy年MM月dd";

	/**
	 *  @author alex
	 *  @version 1.0
	 *  @param date 日期字符串
	 *  @param parsePatterns 日期格式
	 *  @return	日期
	 *  @description 日期格式化
	 * */
	public static Date parseDate(String date,String parsePatterns) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(parsePatterns);
		df.parse(date);
		return df.getCalendar().getTime();
	}
	/**
	 * 返回当前日期+时间
	 * @return Date 返回该日期
	 */
	public static final Date getNow() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	/**
	 *  @author alex
	 *  @return 小时数
	 *  @description 获取小时数
	 * */
	public static final int getHour(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	/**
	 * 返回当前日期+时间
	 * @return Date 返回该日期
	 */
	public static final String getNow(String pattern) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(getPattern(pattern));
		return sdf.format(calendar.getTime());
	}
	/**
	 * 给指定的日期注入一个开始时间00:00:00 如果date为null 则自动获取当前时间
	 * @return Date 返回该日期
	 */
	public static final Date getStartTimeOfDay(Date date) {
		return setHours(setMinutes(setSeconds(getDate(date), 0), 0), 0);
	}
	/**
	 * 给指定的日期注入一个结束时间23:59:59 如果date为null 则自动获取当前时间
	 * @return Date 返回该日期
	 */
	public static Date getEndTimeOfDay(Date date) {
		return setHours(setMinutes(setSeconds(getDate(date), 59), 59), 23);
	}
	/**
	 * 转换指定的时间为指定的格式的时间字符串 如果date为null 则自动获取当前时间
	 * @param date
	 * @param pattern
	 * @return 格式化后的时间字符串
	 */
	public static String formatDateToString(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(getPattern(pattern), Locale.ENGLISH);
		return sdf.format(getDate(date));
	}
	/**
	 * 转换指定的时间字符串为指定的格式的时间 如果date为null 则自动获取当前时间
	 * @param date
	 * @param pattern
	 * @return 格式化后的时间
	 */
	public static Date formatStringTodate(String date, String pattern) {
		if (date == null) {
			return getNow();
		}
		Date returnDate;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(getPattern(pattern));
			returnDate = sdf.parse(date);
		} catch (ParseException e) {
			returnDate = new Date();
		}
		return returnDate;
	}
	/**
	 * 比较2个日期,返回相差天数
	 * @param from 被减数
	 * @param to 减数
	 * @return Long 天数
	 */
	public static Long compareDate(Date from, Date to) {
		if (from == null || to == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		return (to.getTime() - from.getTime()) / MILLIS_PER_DAY;
	}

	/**
	 * 通过时间秒毫秒数判断两个时间的间隔
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int differentDaysByMillisecond(Date date1,Date date2)
	{
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
		return days;
	}
	/**
	 * 返回指定日期的月份第一天
	 */
	public static Date getStartDayOfMonth(Date date) {
		return setDays(getDate(date), 1);
	}
	/**
	 * 返回指定日期的月份最后一天
	 */
	public static Date getEndDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.set(Calendar.DATE, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}
	/**
	 * 返回指定日期的年
	 * @return Integer 返回年
	 */
	public static Integer getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		return calendar.get(Calendar.YEAR);
	}
	/**
	 * 返回指定日期的月份
	 * @return Integer 返回月份
	 */
	public static Integer getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		return calendar.get(Calendar.MONTH) + 1;
	}
	/**
	 * 返回指定日
	 * @return Integer 返回日期
	 */
	public static Integer getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		return calendar.get(Calendar.DATE);
	}
	/**
	 * 返回指定日期的星期几
	 * @return Integer 星期几
	 */
	public static Integer getWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	/**
	 * 返回指定日期的周一
	 */
	public static Date getStartDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		return getStartTimeOfDay(calendar.getTime());
	}
	/**
	 * 返回指定日期的周日
	 */
	public static Date getEndDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		Integer weekPlus = calendar.get(Calendar.DAY_OF_WEEK);
		if (weekPlus == 1) {
			weekPlus = -6;
		} else {
			weekPlus = 2 - weekPlus;
		}
		calendar.add(Calendar.DAY_OF_WEEK, weekPlus + 6);
		return getEndTimeOfDay(calendar.getTime());
	}
	/**
	 * 返回指定日期的周六SATURDAY
	 */
	public static Date getSatudayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		Integer weekPlus = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DAY_OF_WEEK, 7 - weekPlus);
		return calendar.getTime();
	}
	/**
	 * @Title: getWeekStartDay
	 * @Description: 从当前时间计算获取一周的开始时间
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getWeekStartDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.WEEK_OF_YEAR, -1);
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	/**
	 * @Title: getMonthStartDay
	 * @Description: 从当前时间计算获取一个月的开始时间
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthStartDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.MONTH, -1);
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	/**
	 * @Title: getPreMonth
	 * @Description: 获取上一月的这一天
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getPreMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.MONTH, -1);
		return calendar.getTime();
	}

	/**
	 * @Title: getPreDay
	 * @Description: 获取上一天
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getPreDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return calendar.getTime();
	}
	/**
	 *  @author alex
	 *  @version 1.0
	 *  @param date 当前日期
	 *  @param days 调整的天数
	 *  @return 返回调整后的日期
	 *  @description 日期天数调整
	 * */
	public static Date changeDay(Date date,int days){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}

	/**
	 * @Title: getPreYear
	 * @Description: 获取上一年
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getPreYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.YEAR, -1);
		return calendar.getTime();
	}
	/**
	 * @Title: getPreYear
	 * @Description: 获取下一年
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getNextYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.YEAR, +1);
		return calendar.getTime();
	}

	/**
	 * @Title: getPreYear
	 * @Description: 获取下一天
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getNextDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.DAY_OF_MONTH, +1);
		return calendar.getTime();
	}


	/**
	 * @Title: getPreYear
	 * @Description: 获取下一月
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getNextMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.MONTH, +1);
		return calendar.getTime();
	}
	/**
	 * @Title: getGwDay
	 * @Description: 当前日期前10天内 (金风kpi时间查询要求)/不跨月
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getGwDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		Integer day = getDay(date);
		if (day < 10) {
			calendar.add(Calendar.DAY_OF_YEAR, -day);
		} else {
			calendar.add(Calendar.DAY_OF_YEAR, -10);
		}
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	/**
	 * @Title: getGwWeek
	 * @Description: 包含本周的前5周数据
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getGwWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.WEEK_OF_YEAR, -5);
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	/**
	 * @Title: getGwMonth
	 * @Description: 当月往前推10个月/不跨年
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getGwMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		Integer month = getMonth(date);
		if (month < 10) {
			calendar.add(Calendar.MONTH, -month+1);
		} else {
			calendar.add(Calendar.MONTH, -10+1);
		}
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	/**
	 * @Title: getGwYear
	 * @Description: 当年往前推5年来
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getGwYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		calendar.add(Calendar.YEAR, -5);
		return calendar.getTime();
	}

	/**
	 * @Title: getDate
	 * @Description: 处理时间为空的情况
	 * @param date
	 * @return
	 * @return: Date
	 */
	private static Date getDate(Date date) {
		if (date == null) {
			return getNow();
		}
		return date;
	}
	/**
	 * @Title: getPattern
	 * @Description: 处理时间格式为空的情况
	 * @param pattern
	 * @return
	 * @return: String
	 */
	private static String getPattern(String pattern) {
		if (StringUtils.isEmpty(pattern)) {
			return YYYY_MM_DD_HH_MM_SS;
		}
		return pattern;
	}
	/**
	 * @Title: judgeDay
	 * @Description: 判断当前月天数
	 * @param year
	 * @param month
	 * @return
	 * @return: int
	 */
	public static Integer judgeDay(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	/**
	 * @Title: setTime
	 * @Description: 设置时间
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 * @return: Date
	 */
	public static Date setTime(Integer year, Integer month, Integer day) {
		Calendar calendar = Calendar.getInstance();
		Integer maxDay = judgeDay(year, month);
		if (day > maxDay) {
			calendar.set(year, month - 1, maxDay);
		} else {
			calendar.set(year, month - 1, day);
		}
		return calendar.getTime();
	}
	
	/**
	 * @Title: getWeekDay 
	 * @Description: 获取星期几，从周一开始
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getWeekDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date));
		//第一天是否为星期天
		boolean isFirstSunday = (calendar.getFirstDayOfWeek() == Calendar.SUNDAY);
		//获取周几
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		//若第一天为星期天，则-1
		if(isFirstSunday){
			weekDay = weekDay - 1;
			if(weekDay == 0){
				weekDay = 7;
			}
		}
		return weekDay;
	}
	

}
