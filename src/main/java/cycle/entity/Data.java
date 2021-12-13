package cycle.entity;

public class Data {
    private int num;

    public Data(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        return stringBuilder.toString();
    }
}
