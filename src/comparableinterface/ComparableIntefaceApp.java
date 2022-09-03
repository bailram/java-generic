package comparableinterface;

import java.util.Arrays;

public class ComparableIntefaceApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dhimas", "Indonesia"),
                new Person("Bayu", "Indonesia"),
                new Person("Ilham", "Indonesia"),
                new Person("Ramadhan", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
