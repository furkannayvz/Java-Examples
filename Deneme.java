public class Deneme {
    public static void main(String[] args) {
        System.out.println("Merhaba!");

        //-128 ile 127 arasında değer alır 1 byte

        byte number = 120;

        System.out.println(number);

        //-32768 ile 32767 arasında değer alır 2 byte

        short numberr = 10000;
        System.out.println(numberr);

        // 9 basamaklı sayılar için kullanılır  4 byte
        
        int numberrr = 567890;
        System.out.println(numberrr);
        
        //Çok büyük sayılar için 8 byte

        long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);

        // 7 basamaklı değerler alabilir 4 byte

        float maxdeger = Float.MAX_VALUE;
        float mindeger = Float.MIN_VALUE;
        System.out.println(maxdeger);
        System.out.println(mindeger);

        float ondaliksayi = 16.7678f;

        System.out.println(ondaliksayi);

        // Ondalıklı sayıları tanımlamak için kullanılır 17 basamak alabilir 8byte

        double sayi = 1.34567890543;
        System.out.println(sayi);

        // Ya true ya da false değeri alır

        boolean sonuc = 5 > 2;
        System.out.println(sonuc);

        // Karakter tanımlamak  2 byte

        char karakter = 'a';
        System.out.println(karakter);

        // String metinsel ifadeler için kullanılır 

        String metin = "Furkan"  + " ayvaz";
        System.out.println(metin);

    }
}
