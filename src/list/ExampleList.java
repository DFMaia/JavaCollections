package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {

        //Creating list
        List<String> nomes = new ArrayList<>();

        //Adding names in the list.
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        //Print list in the order which it was added.
        System.out.println(nomes);

        //Change a name at specific index int the list. Changing Juliana to Larissa.
        nomes.set(2, "Larissa");
        System.out.println("\nI have changed Juliana to Larissa");
        System.out.println(nomes);

        //Sorting list ascending
        Collections.sort(nomes);
        System.out.println("\nList sorted");
        System.out.println(nomes);

        //Change a name at specific index int the list. Changing Larissa to Wesley.
        nomes.set(2, "Wesley");
        System.out.println("\nJoão as Wesley");
        //Print list as ascending
        System.out.println(nomes);

        //Remove an item according to given index. In this case will be Maria.
        nomes.remove(4);
        System.out.println("\nRemove Maria");
        //Print without Maria. Index 4.
        System.out.println(nomes);

        //This remove method came from remove object. It will remove the name Wesley.
        nomes.remove("Wesley");
        System.out.println("\nRemove Wesley");
        //Print without Wesley.
        System.out.println(nomes);

        //Get the value according to the given index.
        String nome = nomes.get(1);
        //Print Carlos
        System.out.println("\nGet the name in a give index, nome.get(1) ->" + nome);

        //Show how many elements this list has.
        int size = nomes.size();
        //Will print the list size.
        System.out.println("\nThe list size is: " + size);

        //Verify it list has a given name. Return true or false.
        boolean hasAnderson = nomes.contains("Anderson");
        System.out.println("\nThe list has the name Anderson? " + hasAnderson);

        //verify if list is empty. Return true or false.
        boolean isEmpty = nomes.isEmpty();
        System.out.println("\nThis list is empty? " + isEmpty);

        //It will display which index the given element is found.
        int position = nomes.indexOf("Carlos");
        System.out.println("\nWhich position Carlos remains in? " + position);

        //A different way to use iterate on the list using a different for.
        System.out.println("\nUsing a different for");
        for(String itemName: nomes){
            System.out.println("--> " + itemName);
        }

        /**Iterators method hasNext() returns true of false. That is why we use while, because while the condition is
        *true, the while method will continue.
        *The method next() will return the actual object Iterator.hasNext() is processing.
        */
        System.out.println();
        Iterator <String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("Using iterator -->" + iterator.next());
        }

        //Remove all elements from the list.
        nomes.clear();
        System.out.println("\nCleaning/removing all items from list: " + nomes);
    }

}
