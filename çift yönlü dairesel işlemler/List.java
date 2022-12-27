import java.util.Scanner;

public class List {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null; /// nesne oluşturulmadı bunlar sadece gösterici
    Node temp = null;
    Node temp2 = null;
    int data, indis;

    void basaekle() {
        System.out.println("data : ");
        data = scanner.nextInt(); // düğüme bu datayı ekliycez datayı aldık
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head; // tek düğüm olduğu için 4 durum incelendi
            tail.next = head;
            head.prev = tail;

        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman; // head güncellendi taillle olan durumu incele
            head.prev = tail;
            tail.next = head;
        }

    }

    void sonaekle() {
        System.out.println("data : ");
        data = scanner.nextInt(); // düğüme bu datayı ekliycez datayı aldık
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head; // tek düğüm olduğu için 4 durum incelendi
            tail.next = head;
            head.prev = tail;

        } else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }

    void arayaekle() {
        System.out.println("indis: ");
        indis = scanner.nextInt();
        System.out.println("data : ");
        data = scanner.nextInt(); // düğüme bu datayı ekliycez datayı aldık
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head; // tek düğüm olduğu için 4 durum incelendi
            tail.next = head;
            head.prev = tail;

        } else if (indis == 0) // başa ekleme ile aynı şey
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            head.prev = tail;
            tail.next = head;
        }

        else {
            temp = head;
            temp2 = temp;
            int n = 0;
            while (temp != tail) {
                n++; // n eleman sayısıdır
                temp = temp.next;
            }
            temp = head;
            int i = 0; // i indis demek
            while (i < indis) {
                temp2 = temp; // temp ekleyeceğimiz indisi tutar temp2 ise tempin bir öncesini tutar
                temp = temp.next;
                i++;
            }

            if (n < indis) // taile eklemek istiyoruz demek
            {
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
                tail.next = head;
                head.prev = tail;
            } else {
                temp2.next = eleman;
                eleman.prev = temp2;
                eleman.next = temp;
                temp.prev = eleman; // araya ekleme gerçekleştirildi
            }

        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("liste bos..");
        } else {
            temp = head;
            System.out.println("bas -->");
            while (temp != tail) {
                System.out.println(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println(temp.data + "--> son");
        }
    }

    void terstenyazdir() {
        if (head == null) {
            System.out.println("liste bos..");
        } else {
            temp = tail;
            System.out.println("son -->");
            while (temp != head) {
                System.out.println(temp.data + "-->");
                temp = temp.prev;
            }
            System.out.println(temp.data + "--> bas");
        }
    }

    void bastansil() {
        if (head == null) {
            System.out.println("liste boş");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void sondansil() {
        if (head == null) {
            System.out.println("liste boş");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            head.prev = tail;
        }
    }

    void aradansil() {
        if (head == null) {
            System.out.println("liste boş..");
        } else {
            System.out.println("indis : ");
            indis = scanner.nextInt();
            if (indis == 0 && head == tail) {
                head = null;
                tail = null;
            } else if (indis == 0 && head != tail) {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            } else {
                int n = 0;
                temp = head;
                while (temp != tail) {
                    n++;
                    temp = temp.next;
                }
                if (indis >= n) {
                    tail = temp;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    temp = head;
                    temp2 = temp;
                    int i = 0;
                    while (i < indis) {
                        i++;
                        temp2 = temp;
                        temp = temp.next;
                    }
                    temp2.next = temp.next;
                    temp.next.prev = temp2;
                }

            }
        }

    }

}