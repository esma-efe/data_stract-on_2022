public class Main { // dizileri parçalayıp birleştireceğiz

    public static void main(String[] args) {
        int n = 10;
        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++)
            dizi[i] = dizi.length - i;
        for (int i = 0; i < dizi.length; i++)
            System.out.printf("%4d", dizi[i]);
        System.out.println();
        mergeSort(dizi, 0, dizi.length - 1);
        for (int i = 0; i < dizi.length; i++)
            System.out.printf("%4d", dizi[i]);
        System.out.println();

    }

    public static void mergeSort(int dizi[], int l, int r) { // sıralamayı yapan metod
        if (l < r) { // sol dizi sağ diziden küçük olduğu sürece (kendine gönerme işlemi yapıcaz)
            int m = l + (r - l) / 2; // ortasını buluyor
            mergeSort(dizi, l, m); // left ve ortayı kendine gönderiyor
            mergeSort(dizi, m + 1, r); // burası dadizinin sağ tarafı
            merge(dizi, l, m, r); // her defasında gelip bunu çalıştırıcaz
        }
    }

    public static void merge(int dizi[], int l, int m, int r) { // left middle right
        int nl = m - l + 1;
        int nR = r - m;
        int[] left = new int[nl]; // yeni bir left dizisi
        int[] right = new int[nR]; // yeni bir right dizisi
        for (int i = 0; i < nl; i++)
            left[i] = dizi[l + i];
        for (int j = 0; j < nR; j++)
            right[j] = dizi[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < nl && j < nR) {
            if (left[i] <= right[j]) {
                dizi[k] = left[i];
                i++;
            } else {
                dizi[k] = right[j];
                j++;

            }
            k++;

        }

        while (i < nl) { // sol taraf arttıysa
            dizi[k] = left[i];
            i++;
            k++;
        }

        while (j < nR) { // sağ taraf arttıysa
            dizi[k] = right[j];
            j++;
            k++;
        }
    }

}
