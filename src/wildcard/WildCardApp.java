package wildcard;

import boundedtypeparameter.MultipleContraintApp;
import invariant.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1));
        print(new MyData<String>("Dhimas"));
        print(new MyData<MultipleContraintApp.Manager>(new MultipleContraintApp.Manager()));
    }

    public static void print(MyData<?> data) {
        /**
         * wildcard parameter bertipe data Object.
         * sangat tidak dianjurkan buat dikonversi.
         * hanya boleh menerima/mengakses saja.
         */
        Object realData = data;
//        String stringData = data; // ERROR
        System.out.println(data.getData());
    }
}
