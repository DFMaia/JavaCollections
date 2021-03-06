package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamApi {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Juliana");
        students.add("Rafael");

        System.out.println("Counting elements in this list: " + students.stream().count());

        System.out.println("\nPrint the element with the higher number of char: " +
                students.stream().max(Comparator.comparingInt(String :: length)));

        System.out.println("\nPrint the element with the lowest number of char: " +
                students.stream().min(Comparator.comparingInt(String :: length)));

        System.out.println("\nStudent that contains r: " + students.stream().filter((student) ->
                student.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("\nPrint all the names and the the char numbers:  " +
                students.stream().map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .collect(Collectors.toList()));

        System.out.println("\nReturning the first three elements: " +
                students.stream().limit(3).collect(Collectors.toList()) + "\n");

        /**
         * This guy will return a list and in the end of for each element it will print an \n.
         * Then it will print a list as []
         */
        System.out.println("\nPrint all elements: " +
                students.stream().peek(System.out::println).collect(Collectors.toList()));

        /**
         * ATTENTION: this method cannot be use in the System.out.println() method.
         */
        System.out.println("\nPrint all elements line by line");
        students.stream().forEach(System.out::println);

        System.out.println("\nAre all elements containing char W? " +
                students.stream().allMatch((element) -> element.contains("W")));

        System.out.println("\nThere is any element containing char a: " +
                students.stream().anyMatch((element) -> element.contains("a")));

        /**
         * This is an inversion method. If is true will return false, and vice versa.
         * This is the opposite of allMatch() method.
         */
        System.out.println("\nAre all the elements with the lower Case a?: " +
                students.stream().noneMatch((element) -> element.contains("a")));

        System.out.println("\nPrint the first element in the list: ");
        students.stream().findFirst().ifPresent(System.out::println);



    }

}
