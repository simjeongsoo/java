package c.middle;

// 각 직원의 타입과 연봉 저장
public class Employee {

    // 모든 값을 지정하는 생성자
    public Employee(String name, int type, long salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    private String name; // 이름
    private int type; // 업무 역할
    private long salary; // 연봉

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
