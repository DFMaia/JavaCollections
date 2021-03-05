package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapital = new TreeSet<>();

        treeCapital.add("Porto Alegre");
        treeCapital.add("Florianópolis");
        treeCapital.add("Curitiba");
        treeCapital.add("São Paulo");
        treeCapital.add("Rio de Janeiro");
        treeCapital.add("Belo Horizonte");

        /**
         * The order in this list is not the same as the order of adding
         * Everytime you add an element, a new sort will be made.
         */
        System.out.println(treeCapital);

        //Print element on the top of the tree
        System.out.println("\nThe element in the top of the tree: " + treeCapital.first());

        //Print the last element of the tree
        System.out.println("\nThe last element of tree is: " + treeCapital.last());

        //Return the element below of the given parameter
        System.out.println("\nWhich element resides below Florianópolis? " + treeCapital.lower("Florianópolis"));

        //Return the element above of the given parameter
        System.out.println("\nWhich element resides above Florianópolis? " + treeCapital.higher("Florianópolis"));

        //Returns the first element of the tree and removes it from the list.
        System.out.println("\n" + treeCapital);
        System.out.println("Removing the element from the top of the tree: " + treeCapital.pollFirst());
        System.out.println(treeCapital);

        //Returns the last element of the tree and removes it from the list.
        System.out.println("\n" + treeCapital);
        System.out.println("Removing the last element from tree: " + treeCapital.pollLast());
        System.out.println(treeCapital);

        //Iterate on the tree
        System.out.println("\nUsing Iterator with While");
        Iterator<String> treeIterator = treeCapital.iterator();
        while (treeIterator.hasNext()){
            System.out.println("-->" + treeIterator.next());
        }

        System.out.println("\nIterate with For");
        for(String treeIteratorFor : treeCapital){
            System.out.println("---->" + treeIteratorFor);
        }

    }

}