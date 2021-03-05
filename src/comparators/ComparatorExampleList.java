package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

    public static void main(String[] args) {

        List<StudentComparable> studdents = new ArrayList<>();

        studdents.add(new StudentComparable("Pedro", 19));
        studdents.add(new StudentComparable("Carlos", 23));
        studdents.add(new StudentComparable("Mariana", 21));
        studdents.add(new StudentComparable("João", 18));
        studdents.add(new StudentComparable("Thiago", 20));
        studdents.add(new StudentComparable("George", 22));
        studdents.add(new StudentComparable("Larissa", 21));

        System.out.println("---> Adding order <---");
        System.out.println(studdents);

        System.out.println("\nSorting from age - ascending");
        studdents.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println(studdents);

        System.out.println("\nSorting from age - descending");
        studdents.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println(studdents);

        System.out.println("\nSorting from age - ascending");
        studdents.sort(Comparator.comparingInt(StudentComparable :: getAge));
        System.out.println(studdents);

        System.out.println("\nSorting from age - descending");
        studdents.sort(Comparator.comparingInt(StudentComparable :: getAge).reversed());
        System.out.println(studdents);

        /**
         * Be aware that the method Collections.sort(Object) will only work if the object
         *  in the List has Comparable implementation. Otherwise compiler will not run.
         */
        System.out.println("\nSorting from age - ascending. Using only the method ");
        System.out.println("Collections.sort().");
        Collections.sort(studdents);

        /**
         * In this case the List does not necessary has to have an Comparable implementation
         * The class StudentReverseComparator has a comparator implementation with the
         * rule of descending sort.
         */
        Collections.sort(studdents, new StudentReverseComparator());
        System.out.println("/nReverse Order");
        System.out.println(studdents);

    }

}