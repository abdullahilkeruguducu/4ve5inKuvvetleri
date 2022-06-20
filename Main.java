import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int k;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Sinir Sayisi Giriniz :");
        k = girdi.nextInt();

        for (int i =1; i<=k; i*=4){
            System.out.println("4'un kuvveti :" + i);
        }
        for (int s=1;s<=k;s*=5){
            System.out.println("5'in kuvveti :" + s);
        }
    }
}