package day09.assignment.innerclass.anonymous;

import java.util.ArrayList;

abstract class Human{
    void breathe(){
        System.out.println("사람은 숨을 쉰다.");
    }
    void eat(){

    }
    void run(){
        System.out.println("뛴다.");
    }
}

class Parent{
    public void print(){
        System.out.println("부모클래스");
    }
}


/**
 * 무명 클래스를 통해 단일 상속만이 가능한 자바에서 다중 상속과 같이 사용할 수 있다.
 */
public class AnonymousClass extends Parent{ // Parent라는 부모클래스를 단일 상속 받으면서
    public static void main(String[] args) {
        // Human이라는 추상 클래스를 다중상속하는것과 같이 사용할 수 있는 무명 클래스
        Human human = new Human() {

            // 사용하고자하는 메소드만 재정의하여 사용이 가능하다.
            @Override
            void eat() {
                System.out.println("사람은 음식을 먹는다.");
            }
        };
        AnonymousClass a = new AnonymousClass();

        a.print(); // 부모 클래스에 있는 print()메소드를 호출할 수 있다.


        // Human이라는 추상 클래스에 구현된 메소드도 호출할 수 있으면서
        human.breathe();
        human.run();

        // 무명 클래스에서 재정의한 eat()메소드를 호출할 수 있다.
        human.eat();
    }

}
