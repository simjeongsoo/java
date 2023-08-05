package ParamArray;

import DTO.MemberDTO;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs=new MethodVarargs();
        //varargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        //varargs.calculateNumbers(1,2,3,4,5);

        MemberDTO dto=new MemberDTO("java","01000000000","google@google.com");
        System.out.printf("name:%s\nphone:%s\nemail:%s\n",dto.name,dto.phone,dto.email);
    }
    public void calculateNumbersWithArray(int []numbers){
        int total=0;
        for (int number:numbers){
            total+=number;
        }
        System.out.println("Total="+total);
    }
    public void calculateNumbers(int...numbers){
        int total=0;
        for (int number:numbers){
            total+=number;
        }
        System.out.println("Total="+total);
    }
}
