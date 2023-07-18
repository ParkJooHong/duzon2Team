package day09.assignment.innerclass.local;

public class LocalClass {
    public void localClassMethod(){

        int localValue = 10;
        final int FINALVALUE = 30;

        // LocalClass의 메소드내에서 생성되는 지역 중첩 클래스이다.
        class InnerClass{
            private int innerLocalValue=20;

            public InnerClass() {
//                localValue = 20;
//                중첩 클래스의 생성자 메소드 내에서는 비록 메소드 구역에 잇지만
//                                 지역 변수에는 접근이 불가능하다.
//                --> InnerClass객체가 생성되는 시점에는 localValue가 이미 스택에서 사라져있기 때문에
//                접근이 불가능하다.
            }

            public int innerMethod(){
                System.out.println(FINALVALUE); // InnerClass내에서 지역상수는 접근이 가능하다.
                System.out.println(localValue);
                // 하지만 일반 메소드에서는 메소드가 호출될 때 스택에 localValue가 남아있어 접근이 가능하다.
                System.out.println(++innerLocalValue);

                return innerLocalValue+FINALVALUE;
            }
        }
        InnerClass localInnerClass = new InnerClass();
        int sum = localInnerClass.innerMethod();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.localClassMethod();
    }
}
