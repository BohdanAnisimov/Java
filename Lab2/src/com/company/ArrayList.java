package com.company;

import java.util.Arrays;

public class ArrayList{
    private Object[] array = { };
    private int size = 0;

    public void capacity(int value){
        Object[] temp = array;
        array = new Object[value];
        array = Arrays.copyOfRange(temp, 0, value);
    }

    public void add(Object value){
        capacity(size + 1);
        array[size] = value;
        size++;
    }

    public void remove(Object value){
        for(int i = 0; i < size; i++){
            if(array[i].equals(value)){
                Object[] temp = Arrays.copyOfRange(array, 0, size);
                System.arraycopy(array, 0, array, 0, i);
                System.arraycopy(temp, i+1, array, i, size-i-1);
                capacity(size-1);
                size--;
            }
        }
    }

    public boolean contains(Object object){
        for(int i = 0; i < size; i++){
            if(array[i].equals(object)){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
