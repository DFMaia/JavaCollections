package map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> students = new Hashtable<>();

        students.put("Carlos", 21);
        students.put("Mariana", 33);
        students.put("Rafaela", 18);
        students.put("Pedro", 44);

        /**
         * The order is different from put
         * It can be use on a environment with thread
         */
        System.out.println(students);

        //Update an element
        System.out.println("\nChanging Pedro's age to 55: " + students.put("Pedro", 55));
        System.out.println(students);

        //Remove an element
        System.out.println("\n" + students);
        System.out.println("Removing Pedro from HashTable: " + students.remove("Pedro"));
        System.out.println(students);

        //Retrieve an element from its value
        int studentAge = students.get("Mariana");
        System.out.println("\n Mariana's age is: " + studentAge);

        //HashMapTable size
        System.out.println("\nThe size of this HashMapTable is " + students.size());

        //Iterate with for
        System.out.println("\nIterate with for");
        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Iterate with for
        System.out.println("\nIterate with for");
        for(String key : students.keySet()){
            System.out.println(key + " --> " + students.get(key));
        }

    }

}
