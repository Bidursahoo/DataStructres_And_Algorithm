import java.util.Scanner;

public class buyStocksAndSellOne {
    static int maxProfit(int prices[] , int size){
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i< size ; i++){
            //find the minimum price to buy
            if(prices[i] < minValue){
                minValue = prices[i];
            }else{                      //if the price is not minimum then we call sell that with max profit
                int temp = prices[i] - minValue;
                if(temp > maxProfit){
                    maxProfit = temp;
                }
            }
        }
        return maxProfit;
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
        System.out.println("Maximum Profit will be : "+maxProfit(arr , size));
    }
}
