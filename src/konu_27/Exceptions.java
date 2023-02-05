package konu_27;

import javax.sound.midi.Track;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        int yas=scan.nextInt();
        try {
            mekan_kontrol(yas);
        } catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez...");
        }
    }

    private static void mekan_kontrol(int yas) {
        if (yas<18){
            throw new ArithmeticException();
        }else {
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
}
