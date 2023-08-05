package ch13source.enums;

public enum HealthInsurance {

    LEVEL_ONE(1000,1.0),
    LEVEL_TWO(2000,2.0),
    LEVEL_THREE(3000,3.2),
    LEVEL_FOUR(4000,4.5),
    LEVEL_FIVE(5000,5.6),
    LEVEL_SIX(6000,7.1);

    private final int maxSalary; // 최대 연봉
    private final double ratio; // 공제 비율

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        // 연봉을 매개 변수로 받으면 그 연봉에 해당하는 enum 객체를 리턴

        if (salary <= LEVEL_ONE.maxSalary) return LEVEL_ONE;
        else if (salary <= LEVEL_TWO.maxSalary) return LEVEL_TWO;
        else if (salary <= LEVEL_THREE.maxSalary) return LEVEL_THREE;
        else if (salary <= LEVEL_FOUR.maxSalary) return LEVEL_FOUR;
        else if (salary <= LEVEL_FIVE.maxSalary) return LEVEL_FIVE;
        else return LEVEL_SIX;

    }

    // 공제비율 return
    public double getRatio() {
        return ratio;
    }
}
