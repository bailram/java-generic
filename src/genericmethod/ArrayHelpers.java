package genericmethod;

public class ArrayHelpers {
    public static <T> int count(T[] data) {
        return data.length;
    }

    public static <T> T getFirstData(T[] data) {
        return data[0];
    }
}
