package exercicio_de_fixação0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            System.out.println("Employee #" + i + "data:");
            System.out.println("Outsourced (y/n)? ");
            char r = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc. nextInt();
            System.out.println("Value per hour: ");
            double value = sc.nextDouble();
            if (r == 'y') {
                System.out.println("Additional charge: ");
                double additional = sc.nextDouble();
                list.add(new OutsourceEmployee(name, hours, value, additional));
            }
            else{
                list.add(new Employee(name, hours, value));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee emp : list){
            System.out.println(emp.getName() + "- $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
    
}
