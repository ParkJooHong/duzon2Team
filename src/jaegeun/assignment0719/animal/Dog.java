package day09.assignment.animal;

public class Dog extends Animal implements Pet{
    @Override
    public void eat() {
        System.out.println("개는 잡식성이다");
    }

    @Override
    public void forPets() {
        System.out.println("애완용으로 키울 수 있다");
    }
}
