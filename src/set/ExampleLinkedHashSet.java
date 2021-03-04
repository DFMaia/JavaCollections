package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();

        //Adding number to list
        numericalSequence.add(1);
        numericalSequence.add(2);
        numericalSequence.add(4);
        numericalSequence.add(8);
        numericalSequence.add(16);

        /**
         * This list will keep the same order of insert in the list.
         */
        System.out.println(numericalSequence);

        //Removing an element in the list.
        System.out.println("\n" + numericalSequence);
        System.out.println("Removing the element 4");
        numericalSequence.remove(4);
        System.out.println(numericalSequence);

        System.out.println("\nThe size of this list is: " + numericalSequence.size());

        /**
         * The sort in the list is the same as added.
         */
        System.out.println("\nIterate whit for");
        for(Integer numbers : numericalSequence){
            System.out.println("---->" + numbers);
        }

        /**
         * The sort in the list is the same as added.
         */
        System.out.println("\nIterate the list whit a Iterator and While");
        Iterator<Integer> numberIterator = numericalSequence.iterator();
        while(numberIterator.hasNext()){
            System.out.println("-->" + numberIterator.next());
        }

        //Return if list is empty
        System.out.println("\n Is this list empty? " + numericalSequence.isEmpty());

        /**
         * There is also the .clear() method
         */

    }

}
