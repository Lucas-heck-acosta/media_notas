import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();

        Double convertedNum = num;

        System.out.println("Número covertido em wrapper: " + convertedNum);
    }
}
