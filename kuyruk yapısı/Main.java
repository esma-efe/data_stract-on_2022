public class Main {
    public static void manin(String[] args) {
        Kuyruk kuyruk = new Kuyruk(5);
        kuyruk.enQeue(100);

        System.out.println("kuyruktaki eleman sayısı : " + kuyruk.cnt);
        System.out.println("kuyruğun başındaki eleman :" + kuyruk.front.data);
        System.out.println("kuyruğun sonundaki eleman :" + kuyruk.rear.data);

    }
}