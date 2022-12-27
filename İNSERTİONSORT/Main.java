package İNSERTİONSORT; // eklemeli sıralama algoritması

import java.util.Scanner; // kütüphane

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç adet sayı girmek istersiniz : "); // kullanıcıdan sayı istiyoruz
        int n = scanner.nextInt(); // nesne oluşturuluyor bu şekilde
        int[] dizi = new int[n]; // dizi oluşturuldu boyu ve elemanı kuulanıcıdan alınacak
        for (int i = 0; i < n; i++) // kaç tane sayı istersek for o kadar dönecek
        {
            System.out.println("sayı : ");
            dizi[i] = scanner.nextInt(); // sırayla sayı isteyip i. indise kaydedicez

        }
        insortSort(dizi, n); // metod oluşturup boyut ve eleman göndericez
        System.out.println("sıralama işlemi tamamlandı"); // mesaj veriyoruz

        for (int i = 0; i < n; i++) {
            System.out.println("  " + dizi[i]); // yazdırma işlemi dizinin i. değerini yazacak
        }

    }

    private static void insortSort(int[] dizi, int n) { // otomatik metod oluşturma
        for (int i = 1; i < n; i++) { // sıfırıncı indisi kendisiyle kıyaslamamın bir anlamı yok o yüzden i = 1.
                                      // indisten başlanmalı (n-1 kadar döner)
            for (int k = i; k > 0; k--) { // kendisinden önceki sayılara doğru gidicek indisleri geriye doğru
                                          // gezicek(geriye doğru gider)
                if (dizi[k] < dizi[k - 1]) { // kıyas durumu yani kendisinden bir önceki eleman ile kıyaslama işlemidir
                    int temp = dizi[k]; // geçici değişkendir kıyaslama için bize yardım eder
                    dizi[k] = dizi[k - 1]; // atama (yer değiştirme)
                    dizi[k - 1] = temp; // atama (yer değiştirme)
                }
            }
        }

    }

}