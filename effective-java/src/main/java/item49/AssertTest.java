package item49;

public class AssertTest {

    public static void main(String[] args) {
//        long[] t = {1, 2, 3};

//        sort(null, 1, 2);

//        int[] numbers = {1, 2, 3, 4, 5};
//        printArray(numbers);

        // 아래 주석을 해제하면 assert가 실패하고 AssertionError가 발생합니다.
         int[] emptyArray = {};
         printArray(emptyArray);
    }

    private static void sort(long[] a, int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }

    public static void printArray(int[] array) {
        // 배열이 null이 아니고, 길이가 0보다 큰 경우에만 출력
        assert array != null : "배열은 null일 수 없습니다.";
        assert array.length > 0 : "배열은 비어있을 수 없습니다.";

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
