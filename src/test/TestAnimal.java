package test;

import domain.Jaguar;

public class TestAnimal {

    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar("Panthera Onca", 50, "cat");
        System.out.println(jaguar);
        jaguar.hunt();
        jaguar.territoryDenotation();
        jaguar.eat();
        jaguar.sleep();
        jaguar.play();
        jaguar.speak();
    }
}
