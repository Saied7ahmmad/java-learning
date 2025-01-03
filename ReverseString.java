public class ReverseString {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0); 
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}