package StriverQuestions;

public class ReverseWordsInAString {
    //Input: s = "  hello world  "
    //Output: "world hello"
    public static void main(String[] args) {
        String sentence = " hello world ";
        System.out.println(Reverse(sentence));
        
    }
    static String Reverse(String sentence){
        //Word Array now contains individual words.
        //Trim() -> used to remove leading and trailing spaces from the input string.
        //split("\\s+") -> IT is used to split the string into individual words based on one or more whitespaces characters.
        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            reversedString.append(words[i]);
            if(i > 0){
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}
