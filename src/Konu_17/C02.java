package Konu_17;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        /*
        Hesapların [i] [J] 'nin müşterinin j'de sahip olduğu para miktarı olduğu bir m x n tamsayı ızgara hesapları verilir banka.
         En zengin müşterinin sahip olduğu serveti iade edin.

        Bir müşterinin serveti, tüm banka hesaplarında bulunan para miktarıdır.
         En zengin müşteri, maksimum servete sahip olan müşteridir.
         */
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(enzengin(arr));

    }

    public static int enzengin(int[][] account) {
        int m = 3;
        int n = 4;
        int[][] accounts = {{100, 200, 300, 400}, {200, 300, 400, 500}, {300, 400, 500, 600}};
        int[] wealth = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wealth[i] += accounts[i][j];
            }
        }

        int richestCustomer = 0;
        for (int i = 1; i < m; i++) {
            if (wealth[i] > wealth[richestCustomer]) {
                richestCustomer = i;
            }
        }

        int richestWealth = wealth[richestCustomer];
        System.out.println("En zengin müşterinin serveti: " + richestWealth);

return richestWealth;

    }
}