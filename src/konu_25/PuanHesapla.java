package konu_25;

public class PuanHesapla {



    public static int[] calculatePoints(int[] points) {

        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        int average = sum / 11;
        int[] result = new int[11];
        for (int i = 0; i < result.length; i++) {
            result[i] = points[i] - (average - 10);
        }
        return result;
    }



}
