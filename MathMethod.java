package testDemo;

public class MathMethod {
    public static void main(String[] args) {
        // Math method link: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        int x=20;
        int y=10;
        int result;

        result=Math.max(x,y);
        System.out.println("Maximum value is ="+result);

        result=Math.min(x,y);
        System.out.println("Minimum value is ="+result);
        int a=-20;
        int absolute;
        absolute=Math.abs(a);
        System.out.println("Absolute value is ="+absolute);

        // power (square) method
        int p=3;
        int q=2;
        double power=Math.pow(p,q);
        System.out.println("p to the power q : ="+power);
        float round;
        round=Math.round(21.4);
        System.out.println("Round of 8.7= "+round);

        // static method 2 ta: E & PI
        double pie;
        pie=Math.PI;
        System.out.println("Pie ="+pie);

        System.out.println("E ="+Math.E);


    }
}
