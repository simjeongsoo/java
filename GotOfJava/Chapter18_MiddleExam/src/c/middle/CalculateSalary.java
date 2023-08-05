package c.middle;

import c.emums.IncreaseRate;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary salary = new CalculateSalary();
        salary.calculateSalaries(); // 출력
    }

    // Employee 객체가 들어오면 인상된 연봉을 리턴해주는 메소드
    public long getSalaryIncrease(Employee employee) {
        double increaseRate =  getIncreaseRate(employee.getType());
        double upSalary = employee.getSalary() * increaseRate;
        double realSalary = employee.getSalary() + upSalary;
        return (long) realSalary;
    }

    // 연봉 인상률을 구하는 메소드
    public double getIncreaseRate(int type) {
        switch (type) {
            case 1:
                return IncreaseRate.OWNER.getIncreaseRate();
            case 2:
                return IncreaseRate.MANAGER.getIncreaseRate();
            case 3:
                return IncreaseRate.DESIGNER.getIncreaseRate();
            case 4:
                return IncreaseRate.ARCHITECT.getIncreaseRate();
        }
        return IncreaseRate.DEVELOPER.getIncreaseRate();
    }

    // 배열의 각 값을 꺼내 연봉을 계산하고 리턴하는 메소드
    public void calculateSalaries() {
        Employee[] employees ={
                new Employee("LeeDaeRi",1,1000000000),
                new Employee("KimManager",2,100000000),
                new Employee("WhangDesign",3,70000000),
                new Employee("ParkArchi",4,80000000),
                new Employee("LeeDevelop",5,60000000)
        };

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+" = "+getSalaryIncrease(employees[i]));
        }

    }
}
