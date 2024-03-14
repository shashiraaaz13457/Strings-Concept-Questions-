package StriverQuestions;

class RemoveOuterParenthesis {
     public static void main(String[] args) {
        String s = "(()())(())";
         System.out.println(removeOuterParentheses(s));
    }
     static String removeOuterParentheses(String s) {
         StringBuilder result = new StringBuilder();
         int balance = 0;

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if (c == '(' ){
                if (balance>0){
                    result.append(c);
                }
                balance++;
            } else if (c == ')') {
                if (balance>1){
                    result.append(c);
                }
                balance--;
            }
        }
        return result.toString();
    }
}