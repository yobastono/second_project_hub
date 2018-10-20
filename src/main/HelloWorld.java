package main;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.function.BiFunction;

public class HelloWorld {
    public static void main(String[]args){
        Hashtable<String, String> employees = new Hashtable<>();
        employees.put("One", "Yoshi");
        employees.put("Two", "Yobastono");
        employees.put("Four", "Sc");
        employees.put("Four", "sonia");

        //hashing

        for (String itm: employees.keySet()) {
            System.out.println(itm + " " + employees.get(itm));
        }
        System.out.println();

        //bi function
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("Hello " , employees.get("One")));
        Calculator c1 = new Calculator();
        String result = c1.calc((a, b) -> "" + ": " + (a + b), 3,8);
        System.out.println(result);

        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);   // no cast
        System.out.println(s);

    }
}
