package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {

        Set<Double> studentsScore = new HashSet<>();

        //Adding scores
        studentsScore.add(5.8);
        studentsScore.add(9.3);
        studentsScore.add(6.5);
        studentsScore.add(10.0);
        studentsScore.add(5.4);
        studentsScore.add(7.3);
        studentsScore.add(3.8);
        studentsScore.add(4.0);

        /**
         * Be aware that the order of elements is not the same as the order you added.
         * Read more on README.md
         */
        System.out.println(studentsScore);

        System.out.println("\nRemoving a Score");
        System.out.println(studentsScore);
        System.out.println("Removing 3.8");
        studentsScore.remove(5.8);
        System.out.println(studentsScore);

        System.out.println("\nThe numbers of element in this set is: " + studentsScore.size());

        /**
         * Be aware that the order of elements is not the same as the order you added.
         */
        for(Double score : studentsScore){
            System.out.println("->" + score);
        }

        /**
         * Be aware that the order of elements is not the same as the order you added.
         */
        System.out.println("\nIterate in Set with Iterator and while");
        Iterator<Double> iteratorStudentScore = studentsScore.iterator();
        while(iteratorStudentScore.hasNext()){
            System.out.println("-->" + iteratorStudentScore.next());
        }

        System.out.println("\nIs this set empty? " + studentsScore.isEmpty());

        //Clear all the elements
        studentsScore.clear();
    }

}
