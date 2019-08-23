package HomeWork2;

public class Main {
    public static void main(String[] args) {
        IntList myList = new IntArrayList();

        myList.add(3);
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(2);

        System.out.println(myList);
        myList.removeByValue(3);
        myList.remove(1);
        myList.add(3, 44);
        System.out.println(myList);
    }
}
