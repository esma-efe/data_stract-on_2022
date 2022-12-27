import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("stack yapınızın kaç tane elemanı olsun?");
        int n = scanner.nextInt();
        Stack liste = new Stack(n);

        int secim = -1, sayi;
        while (secim != 0) {
            System.out.println("1--ekle");
            System.out.println("2--çıkar");
            System.out.println("3--en üsttekini göster");
            System.out.println("4--yazdir");
            System.out.println("0--çıkış");
            System.out.print("seçiminiz : ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("sayı : ");
                    sayi = scanner.nextInt();
                    liste.push(sayi);
                    break;
                case 2:
                    liste.pop();
                    break;
                case 3:
                    liste.goster();
                    break;
                case 4:
                    liste.print();
                    break;
                case 0:
                    System.out.println("çıkış yaptınız");
                    break;
                default:
                    System.out.println("hatakı seçim [0-4");
                    break;

            }
        }

    }
}
