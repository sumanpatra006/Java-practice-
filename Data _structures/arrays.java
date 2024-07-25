import java.util.*;
public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //declaration or creation of array-----
        int newArr[] = new int[50];
        String names[] = {"suman","pradeep","manav"};
        int marks[] = {1,2,3,4};

        newArr[0] = sc.nextInt();
        newArr[1] = sc.nextInt();

        System.out.println("1st element : "+ newArr[0]);
        System.out.println("2nd element : "+ newArr[1]);
        System.out.println("3rd element : "+ newArr[2]);
    }
}
