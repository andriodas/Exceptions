package lt.vcs.dalyba;

public class InitDivider {
    public static int divide(String[] skaiciai) throws ArgumentisZeroException {
        int pirmasSkaicius = Integer.parseInt(skaiciai[0]);
        int antrasSkaicius = Integer.parseInt(skaiciai[1]);

        if (pirmasSkaicius == 0 && antrasSkaicius == 0) {
            throw new ArgumentisZeroException("PIRMAS", "ANTRAS");
        } else if (pirmasSkaicius == 0) {
            throw new ArgumentisZeroException("PIRMAS");
        } else if (antrasSkaicius == 0) {
            throw new ArgumentisZeroException("ANTRAS");
        }
        return pirmasSkaicius / antrasSkaicius;

    }
}
