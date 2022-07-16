import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih,
         Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
         ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        * *\
         */

        int matematik,fizik,kimya,turkce,tarih,muzik,dersSayisi;
        double ortalama = 0;
        boolean kosul;
        Scanner input = new Scanner(System.in);

        dersSayisi=6;


        System.out.print("Matematik Sınav Sonucunu Giriniz :");
        matematik = input.nextInt();
        System.out.print("Fizik Sınav Sonucunu Giriniz :");
        fizik = input.nextInt();
        System.out.print("Kimya Sınav Sonucunu Giriniz :");
        kimya = input.nextInt();
        System.out.print("Türkçe Sınav Sonucunu Giriniz :");
        turkce = input.nextInt();
        System.out.print("Tarih Sınav Sonucunu Giriniz :");
        tarih = input.nextInt();
        System.out.print("Müzik Sınav Sonucunu Giriniz :");
        muzik = input.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/dersSayisi;
        System.out.println("Ders Ortalaması : " + ortalama);
        kosul = ortalama > 60.0;
        String sonuc = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);








    }
}
