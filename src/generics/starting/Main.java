package generics.starting;

import java.util.Arrays;
import java.util.List;

import static generics.starting.BoxDemo.sumOfList;

public class Main {
    public static void main(String[]args) {

        java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
        System.out.println();

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));

        //unbounded wildcards

        Box<String> box1 = new Box<>();
        WildcardError.rebox(box1);

    }
}
