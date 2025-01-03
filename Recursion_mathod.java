public class Recursion_mathod {
    public static int SumNumR(int num) {
        if (num == 1){
        return 1;}
        else{
            return num + SumNumR(num-1);
        }

        
    }
    public static void main(String[] args) {
        int result = SumNumR(5);
        System.out.println(result);
    }

}
