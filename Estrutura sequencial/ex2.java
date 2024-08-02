import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;
        
        raio = sc.nextDouble();
        area = pi * (raio * raio);

        System.out.println("A area é de: " + area);

        sc.close();
    }
}
