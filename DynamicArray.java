package DSA;


public class DynamicArray {

    public static void main(String[] args){
        Array numbers = new Array(1);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.remove(5);

        numbers.print();
        System.out.println("Index: "+numbers.indexOf(70));

    }
}
