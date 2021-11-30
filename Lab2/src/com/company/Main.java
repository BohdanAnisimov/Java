package com.company;

public class Main {

    public static void main(String[] args) {
        //LinkedList
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(-2);
        list.add(0);
        list.add(190);
        list.add(1);

        list.remove(0);
        list.printList();
        System.out.println(list.contains(190));

        System.out.println(list.size());

        //ArrayList

        ArrayList myArray = new ArrayList();
        myArray.add(5);
        myArray.add(42);
        myArray.add(10);
        myArray.add(15);
        myArray.add(22);
        myArray.remove(22);
        myArray.add(-1);

        myArray.printArray();

        System.out.println(myArray.contains(-1));

        System.out.println(myArray.size());

        //Serialization
        Person Andrey = new Person("Andrey", "Ivanov", 23);

        SerializationUtil.serialize(Andrey, "people.txt");
        Person loadedPerson = SerializationUtil.deserialize("people.txt");
        System.out.println(loadedPerson.firstName);
        System.out.println(loadedPerson.lastName);
        System.out.println(loadedPerson.age);
    }
}
