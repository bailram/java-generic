package boundedtypeparameter;

public class ConstraintApp {
    public static void main(String[] args) {
        /**
         * Kelebihan menggunakan bounded type parameter adalah
         * semua method dari constraint nya bisa diakses
         */
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(2L);

//        NumberData<String> stringNumberData = new NumberData<String>("Dhimas"); // ERROR
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public void printData() {
            System.out.println(this.data.floatValue()); // .floatValue() contoh method bawaan Number
            /**
             * kalau tidak perkecil constraint jadi Number dan defaultnya adalah Object. maka method .floatValue()
             * tidak akan bisa diakses
             */
        }
    }
}
