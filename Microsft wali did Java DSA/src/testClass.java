public class testClass {
    public static int hammingWeight(int n) {
        int temp = 0 , check = 1;
        for(int i = 0 ; i < 32 ; i++){
            if((n & check) != 1){
                temp++;
                System.out.println((n&check)+"\n");
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
