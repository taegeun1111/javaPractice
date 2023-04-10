package reStudy.day0410.time;

import bookLogin.util.Utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("now1 = " + nowDateTime);

        Utility.makeLine();
        int year = nowDateTime.getYear();
        System.out.println("year = " + year);

        LocalDateTime of = LocalDateTime.of(2025, 5, 12, 23, 00);
        System.out.println("of = " + of);

        LocalDateTime rentalDate = LocalDateTime.now();

        LocalDateTime localDateTime = rentalDate.plusDays(3);
        System.out.println("localDateTime = " + localDateTime);


        LocalDate test1 = LocalDate.of(2019, 12, 28);
        LocalDate test2 = LocalDate.of(2022, 3, 28);
        long between = ChronoUnit.DAYS.between(test1, test2);
        System.out.println("between = " + between);

        //날짜 포맷 바꾸기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");
        String format = nowDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }
}
