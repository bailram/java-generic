package comparatorinferface;

import comparableinterface.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterfaceApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dhimas", "Indonesia"),
                new Person("Bayu", "Indonesia"),
                new Person("Ilham", "Indonesia"),
                new Person("Ramadh an", "Indonesia")
        };

        // anggap misal Person tidak implement Comparable
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
