import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List liste = new List();
        int secim = -1;
        while (secim != 0) {
            System.out.println("1- basa ekle");
            System.out.println("2- sona ekle");
            System.out.println("3- araya ekle");
            System.out.println("4- bastansil");
            System.out.println("5- aradansil");
            System.out.println("6- sondansil");
            System.out.println("7- tersten yazdir");
            System.out.println("0- çıkış");
            System.out.print("seçiminiz: ");
            secim = scanner.nextInt();

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
                    liste.aradansil();
                    break;
                case 6:
                    liste.sondansil();
                    break;
                case 7:
                    liste.terstenyazdir();
                    break;
                case 0:
                    System.out.println("çıkış yaptınız");
                    break;
                default:
                    System.out.println("hatalı seçim [0-4]");
                    break;
            }
            liste.yazdir();
        }
    }
}