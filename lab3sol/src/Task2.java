public class Task2 {
    public void Solving(double a,double b){
        double c = Math.hypot(a, b);
        double alpha = Math.toDegrees(Math.asin(a / c));
        double beta = Math.toDegrees(Math.asin(b / c));

        System.out.printf("Кут при першому катеті: %.2f градусів%n", alpha);
        System.out.printf("Кут при другому катеті: %.2f градусів%n", beta);
    }
}
