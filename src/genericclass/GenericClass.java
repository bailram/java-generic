package genericclass;

/**
 * untuk penamaan generic bisa apa aja sebenernya, tapi kebiasaan orang java
 * E - element (biasa digunakan di collection atau struktur data)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S, U, V etc - 2nd, 3rd, 4th types
 *
 * bahkan DHIMAS atau Dhimas sebagai simbol generic, tapi lebih disarankan cuma pakai 1 charater saja
 */
public class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
