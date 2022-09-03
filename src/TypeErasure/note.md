# Type Erasure
- Type erasure adalah proses pengecekan generic pada saat compile time, dan mengiraukan pengecekkan pada saat runtime
- Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di complie menjadi binary file
- Compiler akan mengubah generic parameter type menjadi tipe Object di Java

### Kode: Type Parameter
```java
public static class Data<T> {
    private T data;
    
    public Data(T data) {
        this.data = data;
    }
}
```
ketika sudah menjadi binary file
```java
public static class Data {
    private Object data;
    
    public Data(Object data) {
        this.data = data;
    }
}
```

### Problem
- Karena informasi generic hilang ketika sudah menjadi binary file
  - Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak