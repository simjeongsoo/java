package c.casting;

import c.inheritance.Child;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        //inheritance.objectCast();
        //inheritance.objectCast2();
        inheritance.objectCastArray();

    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        //부모 객체 생성시 자식 생성자 사용 가능
        //  -> 자식 생성자 호출시 부모 생성자 자동 호출 => 부모객체 생성할때 부모 생성자 사용 하므로 오류 x
        ParentCasting parent2 = child;
        parent2.printName(); // printName() - Child

        // 자식 객체 생성시 부모 생성자 사용 불가
        //  -> 부모 생성자 호출시 자식 생성자 호출 안함 ( 형변환 필요 )
        // ChildCasting child2 = parent;

        // 형변환시 컴파일은 정상적으로 동작 , 실행은 불가
        ChildCasting child2 = (ChildCasting) parent;
    }

    // 명시적 형변환
    public void objectCast2() {
        ChildCasting child = new ChildCasting();

        // 부모 객체 생성시 자식 생성자 사용
        ParentCasting parent2 = child;
        // 자식 객체 생성시 child 사용 (ChildCasting 클래스의 객체로 만든 parent2) -> 사실상 ChildCasting 객체
        // parent2를 ChildCasting 으로 형변환 하여도 오류x
        ChildCasting child2 = (ChildCasting) parent2;
    }

    // 참조 자료형의 형변환 사용 예시
    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3]; // ParentCasting 객체 배열 선언
        parentArray[0] = new ChildCasting(); // 자식 클래스의 객체 할당
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting(); // 자식 클래스의 객체 할당
        //objectTypeCheck(parentArray);
        objectTypeCheck2(parentArray);

    }

    // 객체의 타입 check 예약어 : instanceof
    public void objectTypeCheck(ParentCasting[] parentArray) { // 객체 배열을 매개변수로 받는 메소드
        for (ParentCasting tempParent : parentArray) { // 반복문
            if (tempParent instanceof ChildCasting) { // 배열의 인스턴스 타입이 ChildCasting 이라면
                System.out.println("ChileCasting"); // 출력

                // ChildCasting 클래스에만 선안된 printAge() 메소드를 호출
                // ParentCasting 인 객체는 printAge() 메소드가 없으므로 ChildCasting 객체만 사용
                // 자식 객체 생성시 부모 생성자 사용(조건:자식 클래스의 객체가 할당된 생성자만 사용 -> 명시적 형변환)
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();

            } else if (tempParent instanceof ParentCasting) { // 배열의 인스턴스 타입이 ParentCasting 이라면
                System.out.println("ParentCasting"); // 출력
            }
        }
    }

    // instanceof 의 확인 순서
    public void objectTypeCheck2(ParentCasting[] parentArray) {
        for (ParentCasting tempParent2 : parentArray) {

            // instanceof 로 타입 점검시 가장 하위에 있는 자식 타입부터 확인을 해야 타입 점검이 가능
            if (tempParent2 instanceof ParentCasting) { // 이 값은 항상 true 이다
                System.out.println("ParentCasting");

                // Condition 'tempParent2 instanceof ChildCasting' is always 'false'
            } else if (tempParent2 instanceof ChildCasting) {
                System.out.println("ChileCasting");
                ChildCasting tempChild = (ChildCasting) tempParent2;
                tempChild.printAge();
            }
            /*
            * result
                ParentCasting
                ParentCasting
                ParentCasting
            */

        }
    }

}
