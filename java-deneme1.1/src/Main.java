import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
// değişkenler
        int mat,fizik,kimya,türkce,tarih,muzik ;
        Scanner imput = new Scanner(System.in);


        System.out.print(" Matematik notunu giriniz: ");
        mat = imput.nextInt();




        System.out.print(" Fizik notunu girniz: ");
        fizik = imput.nextInt();



        System.out.print(" Kimya notunu giriniz: ");
        kimya = imput.nextInt();


        System.out.print(" Türkçe notunu giriniz : ");
        türkce = imput.nextInt();



        System.out.print(" Tarih notunu giriniz : ");
        tarih = imput.nextInt();



        System.out.print(" Müzik notunu giriniz :");
        muzik = imput.nextInt();

       int toplam = ( mat + fizik + kimya + türkce + tarih + muzik );
       double sonuc = toplam/6.0;
       System.out.println( " Ortalamanız : " + sonuc );

       String ss = ( sonuc >= 60 ) ? "Sınıfı Geçti " : "Sınıfta Kaldı " ;
       System.out.println( ss );

    }
}