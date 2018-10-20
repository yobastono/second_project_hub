package generics.starting;

import java.util.List;

public class WildcardError {

    void foo(List<?> i) {
        helper(i);

    }

    <T> void helper(List<T> t) {
        t.set(0, t.get(0));
    }

    public static void rebox(Box<?> box){
        reboxHelper(box);
    }

    private static  <V> void reboxHelper(Box<V> box){
        box.set(box.get());
    }

}
