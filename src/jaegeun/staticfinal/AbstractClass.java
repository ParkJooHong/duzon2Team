package day09.assignment.staticfinal;

public abstract class AbstractClass {
    public final int FINALVALUE = 10;
    // final변수(상수)는 생성시에 꼭 초기화 해야한다.

    public static final int STATICFINALVALUE=20;
    // static final변수는 불변하는 값으로 컴파일 시점에 메모리의 static 영역으로 할당된다.

    public final void finalMethod(){
        System.out.println("이 메소드는 오버라이딩되선 안된다.");
    }

    public AbstractClass() {
    }

    public abstract void abstractMethod();

}

final class FinalClass{
    public void finalClassMethod(){
        System.out.println("이 클래스는 상속되선 안된다.");
    }
}

class StaticClass{
    static int staticValue;
    // static변수는 클래스 로딩(컴파일)시점에 메모리에 할당되며 인스턴스 생성 없이 접근이 가능하다.

    public static void staticMethod(){
        System.out.println("static메소드는 인스턴스 생성 없이 호출 가능하다.");
    }
}

class AbstractTest extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod는 선조에서 구현하지 않은 추상 메소드이므로 자식 클래스가 구현해야한다.");
    }

    /**
     * 메소드에 final이 붙는다면 Overriding을 할 수 없다.
     */
//    @Override
//    public void finalMethod(){
//
//    }

    public static void main(String[] args) {
       AbstractTest at = new AbstractTest();
//       at.finalValue = 20; final(상수)변수는 한번 할당된 후에는 값을 변경할 수 없다.
        at.finalMethod();
        at.abstractMethod();

        StaticClass.staticMethod();
        System.out.println(STATICFINALVALUE);
        System.out.println(++StaticClass.staticValue);

    }
}


/**
 * 클래스에 final이라는 키워드가 붙는다면 상속을 할 수 없다.
 */
//class Test extends FinalClass{
//
//}
