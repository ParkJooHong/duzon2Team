package day09.assignment.animal;

import java.util.Random;

public class AnimalTest {
    public static void main(String[] args) {
        Random random = new Random();
        AnimalTest animalTest = new AnimalTest();
        Animal animal = null;

        Animal[] animals = {new Dog(), new Cat(), new Chicken(), new Eagle(), new Fish(), new Lion()};

        animal = animals[random.nextInt(6)];

        animal.breathe();
        animal.eat();
        animalTest.able(animal);
    }


    /**
     * @param animal
     * animal이 Flyable과 Pet인터페이스에 속하는지 확인하고 animal이 해당하는 행위를 출력하는 메소드
     */
    private void able(Animal animal) {
        if(animal instanceof Flyable){
            ((Flyable) animal).fly();
        }

        if(animal instanceof Pet){
            ((Pet) animal).forPets();
        }
    }
}
