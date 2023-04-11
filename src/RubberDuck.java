public class RubberDuck extends duck{
    public RubberDuck() {
        quackbehave = new squeak();
        flybehave = new flyNoWay();
        swimbehave = new swimFloat();

    }
    @Override
    void display() {

    }
}
