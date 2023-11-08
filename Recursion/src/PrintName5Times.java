import java.util.Scanner;

public class PrintName5Times {
    public  static  int counter = 1;

    public static void printName(String name){
        if(counter == 6) return;
        System.out.println(name + " counter: "+ counter++ );
        printName(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printName(str);
    }
}


