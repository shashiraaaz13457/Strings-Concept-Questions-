import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Shashi Raj 19years old";
        System.out.println(name.charAt(2));
        System.out.println(name.toString());
        System.out.println(name.equals("Shashi Raj 19years old")); //true.
        System.out.println(name.concat(" boy")); //add in the String.
        System.out.println(name.endsWith("old"));
        System.out.println(name.indexOf("R")); //7
        System.out.println(name.lastIndexOf("a")); //15
        System.out.println(name.length()); //22
        System.out.println(name.replace("Raj","Kumar"));
        System.out.println(name.replaceAll("a","s"));

        //Here we are using Array.toString() method because charArray() converted String into the character Array.So convert it back into a String we need Array.toString() method.
         System.out.println(Arrays.toString(name.toCharArray())); //Converting String into Array.
        System.out.println(Arrays.toString(name.split(" "))); //Converting String into Array.
        System.out.println("  Shashi  ".strip()); //Better to use because of its range is beyond ascii range.
        System.out.println(" Sha shi ".trim());
    }
}
