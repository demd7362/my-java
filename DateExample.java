import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Collectors;

public class DateExample {
    /*
    yyyy 연도
    MM 월
    dd 일
    HH 시간
    mm 분
    ss 초
    SSS 밀리초
    */
    public static long getDiffSecond(Temporal d1, Temporal d2){ // 두 날짜간의 차이를 초단위로 반환
        Duration duration = Duration.between(d1,d2);
        return Math.abs(duration.getSeconds());
    }
    public static LocalDate parseDate(String d1){ // String을 날짜로 파싱하여 반환
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(d1,dtf);
    }

    public static long getDiffYear(Temporal d1, Temporal d2){ // 두 날짜간의 연차를 반환
        LocalDate ld1 = LocalDate.from(d1);
        LocalDate ld2 = LocalDate.from(d2);
        Period period = Period.between(ld1,ld2);
        return period.getYears();
    }

    public static String getPastDateAsString(Temporal d1,int yearsAgo){ // x년전 날짜를 String으로 포맷하여 반환
        LocalDate ld = LocalDate.from(d1);
        LocalDate targetLd = LocalDate.of(ld.getYear()-yearsAgo,ld.getMonth(),ld.getDayOfMonth());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        return dtf.format(targetLd);
    }


    public static List<LocalDate> sortDates(boolean isAscending, String... dates) { // String 타입을 날짜로 파싱해 정렬한 리스트를 반환
        if (dates.length < 2) {
            return Collections.emptyList();
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        List<LocalDate> dateList = Arrays.stream(dates)
                .map(date -> LocalDate.parse(date, dtf))
                .collect(Collectors.toList());

        dateList.sort(isAscending ? LocalDate::compareTo : Collections.reverseOrder());
        return dateList;
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2020,05,29,11,23); // LocalDateTime 객체 생성
        LocalDateTime ldt2 = LocalDateTime.now();
        int month = ldt2.getDayOfMonth();
        int year = ldt2.getDayOfYear();
        DayOfWeek day = ldt2.getDayOfWeek(); // enum 반환
        LocalDate ld = parseDate("20220303");
    }
}
