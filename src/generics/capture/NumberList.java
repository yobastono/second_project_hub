package generics.capture;

public class NumberList<X extends Number> implements List<X> {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public X get(int a) {
        return null;
    }

    @Override
    public void add(X x) {

    }
}
