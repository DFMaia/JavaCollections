/**
 * To be quite honest I cloud not see much difference between List and Vector
 * I need more time to understand what which one of them does.
 */

package list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {

    public static void main(String[] args) {

        List <String> sports = new Vector<>();

        //Adding Strings to List Vector
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Handball");

        //Set a different name to an element from a given index.
        sports.set(2, "Ping Pong");

        //Remove an element from a given Object.
        sports.remove("Handball");

        //Print an element from a given index.
        System.out.println(sports.get(0));

        //A new way to use for.
        System.out.println("\nI am using a for now");
        for(String sport : sports){
            System.out.println(sport);
        }

    }

}
