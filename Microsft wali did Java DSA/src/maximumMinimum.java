import java.util.Scanner;

public class maximumMinimum {
    static void print(int min , int max){
        System.out.print("Max is : "+max+"\nMin is : "+min);
    }
    static void maxMin(int arr[] , int size , int min , int max){
        if(size == 1){
            print(min , max);
            return;
        }
        else if(size ==2 ){
            if(arr[0] > arr[1]){
                max = arr[0];
                min = arr[1];
            }else{
                max = arr[1];
                min = arr[0];
            }
            print(min , max);
            return;
        }
        else{
            for(int i = 0 ; i<size ; i++){
                if(min > arr[i]){
                    min = arr[i];
                }if(max < arr[i]){
                    max = arr[i];
                }
            }
            print(min , max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("\nEnter elements of array : ");
        for(int i = 0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        maxMin(arr , size , arr[0], arr[0]);
    }
}
