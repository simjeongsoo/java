package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

// 중복되는 데이터가 저장되지 않도록 하는 Set
// 임의로 중복되지 않는 6개의 수를 생성하여 출력하는 프로그램
public class RandomNumberMaker {
    Random random = new Random(); // Random 객체 생성

    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        maker.printRandomNum(10); // 10회 반복 출력 
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> tempSixNum = new HashSet<>();

        while (true) {
            int tempNumber = random.nextInt(45) + 1; // 임의의 숫자를 리턴
            tempSixNum.add(tempNumber);
            if (tempSixNum.size() == 6) break;
        }

        return tempSixNum;
    }

    public void printRandomNum(int cnt) {
        for (int i = 0; i < cnt; i++) {
            HashSet<Integer> set = getSixNumber();
            System.out.println(set);
        }
    }

}
