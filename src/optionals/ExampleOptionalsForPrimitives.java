package optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionalsForPrimitives {

    public static void main(String[] args) {

        System.out.println("Optional Integer");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("\nOptional Double");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("\nOptional Long");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }

}
