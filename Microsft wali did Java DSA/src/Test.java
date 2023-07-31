import java.util.HashSet;

public class Test {
    public static boolean bSearch(int arr[] , int first , int last , int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if(arr[mid] < key){
                first = mid + 1;
            }else if( arr[mid] == key ){
                return true;
            }else{
                last = mid - 1;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i< matrix.length ; i++){
            if(bSearch(matrix[i] , 0 , matrix[i].length-1 , target )){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr ,3));
}
}
