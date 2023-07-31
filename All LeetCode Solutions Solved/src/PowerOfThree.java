public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        int i = 0 , temp=0;
        while(i>=0){
            temp = (int)Math.pow(3, i);
            if(temp == n){
                return true;
            }else if(temp > n){
                break;
            }else{
                i++;
            }
        }
        System.out.println(temp);
        return false;
    }
}
