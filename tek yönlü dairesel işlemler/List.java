import java.util.Scanner;

public class List {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    void basaekle() {
        int data;
        System.out.println("data : ");
        data = scanner.nextInt();
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head; /// tailin göstericisi herzaman headi gösterecek

        } else {
            eleman.next = head;
            eleman = head;
            tail.next = head; // bu herzaman aynıdır

        }
    }

    void sonaekle() {
        int data;
        System.out.println("data : ");
        data = scanner.nextInt();
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head;

        } else {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }

    void arayaekle() {
        int data, indis;
        System.out.println("indis : ");
        indis = scanner.nextInt();
        System.out.println("data : ");
        data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head;

        } else if (indis == 0) {
            eleman.next = head;
            eleman = head;
            tail.next = head;

        } else {
            int n = 0;
            Node temp2 = head;
            Node temp = head;
            while (temp != tail)
                ;
            {
                temp = temp.next;
                n++;
            }
            n++; // taili görünce duracak ama biz taile ulaşmak için yine bir arttırmalıyız.
            if (indis >= (n - 1)) {
                tail.next = eleman;
                tail = eleman;
                tail.next = head;
            } else {
                temp = head;
                int i = 0;
                while (i < indis) {
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;
            }
        }

    }

    void bastansil() {
        if (head == null) {
            System.out.println("liste boş..");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void sondansil() {
        if (head == null) {
            System.out.println("liste boş..");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) // temp tailden bir önceki eleman olacak
            {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }

    void aradansil() {
        if (head == null) {
            System.out.println("liste boş..");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            int indis, n = 0;
            System.out.println("indis : ");
            indis = scanner.nextInt();
            Node temp = head;
            Node temp2 = temp;
            while (temp != tail) // temp tailden bir önceki eleman olacak
            {
                temp = temp.next;
                n++;
            }
            n++;
            temp = head;
            int i = 0;
            while (i < indis) {
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;

        }
    }

    void yazdir() {
        if (head == null)
            System.out.println("liste bos...");
        else {
            Node temp = head;
            System.out.print("baş ->");
            while (temp != tail) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }

            System.out.println(temp.data + "-> son");
        }

    }

}
