public class Main {
    public static void main(String[] args) {
        Tablo hashTablo = new Tablo(5); // boyut istedi bizden
        hashTablo.ekle(0, "ESMA"); // ilk düğüm ESMA
        hashTablo.ekle(10, "AYŞE"); // 10 /5 ten kalan sıfır olduğu için murat esmanın yarına eklendi 0. indis yani
        // kalan kaçıncı indise ekleneceğini verir.

        System.out.println(hashTablo.dizi[0].next.isim); // sıfırıncı indiste ilk kim var?
        System.out.println(hashTablo.dizi[0].next.next.isim); // aynı indiste ilk sıradan sonra kim var?

        hashTablo.sil(0);
        System.out.println();
        hashTablo.yazdir();

    }

}