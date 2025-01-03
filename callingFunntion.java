public class callingFunntion {
    public static String funtion1() {
        
        return "I am "+ funtion2();
        
    }
    public static String funtion2() {
        
        return "learning "+ funtion3();
        
    }
    public static String funtion3() {
        
        return "Java ";
        
    }
   
    public static void main(String []args) {
       
        System.out.println(funtion1());
    }


}
