public class Strings_basics {
    public static void main(String[] args) {
        String name = "Shashi Raj"; //String Creation
//        System.out.println(name);

//        String a = "kunal";
//        System.out.println(a);
//        a = "kushwaha"; //Here its not changing the object here it is creating a new object.
//        System.out.println(a);


        //Comparison of Strings..
        String a = "kunal";
        String b = "kunal";
        System.out.println(a == b);  //a and b pointing towards the same the object.(true)

        String name1 = new String("kunal");
        String name2 = new String("kunal");

        System.out.println(name1 == name2); //(false) a and b are explicitly determined by the user to create different objects,
        //so here both the reference variable pointing to the different objects.

        System.out.println(name1.equals(name2)); //Only checks values.

        System.out.println(name1.charAt(0));

    }
}
