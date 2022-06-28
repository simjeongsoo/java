package d.collection.practice;

import java.util.*;

// 1~50 까지의 임의의 수를 생성하는 작업을 5000번 수행하여 각 숫자별로 몇번이 나왔는지 확인하는 프로그램
public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics rns = new RandomNumberStatistics();
        rns.getRandomNumberStatistics();
    }

    // 1~5000 임의의 수 5000번 생성, 생성한 임의의 수를 putCurrentNumber() 로 전달
    public void getRandomNumberStatistics() {
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;

        for (int i = 0; i < runCount; i++) {
            int ranNum = random.nextInt(DATA_BOUNDARY)+1;
            putCurrentNumber(ranNum);
        }
        printStatistics();
    }

    // HashTable 에 tempNumber 의 통계 정보를 저장
    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) { // hashtable 에 tempNumber 로 넘어온 값이 있다면
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1); // 해당 키의 횟수에 +1
        }else { // hashtable 에 tempNumber 로 넘어온 값이 없다면
            hashtable.put(tempNumber, 1); // 해당 키에 대한 처음 값을 저장

        }
    }

    // hashtable 에 있는 데이터 출력
    public void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for (int key : keySet) {
            int count = hashtable.get(key); // putCurrentNumber() 에서 중복된 숫자 count 한 결과 호출
            System.out.print(key+" = "+count+"\t");
            if (key%10 -1 == 0) System.out.println(); // 키가 11,21,31,41 일 경우 줄바꿈 수행
        }

//        Set<Integer> set = new HashSet<>(); // hashtable 에 있는 key 값을 받기 위한 Set
//        set = hashtable.keySet(); // Key 목록 저장
//
//        for (int setTemp : set) { // 출력
//            System.out.print(setTemp+" = " );
//            if (setTemp%10 -1 == 0) System.out.println(); // 키가 11,21,31,41 일 경우 줄바꿈 수행
//        }

    }
}
