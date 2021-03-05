package optionals;

import java.util.Optional;

public class ExampleOptional {

    public static void main(String[] args) {

        /**
         * To avoid NullPointerException we can use the optional.
         * The case below will verify if if the given value is contained in the optional
         * if it is not, it will print a different message.
         */
        Optional<String> optionalString = Optional.of("Present value");
        System.out.println("Is the value present?");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("It is not present"));

        /**
         * if you have a suspicious that value can be null, use Optional.ofNullable(null).
         * This one can be tricky.
         * The optional evaluates if there is a null or not. if is null, it means that is not present, so it
         * will return the message on the second System.out.println.
         */
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("\nThe value is not present");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null: not present"));

        /**
         * Same explanation from above
         */
        Optional emptyOptional = Optional.empty();
        System.out.println("\nOptional value that is not present");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty: not present"));

        /**
         * This is same example from the first example. But here we introduce null. In this case an
         * exception will be printed.
         */
        Optional<String> optionalNullError = Optional.of(null);
        System.out.println("\nIs the value present?");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("ERROR: It is not present"));

    }

}
