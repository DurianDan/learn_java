package mypack;

import java.time.Duration;
import java.time.LocalDateTime; // import the LocalDate class
import java.time.format.DateTimeFormatter;


public class LearnDateTime {
    public static void testLearn(){        
        CommonUtils.printSection("LocalDateTime");
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Now is: " + nowDateTime);

        // Format and parse localdatetime
        String endDatetimeString = "2024-01-19 19:30";
        DateTimeFormatter myFormatObj = DateTimeFormatter
        .ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime endDatetime = LocalDateTime
        .parse(endDatetimeString, myFormatObj );
        System.err.println("End is: "+myFormatObj.format(endDatetime));

        // calculate datetime diff
        float daysBetweenNowToEnd = (float) Duration
        .between(nowDateTime, endDatetime).toDays();
        System.out.println("Days between now to end is: " + daysBetweenNowToEnd);

    }
}
