package lt.vcs.dalyba;

public class ArgumentisZeroException extends Throwable {
    String message;
public ArgumentisZeroException(String additinalMessage){
    message = "Negalime dalinti nes " +additinalMessage +  " vienas is skaicius/ai turi NULI";
}
    public ArgumentisZeroException(String additional1, String additional2) {
        message =
                String.format(
                        "Negalime dalinti nes %s ir %s skaiciai turi po NULI",
                        additional1,
                        additional2
                );
    }

    @Override
    public String toString() {
        return message;
    }
}
