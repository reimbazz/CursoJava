import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.println("A soma de  " + x + " + " + y + " é igual a: " + soma);

        sc.close();
    }
}
