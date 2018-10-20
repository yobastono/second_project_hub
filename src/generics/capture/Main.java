package generics.capture;

public class Main {
    public static void main(String[]args){
        NumberList<Number> numberList = new NumberList<>();
        Number number = numberList.get(0);
        numberList.add(number);


    }
}
