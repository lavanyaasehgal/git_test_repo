public abstract class duck {
    //objs of interface
    flyBehavior flybehave;
    quackBehavior quackbehave;
    swimBehavior swimbehave;
    abstract void display();

    public void setflyBehavior(flyBehavior fb) {
        flybehave = fb;
    }

    public void setquackBehavior(quackBehavior qb) {
        quackbehave=qb;
    }

    public void setswimBehavior(swimBehavior sb) {
        swimbehave=sb;
    }

    public void performQuack()
    {
        quackbehave.quack();
    }
    public void performFly()
    {
        flybehave.fly();
    }
    public void performSwim()
    {
        swimbehave.swim();
    }
}
