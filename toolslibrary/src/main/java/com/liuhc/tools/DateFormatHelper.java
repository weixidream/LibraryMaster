package com.liuhc.tools;

import android.text.TextUtils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * Created by Liuhuacheng.
 * Created time 16/9/23.
 */

public class DateFormatHelper {

    public static final String FORMAT_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_TIME = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_YMD = "yyyy-MM-dd";
    public static final String FORMAT_YMD_FLOAT = "yyyy.MM.dd";
    public static final String FORMAT_HOUR = "HH:mm";
    public static final String FORMAT_MDHM = "MM-dd HH:mm";

    /**
     * 获取时间格式
     */
    public static String getTime(String time, String format) {
        String result = "";
        if (!TextUtils.isEmpty(time)) {
            try {
                long date = Long.valueOf(time);
                if (date > 0) {
                    SimpleDateFormat df = new SimpleDateFormat(format);
                    result = df.format(date);
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.getStackTrace();
            }
        }

        return result;
    }

    public static String getCurrentTime(String format) {
        SimpleDateFormat sDateFormat = new SimpleDateFormat(format);
        String date = sDateFormat.format(new Date());
        return date;
    }

    /**
     * 将短时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param format
     * @return
     */
    public static Date strToDate(String time, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(time, pos);
        return strtodate;
    }

    /**
     * 将短时间格式字符串转换为13位时间戳
     *
     * @param format
     * @return
     */
    public static String dateToStr(String time, String format) {
        Date date = strToDate(time, format);
        String timeLong = date.getTime() + "";
        return timeLong;
    }
}
