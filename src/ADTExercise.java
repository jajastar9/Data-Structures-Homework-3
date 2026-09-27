package src;
import java.util.LinkedList;

public class ADTExercise {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> queue;
    //constructor
    public ADTExercise() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }

    //getters
    public LinkedList<Integer> getStack(){ 
        return stack;
    }
    public LinkedList<Integer> getQueue(){
        return queue;

    }

    //stack infrastructure
    //--------------------
    public void pushStack(Integer i) {
        stack.addFirst(i);
    }
    public Integer popStack(){
        return stack.removeFirst();
    }
    public Integer peekStack(){
        return stack.getFirst();
    }
    public boolean isEmptyStack(){
        return stack.isEmpty(); //alternatively peekStack and if it's null return true.
    }
    //--------------------

    //queue infrastructure
    //--------------------
    public void enQueue(Integer i) {
        queue.addLast(i);
    }
    public Integer deQueue(){ //did not see a requirement to return the removed element but test cases contradict
        return queue.removeFirst();
    }
    public Integer peekQueue(){
        return queue.getFirst();
    }

    public boolean isEmptyQueue(){
        return queue.isEmpty(); //alternatively peekQueue and if it's null return true
    }
    //--------------------
}