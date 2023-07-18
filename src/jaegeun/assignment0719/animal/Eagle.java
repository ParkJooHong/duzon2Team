package day09.assignment.animal;

public class Eagle extends Animal implements Flyable{

    @Override
    public void eat() {
        System.out.println("독수리는 고기를 쪼아서 찢어 먹는다");
    }

    @Override
    public void fly() {
        System.out.println("날개를 이용해 날 수 있다.");
    }
}
