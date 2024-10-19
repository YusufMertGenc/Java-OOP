
public class QuadraticEquation {
        private int a,b,c;


    public QuadraticEquation(int a, int b, int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        if (getDiscriminant() < 0)
            return 0;

        return (-b+Math.pow(getDiscriminant(),0.5))/2*a;
    }

    public double getRoot2(){

        if (getDiscriminant()<0)
            return 0;

        return (-b - Math.pow(getDiscriminant(),0.5))/2*a;
    }


}
