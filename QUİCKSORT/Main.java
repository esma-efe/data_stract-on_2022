public class Main {

    public static void main(String[] args) {
        int n = 50;
        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++)
            dizi[i] = dizi.length - i;
        for (int i = 0; i < dizi.length; i++)
            System.out.printf("%4d", dizi[i]);
        System.out.println();
        quickSort(dizi, 0, dizi.length - 1);
        for (int i = 0; i < dizi.length; i++)
            System.out.printf("%4d", dizi[i]);
        System.out.println();

    }

    public static void partition(int dizi[], int alt, int ust) {
        int pivot = dizi[ust]; // pivot rastgele seçilen sayıdır genelde sondan seçeriz
        int i = (alt - 1);
        for (int j = alt; j < ust; j++) { // en sağdakine pivot dedim ou da ust'e atadım
            if (dizi[j] <= pivot) { // dizinin sağına ve soluna atma işlemleri
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }
        int temp = dizi[i + 1];
        dizi[i + 1] = dizi[ust];
        dizi[ust] = temp;
        return i+1;
    

    }

    public static void quickSort(int dizi[], int alt, int ust) {
        if (alt < ust) { // algoritma kendini tekrar tekrar çağırarak pivotlar seçecek güncelleyecek
            int pi = partition(dizi, alt, ust);
            quickSort(dizi, alt, pi - 1);
            quickSort(dizi, pi + 1, ust);
        }

    }

}