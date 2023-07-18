package day09.assignment.animal;

/**
 * abstract 클래스 : 추상메소드와 구현된 메소드가 함께 공존하는 클래스
 */
public abstract class Animal {

    // 동물들의 공통이 되는 숨은 추상클래스에 정의하여 후손클래스들이 공통적으로 사용하도록 한다.
    public void breathe(){
        System.out.println("숨을 쉰다");
    }

    // 먹는 방식과 먹이의 종류는 동물들마다 다르므로 후손클래스들이 정의하도록 추상 메서드로 구현한다.
    public abstract void eat();
}
