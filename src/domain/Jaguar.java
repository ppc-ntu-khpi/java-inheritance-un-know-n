package domain;

public class Jaguar extends Predator {

    private String kind;

    public Jaguar(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    public Jaguar() {
        this("None", 70, "cat");
    }

    public Jaguar(String name) {
        this(name, 70, "cat");
    }

    public void play() {
        System.out.println("Jaguar is playing...");
    }
    
    public void territoryDenotation() {
        System.out.println("Jaguar denotates the territory...");
    }

    @Override
    public void hunt() {
        System.out.println("Jaguar hunts for prey...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis is Jaguar!";
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Jaguar eats meat...");
    }
    
    @Override
    public void sleep() {
        System.out.println("Jaguar is sleeping...");
    }

}
