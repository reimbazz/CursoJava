//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("É positivo!!");
        }
        else if (x < 0) {
            System.out.println("É negativo!!");
        }
        else if (x == 0) {
            System.out.println("É zero !");
        }

        sc.close();
    }
}
