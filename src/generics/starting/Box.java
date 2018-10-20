package generics.starting;

public class Box<U> {

    private U u;


    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem){
        int count = 0;
        for(T e : anArray){
            if(e.compare(elem) > 0){
                ++count;
            }
        }
        return count;
    }

    public U get() {
        return u;
    }

    public void set(U u) {
        this.u = u;
    }

    public String toString(){
        return this.u.toString();
    }

}

