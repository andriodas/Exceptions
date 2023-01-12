package lt.vcs.lamda;

public class MainLamda {
    public static void main(String[] args) {
        //with lamda
        //() -> {}
        MyErrorMessage errorMessage = new MyErrorMessage() {
            @Override
            public void show(String message, int skaicius) {
                System.out.println(message + " | " + skaicius);
            }
        };

        errorMessage.show("Sveiki biciuliai", 45);
    }

    MyErrorMessage errorMessage = (message, skaicius) -> System.out.println(message + " | " + skaicius);
}
