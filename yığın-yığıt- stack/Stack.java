public class Stack {
    int size; // boyut
    int cnt; // sayac demektir. eleman ekledikçe artacak eleman sildikçe silecek
    Node top; // en üst düğümü tutan gösterici head gibi düşünebiliriz

    public Stack(int size) {
        this.size = size;
        cnt = 0; // yapıyı oluşturduk ama boş
        top = null;
    }

    void push(int data) // ekleme
    {
        Node eleman = new Node(data);
        if (isFull()) {
            System.out.println("  stack dolu ekleme yapmadı ");
        } else {
            if (isEmpty()) {
                top = eleman; // oluşturulan eleman top olarak atandı

                System.out.println(top.data + "  stacke ilk eleman olarak eklendi");
            } else {
                eleman.next = top;
                top = eleman;
                System.out.println(top.data + " stacke eklendi");
            }
        }
        cnt++; // ekleme yaptığım için sayacı arttırdım.

    }

    void pop() // çıkarma
    {
        if (isEmpty()) {
            System.out.println(" stack boş çıkartacak bişey yok");
        } else {
            System.out.println(top.data + "  çıkartıldı");
            top = top.next;
            cnt--; // çıkarma yaptığım için sayacı eksilttim.
        }

    }

    void print() // yazdırma fonksiyonu
    {
        if (isEmpty()) {
            System.out.println(" stack boş yazdırılacak birşey yok ");
        } else {
            Node temp = top;
            System.out.println(" stackdeki veriler \n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }

    }

    void goster() {
        if (isEmpty())
            System.out.println("stack boş");

        else

            System.out.println("en üstteki düğümüm datası :" + top.data);
    }

    boolean isFull() // dolumu
    {
        return cnt == size; // sayac boyuta eşitse stack doludur
    }

    boolean isEmpty() // boşmu
    {
        return cnt == 0;
    }

}