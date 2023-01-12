package lt.vcs.streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class MainStreams {
    public static void main(String[] args) {
        List<String> sarasas = Arrays.asList("a9", "a2", "b9", "b3", "b5", "b6", "bc8", "ba7");
        List<String> modifikuotasSarasas;

        System.out.println(sarasas);

        sarasas.stream()
                .filter(kintamasis -> kintamasis.contains("b"))
                .map(elementas -> elementas + "_" + LocalTime.now().getNano())
                .forEach(elementas -> System.out.println(elementas));

    }
}
