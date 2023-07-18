package day09.assignment.animal;

public class Cat extends Animal implements Pet{

    @Override
    public void eat() {
        System.out.println("고양이는 생선을 먹는다");
    }

    @Override
    public void forPets() {
        System.out.println("애완용으로 키울 수 있다");
    }
}
