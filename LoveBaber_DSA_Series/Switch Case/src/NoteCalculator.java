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
            default:
                if(price >=100){
                    nunOf100 = price /100;
                    price %= 100;
                }

        }switch (price){
            default:
                if(price >=50){
                    nunOf50 = price/50;
                    price%=50;
                }


        }switch (price){
            default:
                if(price >= 20){
                    nunOf20 = price/20;
                    price%=20;
                }


        }switch (price){
            default:
                if(price >=10){
                    nunOf10 = price/10;
                    price%=10;
                }

        }
        System.out.println(nunOf100+" , "+nunOf50+" , "+nunOf20+" , "+nunOf10);
    }
}
