public class methodlec {
    
        public static int sumOfSquare(int a, int b) {
            int ans = makeSquare (a) + makeSquare (b);
            return ans;
            
        }
        public static int makeSquare(int n) {
            return n*n;
            
        }
        public static void main(String []args) {
            int result = sumOfSquare(4, 6);
            System.out.println(result);
            
        }
    

}
