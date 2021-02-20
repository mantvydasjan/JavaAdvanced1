package encapsulation.example3;

public class BasicSalaryCalculator {

    private double basicSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if(basicSalary <0) {
            throw new IllegalArgumentException("Negative salary is not allowed");

        }
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() {
        return this.basicSalary + getSocialInsurance() + getAdditionalBonus();

    }

    public double getAdditionalBonus() {
        return this.basicSalary / 10;
    }

    public double getSocialInsurance() {
        return this.basicSalary * 25 / 100;
    }


}
