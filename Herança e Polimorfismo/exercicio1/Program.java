package exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Product # " + i + "data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char r = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println();
            System.out.println("Price: ");
            Double price = sc.nextDouble();
            if (r == 'i') {
                System.out.println("Customs fee: ");
                Double customsfee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsfee));
            }
            else if (r == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY):");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
            }
            else{
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
