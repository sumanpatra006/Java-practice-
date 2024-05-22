import java.util.*;
public class conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age >= 18){
        //     System.out.println("You are eligible for voting and driving");
        // }else{
        //     System.out.println("You are not eligible");
        // }

//-------------odd even----------------

        // int a = sc.nextInt();
        // if(a % 2 == 0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }

        //-------------tax calculator-----------

        // long salary = sc.nextLong();
        // if(salary < 500000){
        //     System.out.println("Tax is " + salary * 0);
        // }else if (salary >=500000 && salary <= 1000000){
        //     System.out.println("tax is " + salary * 0.2);
        // }else{
        //     System.out.println("tax is "+ salary * 0.3);
        // }

        //---------------ternary operator---------------

        int a = sc.nextInt();
        String type = (a % 2 == 0)?"even":"odd";
        System.out.println(type);

    }
}
