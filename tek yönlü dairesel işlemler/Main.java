import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List liste = new List();
        int secim = -1;
        while (secim != 0) {
            System.out.println("1--basa ekle ");
            System.out.println("2--sona ekle ");
            System.out.println("3--araya ekle");
            System.out.println("4--bastan sil");
            System.out.println("5-- sondan sil");
            System.out.println("6--aradan sil");
            System.out.println("0-- cikis ");
            System.out.print("seçiminiz : ");

            secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    liste.basaekle();
                    break;
                case 2:
                    liste.sonaekle();
                    break;
                case 3:
                    liste.arayaekle();
                    break;
                case 4:
                    liste.bastansil();
                    break;
                case 5:
                    liste.sondansil();
                    break;
                case 6:
                    liste.aradansil();
                    break;

                case 0:
                    System.out.println("çıkış yaptınız");
                    break;
                default:
                    System.out.println("hatalı seçim yaptınız [0-6");
            }
            liste.yazdir();

        }

    }

}
