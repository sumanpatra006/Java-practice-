import java.util.* ;
public class function {

//----------function to calculate sum of two numbers ----------------

    public static int sumOfNum(int a , int b){
        int sum = a + b;
        return sum;
    }

//-------------function to calculate product of two number--------------- 

    public static int multiply(int a , int b){
        int product = a * b ;
        return product;
    }

//------------function to find factorial of a number------------------

    public static int factorial(int n){
        int result = 1;
        for(int i = 1 ; i <=n ;i++){
            result *= i;
        }
        return result;
    }

//------------function to calculate the binomial coefficient of a number-------------

    public static int binomialCoefficient(int n , int r){
        int result = factorial(n) / (factorial(r) * factorial(n-r));
        return result;
    }

//---------------function to check number is prime or not-----------------

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

//-------------function to print prime numbers in a range------------------

    public static void primeInRange(int n){
        for(int i = 2 ; i<=n ; i++){
            if(isPrime(i)==true){
                System.out.print(i + " ");
            }
        }
    }

//------------function to convert binary to decimal----------------------

    public static int binaryToDecimal(int n){
        int m=0;
        int number =0;
        while(n > 0){
            int lastdigit = n%10;
            number = number + (int)Math.pow(2, m) * lastdigit ;
            m++;
            n/=10;
        }
        return number;
    }

//-----------function to convert decimal to binary---------------

    public static int decToBin(int n){
        int pow=0,binNum=0;
        while(n>0){
            int remainder = n%2;
            binNum += (int)Math.pow(10, pow) * remainder ;
            n /= 2;
            pow++;
        }
        return binNum;
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
        // int r = sc.nextInt();
        // System.out.println(binomialCoefficient(n,r));
        // System.out.println(isPrime(n));
        // primeInRange(n);
        // System.out.println(binaryToDecimal(n));
        System.out.println(decToBin(n));

    }
}
