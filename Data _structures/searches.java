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

//-----------binary search--------------------

    public static int binarySearch(int arr[] , int key){
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = ( start + end )/2 ;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid - 1 ;
            }
            if(arr[mid]<key){
                start = mid + 1 ;
            }
        }
        return -1 ;
    }


// --------print array-------------

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

// ------------reverse of array---------------------

    public static void reverseArray(int arr[]){
        int start = 0 , end = arr.length-1;
        while(start <= (start + end)/2 ){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }


//----------pairs in an array------------

    public static void pairInArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i]+","+ arr[j] + ") , ");
            }
        }
    }

//---------------subarrays of an array-----------------

    public static void subarrays(int arr[]){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    System.out.print(arr[k] + " " );
                    if(sum > max){
                        max = sum ;
                    }
                    if(sum < min){
                        min = sum ;
                    }
                }
                System.out.print("] ");
                System.out.println("sum for this subarray is : " + sum);
            }
            System.out.println();
        }
        System.out.println("maximum sum of subarray is : " + max);
        System.out.println("minimum sum of subarray is : " + min);
    }

//---------main function----------------
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12,14,16,5,8,2,4,11};
        int searchArr[] = {1,2,3,4,5};
        int newArr[] = {5,21,27,35,2} ;
        int arr2[] = {1,-2,6,-1,3};
        // linearSearch(arr, 10);
        // System.out.println(largestElem(arr));
        // int result = binarySearch(searchArr, 1);
        // if(result == -1){
        //     System.out.println("element is not present in the array");
        // }else{
        //     System.out.println("the index of the element is " + result);
        // }
        reverseArray(arr);
        // printArray(arr);
        // pairInArray(searchArr);
        // subarrays(arr2);
    }
}
