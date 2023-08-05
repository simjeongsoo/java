public class InterestManager {
    public static void main(String[] args) { 
        InterestManager interestManager = new InterestManager();
        long depositAmount=1000000;
//        for (int i = 1; i <=365; i++){
//            double amount = interestManager.calculateAmount(i,depositAmount);
//            System.out.println("day" + i +" : " +amount);
//
//            //            if (i%10 == 0) {
////                System.out.println("day" + i + " : " + interestManager.calculateAmount(i, total));
////            }
//
//        }

        for (int i = 10; i<=365;i+=10){
            double amount = interestManager.calculateAmount(i,depositAmount);
            System.out.println("day"+ i +" : "+amount);
        }
    }
    public double getInterestRate(int day){
        double interest;
        if (day>=365) interest=0.056;
        else if (day>=181) interest=0.02;
        else if (day>=91) interest=0.01;
        else interest=0.005;
        return interest;
    }
    public double calculateAmount(int day, long amount){
        double totalAmount;
        double interestRate =  getInterestRate(day);
        double interest = amount*interestRate;
        totalAmount=interest+amount;
        return totalAmount;
    }
}