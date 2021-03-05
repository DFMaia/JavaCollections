package optionals;

import java.util.Optional;

public class ExampleOptional2 {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Optional value");
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());

        stringOptional.ifPresent(System.out::println);

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is not present"));

        if(stringOptional.isPresent()){
            String value = stringOptional.get();
            System.out.println(value);
        }

        stringOptional.map((value) -> value.concat("****")).ifPresent(System.out::println);

        stringOptional.orElseThrow(IllegalStateException::new);

    }

}
