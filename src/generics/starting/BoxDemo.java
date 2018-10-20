package generics.starting;

import java.util.List;

public class BoxDemo {


    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static <U> void addBox(U u, java.util.List<Box<U>> boxes){
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<Box<U>> boxes){
        int counter = 0;
        for(Box<U> box : boxes){
            U boxContent = box.get();
            System.out.println("Box# " + counter + " contains [" +
                    boxContent.toString() + "]");
            counter++;
        }
    }
}
