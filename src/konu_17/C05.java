package konu_17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class C05 {
    public static void main(String[] args) {
        /*
        Ali'nin kaç ay yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 4 Haziran 1997'dir.
         */
        LocalDate ali=LocalDate.of(1997,6,4);
        LocalDate bugun=LocalDate.now();

        long yasadigiAy= ChronoUnit.MONTHS.between(ali,bugun);
        System.out.println(yasadigiAy);
    }
}
