package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

    public static void main(String[] args) {

        List<StudentComparable> students = new ArrayList<>();

        students.add(new StudentComparable("Pedro", 19));
        students.add(new StudentComparable("Carlos", 23));
        students.add(new StudentComparable("Mariana", 21));
        students.add(new StudentComparable("João", 18));
        students.add(new StudentComparable("Thiago", 20));
        students.add(new StudentComparable("George", 22));
        students.add(new StudentComparable("Larissa", 21));

        System.out.println("---> Adding order <---");
        System.out.println(students);

        System.out.println("\nSorting from age - ascending");
        students.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println(students);

        System.out.println("\nSorting from age - descending");
        students.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println(students);

        System.out.println("\nSorting from age - ascending");
        students.sort(Comparator.comparingInt(StudentComparable :: getAge));
        System.out.println(students);

        System.out.println("\nSorting from age - descending");
        students.sort(Comparator.comparingInt(StudentComparable :: getAge).reversed());
        System.out.println(students);

        /**
         * Be aware that the method Collections.sort(Object) will only work if the object
         *  in the List has Comparable implementation. Otherwise compiler will not run.
         */
        System.out.println("\nSorting from age - ascending. Using only the method ");
        System.out.println("Collections.sort().");
        Collections.sort(students);

        /**
         * In this case the List does not necessary has to have an Comparable implementation
         * The class StudentReverseComparator has a comparator implementation with the
         * rule of descending sort.
         */
        Collections.sort(students, new StudentReverseComparator());
        System.out.println("/nReverse Order");
        System.out.println(students);

    }

}