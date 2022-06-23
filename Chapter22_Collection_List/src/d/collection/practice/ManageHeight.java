package d.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // 반별로 학생수를 저장하는 ArrayList

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 1; i < 6; i++) {
            manageHeight.printHeight(i); // 1~5 반까지 전체 학생 키 출력
        }
    }

    public void setData() {
/*
                ArrayList<Integer> classNo1 = new ArrayList<>();
         classNo1.add(170);
         classNo1.add(180);
         classNo1.add(173);
         classNo1.add(175);
         classNo1.add(177);
         list.add(classNo1);
        */

        list.add(new ArrayList<Integer>(Arrays.asList(170, 180, 173, 175, 177))); // 1반 5명
        list.add(new ArrayList<Integer>(Arrays.asList(160, 165, 167, 186))); // 2반 4명
        list.add(new ArrayList<Integer>(Arrays.asList(158, 177, 187, 176))); // 3반 4명
        list.add(new ArrayList<Integer>(Arrays.asList(173, 182, 181))); // 4반 3명
        list.add(new ArrayList<Integer>(Arrays.asList(170, 180, 165, 177, 172))); // 5반 5명
//        System.out.println(list.get(2).get(3));
    }

    // 반 번호를 매개변수로 넘겨주면 해당 반 학생들의 키를 번호 순서대로 출력 메소드
    public void printHeight(int classNo) {
        System.out.println("Class No.:: "+classNo);
        for (int i = 0; i < list.get(classNo-1).size(); i++) {
            System.out.println(list.get(classNo-1).get(i));
        }
    }
    // 각 반별 키의 평균을 계산하여 출력
    public void printAverage(int classNo) {
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0; i < list.get(classNo-1).size(); i++) {
            sum += list.get(classNo - 1).get(i);
        }
        avg = sum / list.get(classNo - 1).size();
        System.out.println(avg);
    }
}
