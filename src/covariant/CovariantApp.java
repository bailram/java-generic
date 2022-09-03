package covariant;

import invariant.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Dhimas");

        process(stringMyData);
        MyData<? extends Object> dataCovariant = stringMyData;
    }

    public static void process(MyData<? extends Object> data) {
        System.out.println(data.getData());

        //        data.setData(1); // ERROR
        /**
         * tidak boleh, karena kalau misalnya sama java diperbolehkan maka berbahaya. akan terjadi
         * kebingungan. karena data yang semula string bisa jadi integer
         */
    }
}
