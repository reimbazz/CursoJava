package ExcercicioSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();

        System.out.println("How many students for course A? ");
        Integer a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int code = sc.nextInt();
            set.add(new Student(code));
        }
        System.out.println("How many students for course B? ");
        Integer b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int code = sc.nextInt();
            set.add(new Student(code));
        }
        System.out.println("How many students for course C? ");
        Integer c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int code = sc.nextInt();
            set.add(new Student(code));
        }
        System.out.println("Total students:" + set.size());


        sc.close();
    }
}
