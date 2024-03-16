package StriverQuestions;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }

        public static String restoreString(String s, int[] indices) {
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                name.append(" "); // Append placeholder space characters to ensure capacity
            }
            for(int i = 0; i <s.length();i++){
                name.setCharAt(indices[i], s.charAt(i));
//                name.append(s.charAt(indices[i]));
            }
            return name.toString();
        }
    }
