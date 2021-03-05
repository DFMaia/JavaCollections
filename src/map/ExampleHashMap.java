package map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {

        Map<String, Integer> worldCup = new HashMap<>();

        /**
         * We use .put(value, value). Is very different than .add();
         * It has a better performance because map does not sort.
         */
        worldCup.put("Brasil", 5);
        worldCup.put("Alemanha", 4);
        worldCup.put("Itália", 4);
        worldCup.put("Uruguai", 2);
        worldCup.put("Argentina", 2);
        worldCup.put("França", 2);
        worldCup.put("Inglaterra", 2);
        worldCup.put("Espanha", 1);

        /**
         * Be aware that the sort is not the same as the put
         */
        System.out.println(worldCup);

        //Update the value from Brazil key.
        System.out.println("\n" + worldCup);
        System.out.println("Updating the Brasil key to value 6");
        worldCup.put("Brasil", 6);
        System.out.println(worldCup);

        //Returns Argentina Key
        System.out.println("\nGet the value from Argentina key: " + worldCup.get("Argentina"));

        //Return if key exists
        System.out.println("\nThere ever was a champion France? " + worldCup.containsKey("França"));

        //Return if value exists
        System.out.println("\nThere is value 4? " + worldCup.containsValue(4));

        //Print all values
        System.out.println("Print all the values in this map: " + worldCup.values());

        /**
         * The method .remove(), remove an element with a given parameter.
         * There are a method .remove() with two parameters: Key and value.
         * And there are another method, to replace this keys and values: .replace();
         */
        System.out.println("\n" + worldCup);
        System.out.println("Removing the key França");
        worldCup.remove("França");
        System.out.println(worldCup);

        //Map size.
        System.out.println("\nThe map size is: " + worldCup.size());

        //How to iterate on this Map
        System.out.println("\nIterating int the map with for.");
        for(Map.Entry<String, Integer> entry : worldCup.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("\nIterating int the map with for with : .");
        for(String key : worldCup.keySet()){
            System.out.println(key + " -- " + worldCup.get(key));
        }

        //Cleaning the map
        System.out.println("\n" + worldCup);
        System.out.println("Cleaning map");
        worldCup.clear();
        System.out.println("This is a empty map: " + worldCup);
        System.out.println("The map size is: " + worldCup.size());

    }

}
