package d.generic.practice;

// 제네릭을 이용한 매개 변수로 넘어오는 값 중에서 가장 작은 값을 구현하는 메소드 구현
public class MaxFinder {
    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();
        finder.testGetMax();
        System.out.println("=======");
        finder.testGetMin();
    }

    // 최대값 계산 메소드
    public void testGetMax() {
        System.out.println(getMax(1,2,3));
        System.out.println(getMax(3,2,1));
        System.out.println(getMax(2,3,1));
        System.out.println(getMax("a","b","c"));
        System.out.println(getMax("b","c","a"));
        System.out.println(getMax("a","b","c"));

    }
    private <T extends Comparable<T>> T getMax(T ... a) { // 여러개의 매개변수를 T 타입의 a라는 배열값으로 담는다.(가변인수 활용)
                                                          // T 타입의 객체는 CompareTo() 메소드를 오버라이딩한 객체여야 한다. (Integer, String..)
        T maxT = a[0]; // 배열의 0번째 값을 최대값으로 지정
        System.out.println("compare = "+a[1].compareTo(maxT));
        for (T tempT : a) {
            if (tempT.compareTo(maxT) > 0) maxT = tempT; // 숫자 비교 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴
        }
        return maxT;
    }

    // 최소값 계산 메소드
    public void testGetMin() {
        System.out.println(getMin(1,2,3));
        System.out.println(getMin(3,2,1));
        System.out.println(getMin(2,3,1));
        System.out.println(getMin("a","b","c"));
        System.out.println(getMin("b","c","a"));
        System.out.println(getMin("a","b","c"));

    }
    private <T extends Comparable<T>> T getMin(T ... a) { // getMax()와 동일(가변인수 활용, Comparable 상속 클래스 한정)
        T maxT = a[0];
        for (T tempT : a) {
            if (tempT.compareTo(maxT)<0) maxT = tempT;
        }
        return maxT;
    }
}
