package MethodReturn;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn referenceReturn = new ReferenceReturn();
        System.out.println(referenceReturn.intReturn());
        System.out.println(referenceReturn.intArrayReturn());
        System.out.println(referenceReturn.stringReturn());
    }
    public int intReturn(){
        int returnInt=0;
        return returnInt;
    }
    public int[] intArrayReturn(){
        int returnArray[] = new int[10];
        returnArray[0] = 3;
        return returnArray;
    }
    public String stringReturn(){
        String returnString = "StringReturn Value";
        return returnString;
    }
}
