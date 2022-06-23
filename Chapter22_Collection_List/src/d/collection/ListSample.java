package d.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList1();
//        sample.checkArrayList2();
//        sample.checkArrayList3();
//        sample.checkArrayList4();
//        sample.checkArrayList5();
//        sample.checkArrayList6();
        sample.checkArrayList7();
//        sample.checkArrayList8();
    }

    public void checkArrayList1() {
        ArrayList list1 = new ArrayList(); // 객체를 저장할 공간이 10개인 ArrayList 를 만듬
        list1.add(new Object());
        list1.add("ArrayListSample");
        list1.add(1.0);
        /*
         ArrayList 는 서로다른 객체를 하나의 배열에 넣지 않고 대부분 한가지 종류의 객체만 저장
         여러 종류의 객체를 담을 때에는 DTO 객체를 만들어 담는것 권장
         컬렉션 관련 클래스의 객체들을 선언 할 때에는 제네릭을 사용하여 선언 권장
        */
        ArrayList<String> list2 = new ArrayList<String>(); // String 만 담는 ArrayList 선언
        ArrayList<String> list3 = new ArrayList<>(); // JDK7 부터 사용 가능

    }

    // add() 메소드의 순서
    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        for (String tempData : list) {
            System.out.println(tempData);
        }
    }

    // addAll() 메소드
    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    // 하나의 Collection 관련 객체를 복사할 일이 있을 때에는 생성자를 사용하거나, addAll() 사용 권장
    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list; // Shallow copy (원본 객체의 주소값만을 할당)
                                        // Deep copy (원본에 영향이 없음) ex) arraycopy()
        list.add("Ooops");
        for (String tempData : list2) {
            System.out.println("List2 " + tempData); // list2 를 출력했는데 list 의 값이 출력
        }
        /*
        * list2=list 는 list2 가 list 의 값만 사용하는게 아니라 list 객체가 생성되어 참조되고 있는 주소까지도 사용
        *   -> 변수는 다르지만 하나의 객체가 변경되면 다른 이름의 변수를 갖는 객체의 내용도 바뀜
        * */
    }

    // ArrayList 의 값을 꺼내오는 get()
    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ") = " + list.get(loop));
        }
    }

    // ArrayList 객체에 있는 데이터들을 배열로 뽑아내는 toArray() 메소드
    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        // 제네릭을 사용하여 선언한 ArrayList 는 toArray() 의 매개변수로 변환하려는 타입의 배열을 지정
        String[] strList = list.toArray(new String[0]); // new String[0] 은 의미없이 타입만을 지정하기 위해 사용
        System.out.println(strList[0]);
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
//        String[] tempArray = new String[3]; // tempArray 라는 공간에 String 배열 객체를 생성하여 toArray() 메소드에 매개변수로 전달
//        String[] tempArray = new String[5]; // 나머지 공간 null 출력
//        String[] tempArray = new String[2]; // 모두 null 로 처리
        String[] tempArray = new String[0]; // 타입만을 지정하는것 권장
        String[] strList = list.toArray(tempArray); // strList 에는 list 객체의 데이터 개수만큼 데이터가 들어가있음
        for (String temp : strList) {
            System.out.println(temp);
        }
    }

    // ArrayList 데이터 삭제
    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
//        System.out.println("Remove " + list.remove(0)); // 지정한 위치 데이터 삭제
//        System.out.println(list.remove("A")); // 지정한 첫번째 데이터 삭제
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp); // 지정한 모든 데이터 삭제
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get(" + loop + ") = " + list.get(loop));
        }

        // 값을 변형하는 메소드
        System.out.println(list.set(1,"K")); // 해당 위치에 있던 데이터 리턴
        System.out.println(list.get(1));
    }

    // 쓰레드에 안전하지 않은 ArrayList 를 안전하게 선언
    public void checkArrayList9() {
        List list = Collections.synchronizedList(new ArrayList<>());
    }

}
