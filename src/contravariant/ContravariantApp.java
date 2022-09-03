package contravariant;

import invariant.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>("Dhimas");
        data.setData(1000);

        MyData<? super String> myData = data;

        process(data);

        System.out.println(myData.getData());
    }

    public static void process(MyData<? super String> data) {
        Object value = data.getData();
        System.out.println("Process parameter : " + value);
        data.setData("Dhimas Bayu");
    }
}
