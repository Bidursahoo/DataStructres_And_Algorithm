import java.util.Scanner;

public class FibonaciSeries {
    public static void fibo(int prev , int next , int num){
        if(num == 0) return;
        System.out.print(prev+next +" ");
        fibo(next , prev+next , num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("0 1 ");
        fibo(0 , 1 , num);
    }
}
