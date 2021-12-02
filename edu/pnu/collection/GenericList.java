package edu.pnu.collection;
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public void set(T a){
        if (size == 0) {
            data = new Object[DEFAULT_SIZE];
            data[size]=a;
            size++;
        }
        else{
            data[size]=a;
            size++;
        }
    }


    public T get(int a){
        return (T) data[a];
    }

    public int size(){

        return size;
    }

    public void clear() {

        for (int i = 0; i <data.length; i++){
            data[i] = 0;
        }
        size = 0;
    }

}
