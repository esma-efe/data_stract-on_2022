package BUBBLESORT; // en büyük değeri bulup en sona taşıma işlemi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // nesne oluşturma
        int n;
        System.out.print("kaç adet sayı girmek istersiniz : ");
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) { // kullanıcıdan sayıları alıcaz
            System.out.print("sayı :  "); // sayıları biz giricez
            dizi[i] = scanner.nextInt();

        }
        bubbleSort(dizi, n); // dizi ve dizinin boyutu
        System.out.println("bubble sort ile sıralama işlemi yapıldı");
        for (int i = 0; i < n; i++) {

            System.out.print(dizi[i] + " "); // sayıları yazıyoruz
        }

    }

    private static void bubbleSort(int[] dizi, int n) { // bubbble sort fonksiyonu oluşturduk
        for (int i = 0; i < n - 1; i++) { // dış for: sayı -1 kadar
            for (int j = 0; j < n - i - 1; j++) { /// iç for: son sayı kıyaslanmaz
                if (dizi[j] > dizi[j + 1]) { // peşpeşe gelen iki sayı kıyaslanır
                    int gecici = dizi[j]; // yer değiştirme
                    dizi[j] = dizi[j + 1];// atama işlemi
                    dizi[j + 1] = gecici; // atama işlemi
                }
            }

        }
    }
}