package d.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet 클래스를 이용해 차 종류의 개수를 찾는 프로그램 (중복제거)
public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String cars[] = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    // basic HashSet
    public int getCarKinds(String[] cars) {
        if (cars == null) return 0; // null check
        if (cars.length == 1) return 1; // cars 배열의 크기가 1이면 확인할 필요 없이 1
        Set<String> carSet = new HashSet<>(); // carSet 이라는 HasSet 객체 생성
        for (String car : cars) {
            carSet.add(car); // carSet 객체에 cars 배열의 값들을 하나씩 담음, 중복된 값은 없고 유일한 데이터만 남음
        }
//        printCarSet(carSet);
        printCarSet2(carSet);
        return carSet.size(); // carSet 크기 리턴
    }

    // for loop 로 HashSet 객체 데이터 출력
    public void printCarSet(Set<String> carSet) {
        for (String temp : carSet) {
            System.out.print(temp+" ");
        }
    }

    // Iterator 객체를 얻어 HashSet 객체 데이터 출력
    public void printCarSet2(Set<String> carSet) {
        Iterator<String> iterator = carSet.iterator(); // iterator() 메소드를 사용하여 Iterator 객체 생성
        while (iterator.hasNext()) { // 다음 데이터가 존재하는지를 hasNext() 라는 메소드를 사용하여 지속적으로 확인
            System.out.print(iterator.next()+" "); // next() 메소드로 다음 값을 얻음
        }
        System.out.println();
    }
}

