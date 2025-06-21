import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class testclient {
    public static void main(String[] args) {

        Queue<Integer[]> testqueue = new LinkedList<>();

        Integer[] test1 = {1,6,3,4,5};
        Integer[] test2 = {1,2,3,4,5};
        Integer[] test3 = {1,6,3,4,5,7,8};
        

        testqueue.add(test1);
        testqueue.add(test2);
        testqueue.add(test3);
        testqueue.add(new Integer[]{10, 9, 2, 5, 3, 7, 101, 18});
        testqueue.add(new Integer[]{0, 1, 0, 3, 2, 3});
        testqueue.add(new Integer[]{7, 7, 7, 7, 7, 7, 7});
        testqueue.add(new Integer[]{10, 9, 8, 7, 1, 2, 3});

        while (testqueue.peek()!=null){
            entity test = new entity(testqueue.poll());
            System.out.println("Actual Array: "+Arrays.toString(test.input));
            
            System.out.println("LIS: "+Arrays.toString(test.LISsubsqn));
            System.out.println(test.getLongestIncreasingSub());
            System.out.println("LDS: "+Arrays.toString(test.LDSsubsqn));
            System.out.println(test.getLongestDecreasingSub());
        }
        

    }
    
}
