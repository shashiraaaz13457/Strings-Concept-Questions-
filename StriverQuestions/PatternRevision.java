package StriverQuestions;

public class PatternRevision {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
        pattern6(4);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalColsInRow = i>=n ? 2*n-i : i;
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= 2*n -1; i++) {
            int totalColsInRow = i>=n ? 2*n-i : i;
            int noOfSpaces = n-totalColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int spaces = 0; spaces < n-i; spaces++) {
                System.out.print("  ");
            }
            //column
            for (int col = i; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= i; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int atEveryIndex = 4567;
                System.out.println(atEveryIndex);
            }
            System.out.println();
        }
    }
}
