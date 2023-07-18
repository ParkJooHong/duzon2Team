package day09.assignment.animal;

/**
 * 인터페이스 : 추상 메서드만으로 구성되어 있다.
 * 날 수 있는 동물들을 위한 인터페이스
 */
public interface Flyable {

    void fly();
    // 날 수 있는 동물마다 나는 행위가 조금씩 다르므로 자식 클래스에서 재정의하며 차이를 두도록 한다.
}
