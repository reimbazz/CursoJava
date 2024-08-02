package exercicio_classe_abstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Tax payer #" + i + " data");
            System.out.println("Individual or company (i/c)?");
            char r = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            double income = sc.nextDouble();
            if (r == 'i') {
                System.out.println("Health expenditures: ");
                double expenditures = sc.nextDouble();
                list.add(new Individual(name, income, expenditures));
            }else{
                System.out.println("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name, income, numberEmployees));
            }

        }

        System.out.println("TAXES PAID:");
        double totalTax = 0;
        for(TaxPayer taxers : list){
            System.out.println(taxers.getName() + ": $ " + String.format("%.2f", taxers.tax()));
            totalTax += taxers.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));

        sc.close();
}
}
