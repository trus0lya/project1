package linear.arithmeticmean.entity;

public class ArithmeticMean {
    private double firstNum;
    private double secondNum;

    public ArithmeticMean(){
        firstNum = 0;
        secondNum = 0;
    }

    public ArithmeticMean(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("firstNum: ").
                    append(firstNum).append(", ").
                    append("secondNum: ").
                    append(secondNum);
       return stringBuilder.toString();
    }
}
