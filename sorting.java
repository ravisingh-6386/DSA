// //Bubble sort.
import java.util.*;

public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int arr[]={7,8,3,2,1};
        //int arr[]={99,78,88,980,100};
     //bubble sort
     for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;  
            }
        }
     }
     System.out.println("Sorted elemnt is:");
     printArray(arr);

    }
    
}

import java.util.*;
public class sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ente the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("enter the element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
           / main code /////////////
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("sorted element is:");
        printArray(arr);

    }
}
//selection sort. time complix=o(n^2);
import java.util.*;
public class sorting{
    public static void printSelection(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("Enter the element of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
           //// code main///////////
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                smallest=j;

            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    printSelection(arr);
    }
}

 //insertion sort. time complix=O(n^2);
 import java.util.*;
public class sorting{
    public static void printInsertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("Enter the element of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ///////// code for sort ///////
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
              arr[j+1]=arr[j];
              j--;  

            }
            arr[j+1]=current;
        }
    printInsertion(arr);
}
}

/// 1)Bubble sort.
public class sorting {
    public static void bubblesort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // 2)selection sort.
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int minpos=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
           }
           int temp=arr[minpos];
           arr[minpos]=arr[i];
           arr[i]=temp;
        }
    }

    // 3)insertion sort. //o(n^2) in worst case and o(n) in best case when array is already sorted.
    public static void insertionsort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0 && nums[prev]>curr){ ///or ascending order > and or descending order <.
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
    }

    // countiong sort. //o(n+k) where n is number of elements in array and k is range of input.
    public static void countiongsort(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
       int nums[]={5,4,1,3,2};
Integer nums[]={5,4,1,3,2};
        bubblesort(nums); 
        printarr(nums);

        selectionsort(nums);
        printarr(nums);

        insertionsort(nums);
        printarr(nums);

       Arrays.sort(nums);
               Arrays.sort(nums,Collections.reverseOrder());
            
               printarr(nums);
            countiongsort(nums);
            printarr(nums);
    }//O(n^2)
    
}













