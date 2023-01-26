package konu_17;

import java.util.ArrayList;
import java.util.List;

public class C03 {
    public static void main(String[] args) {
        /*
        Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
         */
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        if(!h.contains(15) && !h.contains(13)){
            System.out.println("Liste 13 ve 15'i icermiyor");
        }else {
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i) == 15) {
                    h.remove((Integer) 15);
                    i--;
                }
                if (h.get(i) == 13) {
                    h.remove((Integer) 13);
                    i--;
                }
            }
            System.out.println(h);
        }
    }
}
