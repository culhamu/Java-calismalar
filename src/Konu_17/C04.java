package Konu_17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class C04 {
    public static void main(String[] args) {
        /*
        Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 12 Mayıs 2002'dir.
         */
        LocalDate aliDogum=LocalDate.of(2002,5,12);
        LocalDate bugun=LocalDate.now();

        long yasadigiGun= ChronoUnit.DAYS.between(aliDogum,bugun);
        System.out.println(yasadigiGun);

    }
}
