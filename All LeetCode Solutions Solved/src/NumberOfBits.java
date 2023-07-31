public class NumberOfBits {
    public static int hammingWeight(int n) {
        int temp = 0 , check = 1;
        for(int i = 0 ; i < 32 ; i++){
            int num =n & check;
            if(num != 1){
                //System.out.println("\n"+num+"\n");
                temp++;

            }
            check = check << 1;
        }
        return temp;
    }
    public static void main(String[] args) {
        int num = 11;
        System.out.println(hammingWeight(num));
    }
}
