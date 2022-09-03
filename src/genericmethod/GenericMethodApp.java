package genericmethod;

public class GenericMethodApp {
    public static void main(String[] args) {
        String[] names = {"Dhimas", "Bayu", "Ilham", "Ramadhan"};
        Integer[] numbers = {1, 2, 3 , 4, 5};

        // berbagai cara pemanggilan
        System.out.println(ArrayHelpers.<String>count(names)); // ini bisa
        System.out.println(ArrayHelpers.count(numbers)); // atau ini juga bisa

        System.out.println(ArrayHelpers.getFirstData(names));
        System.out.println(ArrayHelpers.<Integer>getFirstData(numbers));
    }
}
