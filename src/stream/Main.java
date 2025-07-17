package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String ...arg) {

        String input = "hello world hello java";

        Map<String, Long> wordFreq = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFreq);
        // Output: {world=1, java=1, hello=2}
    }
}
