import java.util.Scanner;

public class Task1 {
    public void SymbolTest(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        String countOfGenerate = myScanner.nextLine();
        int count = Integer.parseInt(countOfGenerate);
        for (int i = 0; i < count; i++) {
            char c = (char)(Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}
