package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects objects = new NumberObjects();
        objects.parseLong("123");
        objects.parseLong("r123");
        objects.printOtherBase(1024);
    }

    private void printOtherBase(long value) {
        System.out.println("Original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : "+ Long.toOctalString(value));
    }

    public long parseLong(String data){
        long longData = -1;
        try {
            longData = Long.parseLong(data);
            System.out.println(longData);
        } catch (NumberFormatException nfe) {
            System.out.println(data + " is not a number.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return longData;
    }

}

