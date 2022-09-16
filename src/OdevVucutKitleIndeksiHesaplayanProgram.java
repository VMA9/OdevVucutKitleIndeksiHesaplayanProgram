import java.util.Scanner;
public class OdevVucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double kg , m , VKI;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz (Metre Cinsinden) : " );
        m = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : " );
        kg = input.nextDouble();

        VKI = kg / (m * m);
        System.out.print("Vücut Kitle İndeksiniz : " + VKI);

    }
}
