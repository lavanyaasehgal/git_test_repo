public class MallardDuck extends duck{
    public MallardDuck()
    {
        quackbehave=new Quack();
        flybehave= new flyWithWings();
        swimbehave= new swimYes();
    }
    @Override
    void display() {

    }
}
