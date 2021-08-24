import java.util.Scanner;

public class EnTriangelOchDessCirklar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in längden för sidan A, B och C i en triangel: ");
        double sidaA = scan.nextDouble();
        double sidaB = scan.nextDouble();
        double sidaC = scan.nextDouble();
        double radieOmskrivenCirkel = Triangel.omskrivnaCirkeln(sidaA, sidaB, sidaC);
        double radieInskrivenCirkel = Triangel.inskrivnaCirkeln(sidaA, sidaB, sidaC);

        System.out.printf("Omskrivna cirkelns radie: %.2f\n" +
                "Inskrivna cirkelns radie: %.2f", radieOmskrivenCirkel, radieInskrivenCirkel);
    }
}
