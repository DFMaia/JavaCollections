package queue;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//This is a QUEUE
public class ExampleLinkedList {

    public static void main(String[] args) {

        //Create queue
        Queue <String> bankQueue = new LinkedList<>();

        //Add elements to queue
        bankQueue.add("Patrícia"); //This element is the first in the queue
        bankQueue.add("Roberto");
        bankQueue.add("Flávio");
        bankQueue.add("Pamela");
        bankQueue.add("Anderson");

        //Print queue
        System.out.println("Printing queue...");
        System.out.println(bankQueue);

        /**
         * The Method .poll() retrieves the first element in the queue and removes it.
         * If there is no element, it will return null.
         */
        System.out.println("\nPrint queue: ");
        System.out.println(bankQueue);
        String firstCustomer = bankQueue.poll();
        System.out.println("Print the first element: " + firstCustomer);
        System.out.println("Now print this queue without the first element.");
        System.out.println(bankQueue);

        /**
         * To only see which element is the first one, use .peek().
         * If queue is empty, this method will return null
         */
        System.out.println("\nPrinting queue....");
        System.out.println(bankQueue);
        System.out.println("Printing the first element in the queue without removing it.");
        String firstCustomer2 = bankQueue.peek();
        System.out.println("The first customer in the queue is: " + firstCustomer2);
        System.out.println("Printing queue again to prove that this first customer wasn't removed: ");
        System.out.println(bankQueue);

        /**
         * This method returns the fir element in the queue.
         * The method .element() returns an exception if queue is empty.
         * This method does not remove any element in queue.
         */
        System.out.println("\nUsing .element() to retrieve the first element....");
        System.out.println(bankQueue);
        String firstCustomerOrError = bankQueue.element();
        System.out.println("The first customer is: " + firstCustomerOrError);
        System.out.println("Now I will clean the queue....");
        //I will comment the line below to let the program running.
        //bankQueue.clear();
        //System.out.println("Queue cleared");
        //System.out.println("Using element to launch an exception....");
        //firstCustomerOrError = bankQueue.element();

        System.out.println("\nIterate on queue using for");
        for(String client : bankQueue){
            System.out.println("->" + client);
        }

        /**
         * See further explanation of .hasNext() and .next() int the package list.
         */
        System.out.println("\nUsing Iterator to iterate queue");
        Iterator <String> iteratorBankQueue = bankQueue.iterator();
        while(iteratorBankQueue.hasNext()){
            System.out.println("-->" + iteratorBankQueue.next());
        }

        //Check how many items queue has.
        System.out.println("\nThe queue has " + bankQueue.size() + " elements");

        //Check if list is empty
        System.out.println("\n is this queue empty? " + bankQueue.isEmpty());

    }

}