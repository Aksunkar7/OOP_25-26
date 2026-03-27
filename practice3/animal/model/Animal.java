package practice3.animal.model;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void makeSound() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println(String.format("%s is eating", this.name));
    }

    public void eat(String food) {
        System.out.println(String.format("%s is eating %s", this.name, food));

    }

    public void getInfo() {
         System.out.println( String.format("Name: %s \nAge: %s", this.name, this.age) );
    }
}
