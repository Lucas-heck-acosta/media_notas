import java.util.Scanner;

public class MediaNotas {
    private static final int NUM_NOTAS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma =  0.0;

        for (int i = 0; i < NUM_NOTAS; i++)
        {
            System.out.print("Digite a nota número " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        System.out.println();
        double media = soma / NUM_NOTAS;
        System.out.println("A média final foi: " + media);
        if (media >= 7)
        {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println();

        scanner.close();
    }
}
