package d.collection;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
        System.out.println("=========");
//        sample.checkPop();
    }

    public void checkPeek() {
        Stack<Integer> intStack = new Stack<>();
        for (int loop = 0; loop < 5; loop++) {
            intStack.push(loop); // 데이터를 가장 위에 저장
            System.out.println(intStack.peek()); // 가장 위에 있는 데이터 리턴
        }
        System.out.println("size=" + intStack.size());

        // stack 0->1->2->3->4 순서로 쌓임
        // 가장위에 있는 데이터를 삭제하고 리턴 == 4 -> LIFO
        System.out.println("=="+intStack.pop());
    }

    public void checkPop() {
        Stack<Integer> intStack = new Stack<>();
        for (int loop = 0; loop < 5; loop++) {
            intStack.push(loop); // 데이터를 가장 위에 저장
            System.out.println(intStack.pop()); // 객체의 가장 위에 있는 데이터를 지우고 리턴
        }
        System.out.println("size=" + intStack.size());
    }

}
