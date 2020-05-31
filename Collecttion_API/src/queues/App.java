package queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    
    public static void main(String[] args) {
        
       //   (Head) <- 000000000000000000000 <- (Tail)  FIFO (First In ,First Out)

       Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

       // Trows NoSuchElement Exception -----No Item in Queue yet...
       // System.out.println("Head of the Queue is : " + q1.element());

       q1.add(10);
       q1.add(20);
       q1.add(30);
      
       System.err.println("Head of the Queue is : " + q1.element());
       try {
        q1.add(40);
       } catch (IllegalStateException e) {
          System.out.println("You have added more than limit...");

        }
     for(Integer value : q1){

        System.out.println("Queue values : " + value);
     }

     System.out.println("Removed From Queue : " + q1.remove());
     System.out.println("Removed From Queue : " + q1.remove());
     System.out.println("Removed From Queue : " + q1.remove());

     try {
         
        System.out.println("Removed From Queue : " + q1.remove());
     } catch (NoSuchElementException e) {
         
        System.out.println("Try to remove too many item from the Queue..");     }
     
   
////////////////////////////////////////////////////////////////////////////////
      System.out.println();
    Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
      System.out.println("Queue 2 peek : " + q2.peek());
    q2.offer(10);
    q2.offer(20);
    q2.offer(30);

    if(q2.offer(30) == false){
       
        System.out.println("offer failed to add third item..");
    }

    for(Integer value :q2){

        System.out.println("Queue 2 Value : " + value);
    }

    }
}