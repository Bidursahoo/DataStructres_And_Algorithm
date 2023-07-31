import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price in $: ");
        int price = sc.nextInt();
        int nunOf100 = 0;
        int nunOf50 = 0;
        int nunOf20 = 0;
        int nunOf10 = 0;
        switch (price){
            case 100:
                if(price >=100){
                   nunOf100 = price /100;
                   price/=100;
                }
            case 50:
                if(price >=50){
                    nunOf50 = price/50;
                    price/=50;
                }
            case 20:
                break;

        }
    }
}
