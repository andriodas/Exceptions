package lt.vcs.dalyba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    private static int insertDigit(String saiciuSeka) {
        Scanner scanner = new Scanner(System.in);
        int ivestasSkaicius = 0;
        boolean arIvestasSveikasSkaicius = false;

        do {
            try {
                System.out.println("Iveskite " + saiciuSeka + " sveika skaiciu");
                ivestasSkaicius = scanner.nextInt();
                arIvestasSveikasSkaicius = true;
            } catch (InputMismatchException e) {
                System.out.println("Klaida! Iveskite sveika skaiciu.");
                scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ivyko nezinoma klaida!.");
            } finally {
                scanner.nextLine();
            }
        } while (!arIvestasSveikasSkaicius);
        return ivestasSkaicius;

    }

    public static String[] askForInput() {
        Integer pirmasSkaicius = insertDigit("PIRMA");
        int antrasSkaicius = insertDigit("ANTRA");

        return new String[]{
                pirmasSkaicius.toString(),
                String.valueOf(antrasSkaicius)
        };

    }
}
