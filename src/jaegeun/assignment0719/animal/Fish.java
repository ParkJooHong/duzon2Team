package day09.assignment.animal;

public class Fish extends Animal implements Pet{


    // 물고기는 다른 지상 동물들과 숨을 쉬는 방식이 다르므로 선조클래스의 breathe()메소드를 재정의한다.
    @Override
    public void breathe() {
        System.out.println("숨을 쉬나 다른 동물과는 다르게 아가미로 숨을 쉰다");
    }

    @Override
    public void eat() {
        System.out.println("작은 새우를 먹고 산다");
    }

    @Override
    public void forPets() {
        System.out.println("어항에서 애완용으로 키우기도 한다");
    }
}
