import java.util.Scanner;

public class PrintNumsInReverseOrder {

    //back tracking solution

    public void printReverse(int num , int end){
        if(num == end+1) return;
        printReverse(num+1 , end);
        System.out.println(num);
    }

    //backtracking Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintNumsInReverseOrder obj = new PrintNumsInReverseOrder();
        obj.printReverse(1,num);
    }
}

