public class PalindromeProgram {
    public static void main(String[] args) {
        //Palindrome Program
        //Method 1
//        String value = "abcdcba";
//        String value = "abccba";
//        String value = "a";
        String value = " ";
        StringBuilder b = new StringBuilder();
//        for (int i = value.length()-1; i >= 0 ; i--) {
//            b.append(value.charAt(i));
//        }
//        //Here we have to use toStirng() because b is StringBuilder type not String type.
//        if (value.equals(b.toString())){
//            System.out.println("It is a palindrome String");
//        }else {
//            System.out.println("It is not a palindrome String");
//        }
        System.out.println(isPalindrome(value));
    }
    //Method2
    static boolean isPalindrome(String value){
        if (value ==null || value.length() == 0 ){
            return true;
        }
        char start = value.charAt(0);
        int end = value.charAt(value.length()-1);
        while(start<=end){
            if (start != end){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
