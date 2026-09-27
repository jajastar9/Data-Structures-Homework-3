package src;
public class Runner {
    public static void main(String[] args) {
        ADTExercise exercise = new ADTExercise();
        exercise.pushStack(15);
        System.out.println("Stack currently looks like: " + exercise.getStack());
        exercise.pushStack(25);
        System.out.println("Stack currently looks like: " + exercise.getStack());
        exercise.pushStack(35);
        System.out.println("Stack currently looks like: " + exercise.getStack());
        exercise.pushStack(45);
        System.out.println("Stack currently looks like: " + exercise.getStack());
        exercise.pushStack(55);
        System.out.println("Stack currently looks like: " + exercise.getStack());
        System.out.println("Peeking at stack. Expected result: 55. Actual result: " + exercise.peekStack());
        System.out.println("Popping first element. Expected result: 55. Actual result: " + exercise.popStack());
        System.out.println("Popping first element. Expected result: 45. Actual result: " + exercise.popStack());
        System.out.println("Peeking at stack. Expected result: 35. Actual result: " + exercise.peekStack());
        System.out.println("Checking if empty. Expected result: false. Actual result: " + exercise.isEmptyStack() + "\n\n");
        exercise.enQueue(15);
        System.out.println("Queue currently looks like: " + exercise.getQueue());
        exercise.enQueue(25);
        System.out.println("Queue currently looks like: " + exercise.getQueue());
        exercise.enQueue(35);
        System.out.println("Queue currently looks like: " + exercise.getQueue());
        exercise.enQueue(45);
        System.out.println("Queue currently looks like: " + exercise.getQueue());
        exercise.enQueue(55);
        System.out.println("Queue currently looks like: " + exercise.getQueue());
        System.out.println("Peeking at queue. Expected result: 15. Actual result: " + exercise.peekQueue());
        System.out.println("Dequeueing first element. Expected result: 15. Actual result: " + exercise.deQueue());
        System.out.println("Dequeueing first element. Expected result: 25. Actual result: " + exercise.deQueue());
        System.out.println("Peeking at queue. Expected result: 35. Actual result: " + exercise.peekQueue());
        System.out.println("Checking if empty. Expected result: false. Actual result: " + exercise.isEmptyQueue());
    }
}
