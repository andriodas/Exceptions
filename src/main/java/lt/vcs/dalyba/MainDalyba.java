package lt.vcs.dalyba;

public class MainDalyba {
    public static void main(String[] args) {

        String[] masyvas = InputManager.askForInput();
        try {
            System.out.println(InitDivider.divide(masyvas));
        } catch (ArgumentisZeroException e) {
            System.out.println(e);
        }
    }
}
