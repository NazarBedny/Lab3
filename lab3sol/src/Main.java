import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.SymbolTest();

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину першого катета: ");
        double a = input.nextDouble();
        System.out.print("Введіть довжину другого катета: ");
        double b = input.nextDouble();

        Task2 task2 = new Task2();
        task2.Solving(a,b);
    }
}