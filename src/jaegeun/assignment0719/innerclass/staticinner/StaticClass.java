package day09.assignment.innerclass.staticinner;

public class StaticClass {
    private int memberValue = 10; // 객체 생성시에 heap영역에 생성

    static final int FINALSTATIC = 20; // 클래스 로딩(컴파일)시점에 static영역에 생성
    static int staticValue = 30;

    public void operator(){
        memberValue++;
    }

    // 외부 클래스에 정적 멤버로서 선언된다.
    public static class InnerClass{

        private static int innerValue=40;

        public static int innerMethod(){
//          memberValue = 20;
//          static영역에 있는 InnerClass는 외부 객체 생성시에 힙 영역에 생성되는 memberValue에 접근할 수 없다.

            int sum = staticValue+FINALSTATIC+innerValue;
            return sum;
            // 하지만 외부에 있는 static 변수와 static final 변수에는 접근이 가능하다.
        }
    }

    public static void main(String[] args) {
//        StaticClass.operator(); 외부의 메소드는 객체를 생성하기 전에는 호출할 수 없지만

        System.out.println(InnerClass.innerValue);
        InnerClass.innerMethod();
        // static Inner Class는 외부의 인스턴스와는 독립적으로 동작하기 때문에
        // 내부 클래스명. 변수 or 메소드로 바로 접근, 호출이 가능하다.
    }
}
