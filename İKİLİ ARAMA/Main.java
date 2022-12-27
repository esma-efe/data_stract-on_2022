import java.util.Arrays; // dizilerin yerleşik ikili arama yöntemini kullanacağız

public class Main {
    public static void main(String[] args) {

        int dizi[] = new int[1000]; // int dizi adında bir tam sayı dizimiz var ve bu dizinin boyutu 1000'dür
        int hedef = 35; // aradığımız hedev 35

        for (int i = 0; i < dizi.length; i++) { // i dizi uzunluğunda küçük olduğu sürece i'yi birer birer arttıracağız
            dizi[i] = i; // dizimizi doldurduk
        }

        int index = binarySearch(dizi, hedef);
        if (index == -1) {
            System.out.println(hedef + " eleman bulunamadı"); // index negatife eşit olursa değer bulunamadı mesajı
                                                              // verilecek
        } else {
            System.out.println("eleman bulundu : " + index);
        }
    }

    private static int binarySearch(int[]dizi, int hedef ){
        
         int low =0; // low başlangıç 
         int high =dizi.length -1; //high bitiş

          while(low <= high){ // diziyi aramaya devam devam ediyoruz

               int middle = low + (high -low) /2; //orta indexe ulaşmalıyız
               int value = dizi[middle];

               System.out.println("orta değer :" + middle );

              if (value < hedef)low = middle +1;
              else if (value > hedef) high = middle -1;
             else return middle; // hedeff ortadaki sayıdır
      
         }
         
         return -1; //koruyucu değer değer bulunamadı anlamına gelir
    }
}
