package practice4.task3.app;
import practice4.task3.models.Iphone;
import practice4.task3.services.App;
import practice4.task3.models.LogicGame;
import practice4.task3.models.MemoryGame;

public class Main {
    public static void main(String[] args) {
        LogicGame l = new LogicGame();
        MemoryGame m = new MemoryGame();

        App app = new App();
        app.getStatistics(l);
        System.out.println();
        app.getStatistics(m);


        System.out.println();
        Iphone i = new Iphone();
        i.sell();
        i.plug();
    }
}
