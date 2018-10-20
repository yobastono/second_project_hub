package generics.capture2;

import java.util.List;
import java.util.ListIterator;

public class Field<T> {

    private String name;
    private T value;

    public static Field<?> copy(Field<?> field){
        Field<?> objField = new Field<>();
        objField.setName(field.getName());
        return objField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


        }

