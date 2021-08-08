package Adapter.EasyExample;

public class EasyTester {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);
        testDuck(turkeyAdapter);
        testTurkey(duckAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
