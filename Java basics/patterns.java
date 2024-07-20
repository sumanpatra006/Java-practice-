import java.util.* ;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//---------square pattern----------------

        // for(int i = 1; i <= 4 ; i++){
        //     for(int j = 1; j <= 4 ;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

//----------reverse of a number ----------

        // int remainder , rev = 0;
        // int n = sc.nextInt();
        // for(; n > 0 ; n /= 10){
        //     remainder = n % 10 ;
        //     rev = rev * 10 + remainder ;
        // }
        // System.out.println(rev);

//----------star pateern --------------

        // int n = sc.nextInt();
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ;j <= i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

//--------inverted star --------------

        // int n = sc.nextInt();
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ; j <= n-i+1 ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

// ------------half pyramid-------------

        // int n = sc.nextInt();
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ;j <= i ; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.print("\n");
        // }

//---------------charachter pattern---------------

        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ;j <= i ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.print("\n");
        }



    }
}
