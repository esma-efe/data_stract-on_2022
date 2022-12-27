public class Tablo {
    Node dizi[]; // dizi oluşturuldu
    int size; // dizinin boyutunu kullanıcı girecek (main sınıfında)

    public Tablo(int size) { // tablo oluşturulacak
        this.size = size;
        dizi = new Node[size]; // dizi tamamen tanımlandı
        for (int i = 0; i < size; i++) { // göstericileri boş olan yerlere boş düğümleri tek tek ekleme işlemi
            dizi[i] = new Node();

        }

    }

    int indexUret(int key) // key girilen değerdir size'a göre mod alıp kalanı da eklenecek olan indisin
                           // numarasını verecek
    {
        return key % size; // mod alma işlemi
    }

    void ekle(int key, String isim) {
        int index = indexUret(key);

        Node eleman = new Node(key, isim); // ekleme yapmak için düğüm haline getirmek gerekir

        Node temp = dizi[index]; // geçici temp
        while (temp.next != null) // ilgli bağlı listenin sonuna ekleme yaptı
            temp = temp.next;
        temp.next = eleman;
        System.out.println(eleman.isim + "  eklendi");

    }

    void sil(int key) {
        int indis = indexUret(key); // silinecek düğümün hangi dizi indisinde olduğu bilgisi
        Node temp = dizi[indis]; // dizinin indisinci değerini tutacak
        Node temp2 = dizi[indis];

        if (temp.next == null) // bu dizinin bu indisinde sadece gösterici var demektir
        {
            System.out.println(key + "  numaralı kayıt yok");
        } else if (temp.next.next == null && temp.next.key == key) // bu dizinin bu indisinde bir tane düğüm var ve bu
                                                                   // düğüm silmek istediğimiz düğümdür
        {
            temp.next = null; // silme işlemi tamamlandı
            System.out.println(key + " silindi ");

        } else {
            while (temp.next != null) {
                if (temp.next.key == key) // aradığımız key parametresini arayalım
                {
                    temp2.next = temp.next;
                    System.out.println(key + " silindi ");
                }

                temp2 = temp;
                temp = temp.next;
            }
        }

    }

    void yazdir() {
        for (int i = 0; i < size; i++) {
            Node temp = dizi[i];
            System.out.println("dizi[" + i + "] -> ");
            if (temp.next != null)
                while (temp.next != null) {
                    System.out.print(temp.key + " - " + temp.isim + " -> ");
                    temp = temp.next;

                }
            System.out.println();

        }
    }
}