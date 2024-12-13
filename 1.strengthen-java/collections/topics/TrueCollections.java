package topics;

import java.util.Set.Hashset;
import java.util.Set.LinkedHashSet;
import java.util.Queue.LinkedList;
import java.util.Queue.PriorityQueue;
import java.util.concurrent.BlockingQueue.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue.ArrayBlockingQueue;
import java.util.Deque.ArrayDeque;
import java.util.Deque.LinkedList;
/*
- The collection interfaces are divided into two groups. The most basic interface, java.util.Collection, has the following descendants:

+ The Popular ones:
    + java.util.Set
    + java.util.Queue
    + java.util.concurrent.BlockingQueue
    + java.util.Deque
+ Uncommon:
    + java.util.SortedSet
    + java.util.NavigableSet
    + java.util.concurrent.TransferQueue
    + java.util.concurrent.BlockingDeque
*/

public class TrueCollections {
    public class mostCommon{
        // Set, Queue, BlockingQueue, Deque
        public void trySet(){
            this.printSection("trySet: Hashset and LinkedHashSet");

        }
        public void tryQueue(){
            this.printSection("tryQueue: LinkedList and PriorityQueue");
            
        }
        public void tryBlockingQueue(){
            this.printSection("tryBlockingQueue: LinkedBlockingQueue and ArrayBlockingQueue");
            
        }
        public void tryDeque(){
            this.printSection("tryDeque: ArrayDeque and LinkedList");
            
        }

        public void printSection(String funcName){
            System.err.printf("___TrueCollections: mostCommon: %s", funcName);
        }
    }
}
