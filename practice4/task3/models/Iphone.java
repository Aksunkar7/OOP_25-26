package practice4.task3.models;

public class Iphone implements SellableAndPluggable{
    @Override
    public void sell() {
        System.out.println("Selling an iphone");
    }

    @Override
    public void plug() {
        System.out.println("Plugging an iphone");
    }
}
