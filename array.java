//sorting of two array.
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        there will be two  different arrays
        System.out.print("enter the size of array:");

        int[] arr1=new int[array];
        int[] arr2=new int[array];

        System.out.print("enter the element of first array:");
        for(int i=0;i<array;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("enter the element of second array:");
        for(int i=0;i<array;i++){
            arr2[i]=sc.nextInt();
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("array are equals");
        }else{
            System.out.println("array are not equals");
        }
        

    }
}
adding the array.
import java.util.*;
public class array{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        int[] result=new int[arr1.length+arr2.length];
        
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
            for(int i=0;i<arr2.length;i++){
                result[arr1.length+i]=arr2[i];
            }
            System.out.println(Arrays.toString(result));
    }
}
reverse the array .
public class array{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            arr[l]=arr[l]^arr[r];
            arr[r]=arr[l]^arr[r];
            arr[l]=arr[l]^arr[r];
            l++;
            r--;
        }
        for(int x:arr){
            System.out.print(x+" ");

        }
    }
}
/// return the max value for array .(O(n))).
public class array{
    public static void main(String[] args) {
        int[] arr={2,45,6,5,4};
        int max=findMax(arr);
        System.out.println("the maximum value is:"+max);
    }
        public static int findMax(int[] arr){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
return max;
        
    }

}
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       // System.err.println(arr[4]);

        int nums[]=new int[4];
        nums[0]=2;
        nums[1]=4;
        nums[2]=6;
        nums[3]=8;
       // System.out.println(nums[2]);
       // System.out.println("Hello, Arrays!");
       int marks[]=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the element of marks:");
       for(int i=0;i<5;i++){
           marks[i]=sc.nextInt();
       }
       System.out.println();
       for(int i=0;i<5;i++){
           System.out.println("Element of marks:"+marks[i]);
       }
       System.out.println(marks.length);
    }
}
public class arrays{
    public static int linearsearch(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14,16};
        int target=10;
                     for(int i=0;i<nums.length;i++){
                        if(nums[i]==target){
                            System.out.println("found");
                        }else{
                            System.out.println("not found");
                        }
        }
        int result=linearsearch(nums,target);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found");
        }

    }
}
public class arrays{
    public static void main(String[] args){
        int nums[]={1,2,6,3,5};
        int largest=Integer.MIN_VALUE ;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }        System.out.println("largest element in the array is:"+largest);
        System.out.println("smallest element in the array is:"+smallest);
        //int largest=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>largest){
        //         largest=nums[i];
        //     }
        // }
        // System.out.println("largest element in the array is:"+largest);
    }
}

binary search 
public class arrays{
    public static int binarysearch(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14,16};
        int target=100;
        System.out.println("Element found at index: "+binarysearch(nums, target));
    }
}
reverse an array;
public class arrays{
    public static void reverse(int nums[]){
        int start=0,end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5};
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(); // Print a newline after printing all elements
         
    }
}
pairs in array.
public class arrays{
    public static void pairs(int nums[]){
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+") ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        pairs(nums);
    }}


subarray of an array
public class arrays{
    public static void subarray(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                    sum=sum+nums[k];
                }
                System.out.println("Sum of subarray: "+sum);
                 sum=0;
            }
            System.err.println("");
        }
    }
        public static void main(String[] args) {
       // int nums[]={2,4,6,8,10};
       int nums[]={1,-2,6,-1,3};
        subarray(nums);
       
    }
}
max subarray sum.
public class arrays{
    public static void kadanes(int nums[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("Maximum subarray sum is: "+maxsum);
    }
    public static void main(String[] args){
         int nums[]={-2,-3,4,-1,-2,1,5,-3};
        //int nums[]={-1,-2,-3,-4};
        kadanes(nums);
         
    }
}

trapping rain water problem. // O(n) time complexity and O(n) space complexity 
public class arrays{
    public static int trappedRainwater(int height[]){
        int n=height.length;    
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]); 
    }
    rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5}; 
        System.out.println("Trapped rainwater: "+trappedRainwater(height));
        
    }}
 
    buy and sell stock problem.
    public class arrays{
        public static int buyandsell(int prices[]){
            int buyprice=Integer.MAX_VALUE;
            int maxprofit=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<buyprice){
                    buyprice=prices[i];
                }else if(prices[i]-buyprice>maxprofit){

                    maxprofit=prices[i]-buyprice;
                }
            }
            return maxprofit;
        }
        public static void main(String[] args) {
            int prices[]={7,1,5,3,6,4};
            System.out.println("Maximum profit: "+buyandsell(prices));
        }}

    //// 2d array.////////
import java.util.*;
public class arrays{
    public static boolean search(int matrix[][],int target){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("Element found at index: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("not found in the matrix");
       return false;
    }
    public static void main(String[] args){
        int matrix[][]=new int[3][3];
        int n=3;
        int m=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix,5 );
    }
}
    ///////// spiral matrix.////////
public class arrays{
    public static void printsprial(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top///
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right//
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom//
            if(startRow!=endRow){
                for(int j=endCol-1;j>=startCol;j--){
                    System.out.print(matrix[endRow][j]+" ");
                }
            }
            //left//
            if(startCol!=endCol){
                for(int i=endRow-1;i>startRow;i--){
                    System.out.print(matrix[i][startCol]+" ");
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
//     /// diagonal sum.//////////////
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal////////////
            sum+=matrix[i][i];
            //secondary diagonal//////////////
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
        /////////////////////////////////////O(n^2).
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){// o(n).
            //primary diagonal////////////
            sum+=matrix[i][i];
            ///secondary diagonal//////////////
             if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

    printsprial(matrix);
     System.out.println("Diagonal sum: "+diagonalsum(matrix));
        
    }}
// search in sorted matrix.////////
public class arrays{
    public static boolean staircase(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Element found at index: ("+row+","+col+")");
                return true;
            }else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
                        int key=100;
                        staircase(matrix,key);
    }
}
