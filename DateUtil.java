package com.spm.common.security.auth;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class DateUtil {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    /*
    yyyy 연도
    MM 월
    dd 일
    HH 시간
    mm 분
    ss 초
    SSS 밀리초
    */





    /**
     *
     * @param d1 두 날짜간의 차이를 구할 날짜 객체 1
     * @param d2 두 날짜간의 차이를 구할 날짜 객체 2
     * @return 두 날짜간의 차이를 초단위로 반환
     */
    public static long getDiffSecond(Temporal d1, Temporal d2){
        Duration duration = Duration.between(d1,d2);
        return Math.abs(duration.getSeconds());
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체 1
     * @param s2 yyyyMMdd 형식의 String 객체 2
     * @return 두 날짜간의 차이를 초단위로 반환
     */
    public static long getDiffSecond(String s1, String s2){
        Duration duration = Duration.between(parseDate(s1),parseDate(s2));
        return Math.abs(duration.getSeconds());
    }

    /**
     *
     * @param s1 날짜로 파싱할 String 객체
     * @return String을 LocalDate로 파싱
     */
    public static LocalDate parseDate(String s1){
        return LocalDate.parse(s1,FORMATTER);
    }
    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체 1
     * @param s2 yyyyMMdd 형식의 String 객체 2
     * @return 두 날짜간의 차잇값을 담은 Period 객체를 반환
     */
    private static Period getDateDiff(String s1,String s2){
        LocalDate ld1 = parseDate(s1);
        LocalDate ld2 = parseDate(s2);
        return Period.between(ld1,ld2);
    }

    /**
     *
     * @param d1 두 날짜간의 차이를 구할 날짜 객체 1
     * @param d2 두 날짜간의 차이를 구할 날짜 객체 2
     * @return 두 날짜간의 차잇값을 담은 Period 객체를 반환
     */
    private static Period getDateDiff(Temporal d1,Temporal d2){
        LocalDate ld1 = LocalDate.from(d1);
        LocalDate ld2 = LocalDate.from(d2);
        return Period.between(ld1,ld2);
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체 1
     * @param s2 yyyyMMdd 형식의 String 객체 2
     * @return 두 날짜간의 차이를 년수로 반환
     */
    public static int getDiffYears(String s1, String s2){
        return getDateDiff(s1,s2).getYears();
    }
    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체 1
     * @param s2 yyyyMMdd 형식의 String 객체 2
     * @return 두 날짜간의 차이를 개월수로 반환
     */
    public static int getDiffMonths(String s1, String s2){
        return getDateDiff(s1,s2).getMonths();
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체 1
     * @param s2 yyyyMMdd 형식의 String 객체 2
     * @return 두 날짜간의 차이를 일수로 반환
     */
    public static int getDiffDays(String s1, String s2){
        return getDateDiff(s1,s2).getDays();
    }
    /**
     *
     * @param d1 Temporal을 구현하는 날짜 객체 1
     * @param d2 Temporal을 구현하는 날짜 객체 2
     * @return 두 날짜간의 차이를 년수로 반환
     */
    public static int getDiffYears(Temporal d1, Temporal d2){
        return getDateDiff(d1,d2).getYears();
    }

    /**
     *
     * @param d1 Temporal을 구현하는 날짜 객체 1
     * @param d2 Temporal을 구현하는 날짜 객체 2
     * @return 두 날짜간의 차이를 개월수로 반환
     */
    public static int getDiffMonths(Temporal d1, Temporal d2){
        return getDateDiff(d1,d2).getMonths();
    }

    /**
     *
     * @param d1 Temporal을 구현하는 날짜 객체 1
     * @param d2 Temporal을 구현하는 날짜 객체 2
     * @return 두 날짜간의 차이를 일수로 반환
     */
    public static int getDiffDays(Temporal d1, Temporal d2){
        return getDateDiff(d1,d2).getDays();
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체
     * @param years 더할 년수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addYears(String s1,int years){
        LocalDate ld = parseDate(s1);
        LocalDate targetDate = LocalDate.of(ld.getYear()+years,ld.getMonthValue(),ld.getDayOfMonth());
        return FORMATTER.format(targetDate);
    }
    /**
     *
     * @param d1 날짜 객체
     * @param years 더할 년수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addYears(Temporal d1,int years){
        LocalDate ld = LocalDate.from(d1);
        LocalDate targetDate = LocalDate.of(ld.getYear()+years,ld.getMonthValue(),ld.getDayOfMonth());
        return FORMATTER.format(targetDate);
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체
     * @param months 더할 개월수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addMonths(String s1,int months){
        LocalDate ld = parseDate(s1);
        LocalDate targetDate = LocalDate.of(ld.getYear(),ld.getMonthValue()+months,ld.getDayOfMonth());
        return FORMATTER.format(targetDate);
    }

    /**
     *
     * @param d1 날짜 객체
     * @param months 더할 개월수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addMonths(Temporal d1,int months){
        LocalDate ld = LocalDate.from(d1);
        LocalDate targetDate = LocalDate.of(ld.getYear(),ld.getMonthValue()+months,ld.getDayOfMonth());
        return FORMATTER.format(targetDate);
    }

    /**
     *
     * @param s1 yyyyMMdd 형식의 String 객체
     * @param days 더할 일수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addDays(String s1,int days){
        LocalDate ld = parseDate(s1);
        LocalDate targetDate = LocalDate.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth()+days);
        return FORMATTER.format(targetDate);
    }
    /**
     *
     * @param d1 날짜 객체
     * @param days 더할 일수
     * @return 더한 날짜를 yyyyMMdd 형식의 String으로 반환
     */
    public static String addDays(Temporal d1,int days){
        LocalDate ld = LocalDate.from(d1);
        LocalDate targetDate = LocalDate.of(ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth()+days);
        return FORMATTER.format(targetDate);
    }

    /**
     *
     * @param isAscending 오름차순으로 정렬할건지의 여부
     * @param dates yyyyMMdd 형식의 String 객체 배열
     * @return 인자가 2개 미만이라면 빈 리스트를 반환, 2개 이상이라면 날짜순으로 정렬된 리스트를 반환
     */
    public static List<LocalDate> sortDates(boolean isAscending,String... dates) {
        if (dates.length < 2) {
            return Collections.emptyList();
        }
        List<LocalDate> dateList = Arrays.stream(dates)
                .map(date -> LocalDate.parse(date, FORMATTER))
                .collect(Collectors.toList());

        dateList.sort(isAscending ? LocalDate::compareTo : Collections.reverseOrder());
        return dateList;
    }

    

    
}
