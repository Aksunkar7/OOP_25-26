package practice3.animal.model;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("I am dog my breed is %s", this.breed));
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
