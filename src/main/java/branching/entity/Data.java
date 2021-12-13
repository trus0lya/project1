package branching.entity;

public class Data {
    private double num;

    public Data(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        return stringBuilder.toString();
    }
}
