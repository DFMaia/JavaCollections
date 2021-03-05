package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapital = new TreeMap<>();

        treeCapital.put("RS", "Porto Alegre");
        treeCapital.put("SC", "Florianópolis");
        treeCapital.put("PR", "Curitiba");
        treeCapital.put("SP", "São Paulo");
        treeCapital.put("RJ", "Rio de Janeiro");
        treeCapital.put("MG", "Belo Horizonte");

        System.out.println(treeCapital);

        //The first element from the tree's top
        System.out.println("\nWhich element is on tree's top? " + treeCapital.firstKey());

        //The last element in the tree
        System.out.println("\nWhich element is the last one in the tree: " + treeCapital.lastKey());

        //Print the lower key with a given parameter
        System.out.println("\nWhich element is below SC? " + treeCapital.lowerKey("SC"));

        //Print the higher key with a given parameter
        System.out.println("\nWhich element is above SC? " + treeCapital.higherKey("SC"));

        //Returns the first element in the top
        System.out.println("\nThe element which lays on the tree's top key is: "
                            + treeCapital.firstEntry().getKey()
                            + " and the values is: "
                            + treeCapital.firstEntry().getValue());

        //Returns the last element in the top
        System.out.println("\nThe element which lays on the tree's bottom key is: "
                + treeCapital.lastEntry().getKey()
                + " and the values is: "
                + treeCapital.lastEntry().getValue());

        //Return the element and removes it from the tree's top
        System.out.println("\n" + treeCapital);
        Map.Entry<String, String> firstEntry = treeCapital.pollFirstEntry();
        System.out.println("Removing the first element on the tree: " + firstEntry.getValue());
        System.out.println(treeCapital);

        //Return the element and removes it from the tree's bottom
        System.out.println("\n" + treeCapital);
        Map.Entry<String, String> lastEntry = treeCapital.pollLastEntry();
        System.out.println("Removing the last element on the tree: " + lastEntry.getValue());
        System.out.println(treeCapital);


        //Iterate in the map with while
        System.out.println("\nIterate in the map with while");
        Iterator<String> iterator = treeCapital.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapital.get(key));
        }

        //Iterate in the map with for
        System.out.println("\nIterate in the map with for");
        for(String capital : treeCapital.keySet()){
            System.out.println(capital + " --> " + treeCapital.get(capital));
        }

        //Iterate in the map with for
        System.out.println("\nIterate in the map with for");
        for(Map.Entry<String, String> capital : treeCapital.entrySet()){
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }

    }

}
