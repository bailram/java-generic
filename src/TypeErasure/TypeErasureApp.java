package TypeErasure;

import invariant.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        // ini ketika di running akan error
        MyData myData = new MyData("String"); // menghilangkan info generic

        MyData<Integer> integerMyData = (MyData<Integer>) myData;

        Integer integer = integerMyData.getData();

        // tapi ketika info generic tidak dihilangkan. maka pada saat proses konversi akan error
        MyData<String> stringMyData = new MyData<>("Dhimas");

//        MyData<Integer> integerMyData1 = (MyData<Integer>) stringMyData; // ini ERROR
    }
}
