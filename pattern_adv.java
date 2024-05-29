import java.util.*;

public class pattern_adv {

//-----------hollow rectangle pattern--------------

    public static void hollowRect(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//-----------inverted and rotated half pyramid---------------

    public static void invPyramid(int n){
        for(int i = 1; i<=n ; i++){
            for(int j=1 ; j<=n-i ;j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//------------floyds triangle-------------

    public static void floydsTriangle(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(count+" ");
                count++ ;
            }
            System.out.println();
        }
    }

//----------binary trangle------------

    public static void binTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

//-------------butterfly pattern----------------

    public static void butterflyPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

// ----------------solid rhombus-------------

    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//------------------hollow rhombus------------------

    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//-------------diamond pattern----------------

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //-------numer pyramid--------------

    public static void numPyr(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter number of rows : " );
        // int row = sc.nextInt();
        // System.out.print("enter number of columns : ");
        // int col = sc.nextInt();
        // hollowRect(row ,col);
        int n = sc.nextInt();
        // invPyramid(n);
        // floydsTriangle(n);
        // binTriangle(n);
        // butterflyPattern(n);
        // rhombus(n);
        // hollowRhombus(n);
        // diamond(n);
        numPyr(n);
    }
}
