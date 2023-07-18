package day09.assignment.polymorhpism;

interface Family{
    void familyMethod(Family family);
}

class Parent{
    public int x;

    public void parentMethod(){
        System.out.println("부모 메서드입니다.");
    }

    public void commonMethod(){
        System.out.println("공통 메서드입니다.");
    }
}

public class Polymorhpism extends Parent implements Family{

    @Override // 자식 클래스에서 부모 클래스에서 이미 정의된 메소드를 다시 재정의 하였다.
    public void parentMethod() {
        System.out.println("부모 메서드였지만 이제는 자식 메서드입니다.");
    }

    @Override
    public void familyMethod(Family family) {
        if(family instanceof Family){
            System.out.println("우리는 가족입니다.");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Polymorhpism();
        parent.commonMethod(); // 부모가 정의한 메소드를 호출할 수 있다.
        parent.parentMethod();
        // 부모 클래스가 자식의 메소드를 호출하는 유일한 방법으로 자식 클래스가 재정의한 메소드로 호출된다.

        Polymorhpism polymorhpism = new Polymorhpism();
        polymorhpism.familyMethod(polymorhpism);
        // 자식 클래스가 Family인터페이스를 구현하였고
        // familyMethod()가 Family타입을 인자로 원하지만 자식 클래스로 인자를 넣어도 업캐스팅 되어
        // familyMethod가 실행되는 것을 볼 수 있다.
    }

}
