// tek tek arama islemi

public class Main {
    public static void main(String[] args) {

        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 }; // temel bir tamsayı dizisi oluşturdum
        int index = linearSearch(array, 1); // doğrusal arama fonksiyonu çağırıyoruz dizimize ulaşıp aramak istediğimiz
                                            // değeri bildiriyoruz
        if (index != -1) { // dödürülen değerin negatif bir değere eşit olup olmadığını kontrol ediyoruz
            System.out.println("dizide bulunan eleman: " + index);
        } else {
            System.out.println("eleman  bulunamadı");
        }

    }

    private static int linearSearch(int[] array, int value) { // iki tane parametre var birisi int dizisi diğeri de i
                                                              // tamsayısı yani value

        for (int i = 0; i < array.length; i++) { // indesimizi i'yi = 0' eşitledik.dizinin uzunluğundan küçük olduğu
                                                 // sürece bu işleme devam edeceğiz ve i'yi bir arttıracağız
            if (array[i] == value) { // i dizinindeki dizimizin aradığımız değere eşit olup olmadığını görmek
                                     // istiyoruz
                return i;

            }
        }
        return -1; // koruyucu değer

    }

}