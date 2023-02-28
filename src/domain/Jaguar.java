package domain;

/**
 * The class Jaguar extends predator
 */
public class Jaguar extends Predator {

    private String kind;

    /**
     *
     * Jaguar
     * Default constructor
     *
     * @param name the name
     * @param weight the weight
     * @param kind the kind
     */
    public Jaguar(String name, int weight, String kind) {

        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    /**
     *
     * Jaguar
     * Constructor with default parameters
     *
     */
    public Jaguar() {

        this("None", 70, "cat");
    }

    /**
     *
     * Jaguar
     * Constructor with name parameter
     *
     * @param name the name
     */
    public Jaguar(String name) {

        this(name, 70, "cat");
    }

    /**
     *
     * Play
     *
     */
    public void play() {

        System.out.println("Jaguar is playing...");
    }

    /**
     *
     * Territory denotation
     *
     */
    public void territoryDenotation() {

        System.out.println("Jaguar denotates the territory...");
    }

    @Override

    /**
     *
     * Hunt
     *
     */
    public void hunt() {

        System.out.println("Jaguar hunts for prey...");
    }

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis is Jaguar!";
    }

    @Override

    /**
     *
     * Speak
     *
     */
    public void speak() {

        System.out.println("Meow! Meow!");
    }

    @Override

    /**
     *
     * Eat
     *
     */
    public void eat() {

        System.out.println("Jaguar eats meat...");
    }

    @Override

    /**
     *
     * Sleep
     *
     */
    public void sleep() {

        System.out.println("Jaguar is sleeping...");
    }

}
