package linear.pi.entity;

public class Pi {
    public double piDegree(int n){
        double res = 1;
        for(int i = 0; i<n;++i){
            res *= Math.PI;
        }
        return res;
    }
}
