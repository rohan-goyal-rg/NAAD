package TASK0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringtoDate {
    public static void main(String[] args) {
        String str="30-03-2021";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate=LocalDate.parse(str, formatter);

        System.out.println("The Date format is dd-mm-yyyy  " + localDate);
    }
}
