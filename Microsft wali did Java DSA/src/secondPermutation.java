import java.util.Scanner;

public class secondPermutation {
    public static void nextPermutation(int[] nums , int size) {
        int i = size - 2;
        //this while loop will find biggest number from end
        while( i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        // if find the biggest number then will find then lowest number from that i
        // after finding the lowest and highest we will swap it
        if(i>=0){
            int j = size - 1;
            while(j>= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums , i , j);
        }
        //after all this then reverse the remaining sub array
        reverse(nums , i+1 , size-1);
    }
    public static void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse( int nums[] , int start , int end){
        while(start <= end){
            swap(nums , start , end);
            start++;
            end--;
        }
    }
    public static void print(int arr[] , int size){
        for(int nums = 0 ; nums < size ; nums++){
            System.out.println(" ");
            System.out.print(arr[nums]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0 ; i <size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nBefore Permutation");
        print(arr , size);
        nextPermutation(arr , size);
        System.out.println("\nAfter Permutation");
        print(arr , size);
    }
}
