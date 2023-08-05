public class SalaryManager {
    public static void main(String[] args){
        SalaryManager salaryManager = new SalaryManager();
        // 연봉
        int yearlysalary = 20000000;
        double monthlySalary = salaryManager.getMonthlySalary(yearlysalary);
        System.out.println("after-tax pay : "+monthlySalary);
    }
    public double getMonthlySalary(int yearlySalary){
        //월급계산
        double monthlySalary = yearlySalary/12.0;

        double earnedIncomeTax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        double taxAll = earnedIncomeTax+nationalPension+healthInsurance;

        monthlySalary-=taxAll;
        return monthlySalary;
    }
    public double calculateTax(double monthSalary){
        //근로소득세 리턴
        double earnedIncomeTax = monthSalary*0.125;
        System.out.println("earnedIncomeTax : " + earnedIncomeTax);
        return earnedIncomeTax;
    }
    public double calculateNationalPension(double monthSalary){
        //국민연금 리턴
        double NationalPension = monthSalary*0.081;
        System.out.println("NationalPension : " + NationalPension);
        return NationalPension;
    }
    public double calculateHealthInsurance(double monthSalary){
        double healthInsurance = monthSalary*0.135;
        System.out.println("HealthInsurance : "+healthInsurance);
        return healthInsurance;
    }

}
