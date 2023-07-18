package day09.assignment.innerclass.member;

public class MemberClass {
    private int memberValue;

    class InnerClass{
        private int innerValue = 10;

        public InnerClass() {
            memberValue = 10; // 외부의 멤버 변수에 접근이 가능하다.
//            this.memberValue=20; 하지만 this는 InnerClass를 말하므로 외부 멤버변수에 접근이 불가하다.
        }

        public int innerClassMethod(){
            return memberValue+innerValue; // 멤버 변수와 inner클래스의 변수와 연산도 가능하다.
        }
    }

    public static void main(String[] args) {
        MemberClass.InnerClass innerClass = new MemberClass().new InnerClass();
        // MemberClass에서 내부 클래스는 위와 같은 방식으로 외부가 먼저 생성된 후에 생성될 수 있다.
        int sum = innerClass.innerClassMethod();
        System.out.println(sum);
    }
}
