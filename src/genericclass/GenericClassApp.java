package genericclass;

public class GenericClassApp {
    public static void main(String[] args) {
        // untuk inisiasi generic class ada 2 cara
        GenericClass<String> data = new GenericClass<>("ini single parameter generic class"); // ini bisa, tanpa di inisiasikan String
        MultipleGenericClass<String, Integer> pair = new MultipleGenericClass<String, Integer>("Dhimas", 100); // atau ini juga bisa

        System.out.println(data.getData());
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
