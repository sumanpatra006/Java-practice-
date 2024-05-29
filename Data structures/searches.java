import java.util.*;
public class searches {

//--------algorith for linear search----------

    public static void linearSearch(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("index of the key is : " + i);
            }
        }
    }

//------------algorith for getting the maximum element of an array-----------

    public static int largestElem(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12,14,16,5,8,2,4,11};
        // linearSearch(arr, 10);
        System.out.println(largestElem(arr));
    }
}
