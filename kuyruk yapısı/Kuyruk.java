public class Kuyruk {
    Node front; /// head
    Node rear; // tail
    int cnt; // sayac
    int size; // ebat

    public Kuyruk(int size) {
        this.size = size;
        cnt = 0; // kuyruk yapısı şuan boş
        front = null;
        rear = null;
    }

    void enQeue(int data) {
        if (isFull()) {
            System.out.println("kuyruk dolu ekleme yapılamaz");
        } else {
            Node eleman = new Node(data);
            if (isEmpty()) {
                front = eleman;
                rear = eleman;
                System.out.println(data + "kuyruğa ilk eleman olarak eklendi");

            } else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + "kuyruğa eklendi");

            }
            cnt++;
        }

    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("kuyruk boş silme işlemi yapılamadı");
        } else {
            System.out.println(front.data + "silindi");
            front = front.next;
            cnt--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("kuyruk boş yazdırılacak eleman yok");

        } else {
            Node temp = front;
            System.out.print("bas <--");
            while (temp != null) {
                System.out.print(temp.data + "<-- ");
                temp = temp.next;
            }
            System.out.print("son");
        }
    }

    private boolean isEmpty() {
        return cnt == 0;
    }

    private boolean isFull() {
        return cnt == size;

    }

}