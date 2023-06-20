import java.util.Scanner;
public class vucutKitleIndeksHesaplama {
    public static void main(String[] args) {
        //Kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        //Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //Formül: Kilo (kg) / Boy(m) * Boy(m)

        double kg , boy ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        kg = scan.nextDouble();

        System.out.print("Boyunuzu giriniz : ");
        boy = scan.nextDouble();

        double indeks = kg / (boy * boy) ;
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);









    }
}
