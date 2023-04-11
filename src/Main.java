public class Main {
    public static void main(String[] args) {

        MallardDuck mallardDuck= new MallardDuck();
        System.out.println("\nMallard Duck\n");
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

        RubberDuck rubberDuck= new RubberDuck();
        System.out.println("\nRubber Duck\n");
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        DecoyDuck decoyDuck= new DecoyDuck();
        System.out.println("\nDecoy Duck\n");
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();
    }
}