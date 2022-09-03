package invariant;

public class InvariantApp {
    public static void main(String[] args) {
        // polymorphism
        MyData<String> data1 = new MyData<>("Dhimas");
//        doIt(data1); // ERROR
//        MyData<Object> dataO = data1; // ERROR

        // inheritance
        Integer number = 1000;
        MyData<Object> dataObject = new MyData<>(number); // 1000 kan termasuk object
//        doItInteger(dataObject); // ERROR
//        MyData<Integer> dataInteger = dataObject; // ERROR
        // artinya ketika class MyData<Integer> sebagai parameter,
        // maka data yang dikirim ke parameter HARUS MyData<Integer> juga. kalau MyData<Object> akan error meskipun
        // MyData<Object> harusnya adalah parent classnya

        /**
         * namun ketika T didefinisikan sebagai object dari parameter constructor generic class
         * maka object turunan dari class object bisa dimasukkan ke constructor generic class tersebut
         */
        MyData<Object> dataO2 = new MyData<>("Bayu");
    }

    public static void doIt(MyData<Object> data) {
        // do nothing
    }

    public static void doItInteger(MyData<Integer> data) {
        // do nothing
    }
}
