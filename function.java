import java.util.* ;
public class function {
    public static int sumOfNum(int a , int b){
        int sum = a + b;
        return sum;
    }

    public static int multiply(int a , int b){
        int product = a * b ;
        return product;
    }

    public static int factorial(int n){
        int result = 1;
        for(int i = 1 ; i <=n ;i++){
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n , int r){
        int result = factorial(n) / (factorial(r) * factorial(n-r));
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(sumOfNum(a, b));
        // int result = multiply(a, b);
        // System.out.println(result);

        int n = sc.nextInt();
        // System.out.println("Factorial of "+ n +" is = "+ factorial(n));
        int r = sc.nextInt();
        System.out.println(binomialCoefficient(n,r));

    }
}
