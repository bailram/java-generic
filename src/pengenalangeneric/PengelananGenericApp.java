package pengenalangeneric;

public class PengelananGenericApp {
    public static void main(String[] args) {
        /**
         * non generic biasanya akan di cek ketika runtime.
         * bisa saja ketika input int dan ketika ditampilkan jadi string. tentu saja ini bisa membuat program error
         */
        DataNonGeneric data = new DataNonGeneric();
        data.setData("ini string");
        String hasil = (String) data.getData(); // kalau bukan generic, harus ada proses konversi ke data yang diinput
        System.out.println(hasil);

        /**
         * generic biasanya akan di cek ketika kompilasi
         * ketika saat kompilasi tidak ada masalah, harusnya ketika runtime pasti akan aman
         */
        DataGeneric<String> dataG = new DataGeneric<String>();
        dataG.setData("ini generic class");
        String result = dataG.getData();
        System.out.println(result);
    }
}
