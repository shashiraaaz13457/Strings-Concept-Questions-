import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195 (adding two char)
        System.out.println("a" + "b"); //ab (adding two string) (concatenation)
        System.out.println((char) ('a' + 3)); // d (adding char to number)
        System.out.println("a" + 1); // a1 (adding string to number)
        //int will be converted to Integer(Wrapper Class) that will call toString()
        //this is same as after a few steps: "a" + "1"

        System.out.println("kunal" + new ArrayList<>()); //kunal []
        System.out.println("kunal" + new Integer(56)); //kunal56
        //Conveted it into string
        // + sign is used only for primitives and also works when atleast one object of type String.
//        System.out.println(new ArrayList<>() + new Integer(56)); //NOt work for this because both are object and no one is String.
        System.out.println(new ArrayList<>() + "" +new Integer(56)); //Now it will work because there is one string object.


    }
}
