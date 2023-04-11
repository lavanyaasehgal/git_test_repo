public class DecoyDuck extends duck{
    public DecoyDuck(){
        quackbehave = new muteQuack();
        flybehave = new flyNoWay();
        swimbehave = new swimNoWay();

    }
    @Override
    void display() {

    }
}
