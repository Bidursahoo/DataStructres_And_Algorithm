import java.util.Scanner;

public class PallindromeOfString {


    //double parameter
    public static boolean checkPalli(String str , int i , int j){
        if(i>= j) return true;
        if(str.charAt(i) == str.charAt(j)){
            if(!checkPalli(str , i+1 , j-1)) {
                return false;
            }else{
                return true;
            }
        }
        return false;
    }


    //single parameter
    public static boolean checkPalli(String str , int i ){
        if(i>= str.length()-1-i) return true;
        if(str.charAt(i) == str.charAt(str.length()-i-1)){
            if(!checkPalli(str , i+1 )) {
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A string: ");
        String str = sc.nextLine();
        System.out.println(checkPalli(str , 0 , str.length()-1));
        System.out.println(checkPalli(str , 0 ));
    }
}
