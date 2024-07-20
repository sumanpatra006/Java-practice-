import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int counter = 1;
        // while(counter <= 10){
        //     System.out.println(counter);
        //     counter++ ;
        // }

        // Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int n = sc.nextInt();
        // while(i <= n){
        //     System.out.print(i + " ");
        //     i++;
        // }

        //--------sum of first n natural numbers-----------

        // int i = 1 , sum = 0 ;
        // int n = sc.nextInt();
        // while(i <= n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);

        // while(true){
        //     System.out.print("Enter a number :");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue ;
        //     }
        //     System.out.println(n);

        // }

//------------number is prime or not -----------

            int n = sc.nextInt();
            for(int i = 2; i < (n) ; i++){
                if(n % i == 0){
                    System.out.println("not prime");
                    break;
                }else{
                    System.out.println("prime");
                    break;
                }
            }

    }
}
