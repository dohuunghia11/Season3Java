package season3;

public class QuadraticEquation1 {
    private double a, b, c;

    public QuadraticEquation1(double a, double b, double c) {
        this.a = a;
        this.c = c;
        this.b = b;

    }

    public double getDiscriminant() {
        double delta;
        delta = (2 * this.a) - (4 * this.a * this.c);
        return delta;
    }

    public void setRoot1() {

        if (getDiscriminant() > 0) {
            double r1 = -this.b + Math.sqrt((this.b * this.b) - (4 * this.a * this.b)) / this.a * 2;
            double r2 = -this.b - Math.sqrt(getDiscriminant() / 2 * this.a);
        } else if (getDiscriminant() == 0) {
            double r1 = -this.b + Math.sqrt((this.b * this.b) - (4 * this.a * this.b)) / this.a * 2;
        } else {
            System.out.println(" The equation kas no roots ");
        }

    }
}


