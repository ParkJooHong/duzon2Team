package day09.assignment.animal;

public class Chicken extends Animal implements Pet, Flyable{
    @Override
    public void eat() {
        System.out.println("닭은 닭 모이를 먹는다");
    }

    @Override
    public void forPets() {
        System.out.println("애완용으로도 키울 수 있다");
    }

    @Override
    public void fly() {
        System.out.println("잠시나마 날 수 있다");
    }
}
