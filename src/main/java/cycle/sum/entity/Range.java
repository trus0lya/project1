package cycle.sum.entity;

public class Range {
    private int lowerBound;
    private int upperBound;

    public Range(){

    }


    public Range(int lowerBound,int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lower bound: ").append(lowerBound).
                        append("upper bound: "). append(upperBound);
        return stringBuilder.toString();
    }
}
