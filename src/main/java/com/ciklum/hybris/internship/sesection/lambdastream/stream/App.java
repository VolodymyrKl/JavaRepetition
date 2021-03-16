package com.ciklum.hybris.internship.sesection.lambdastream.stream;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of using Stream API");

        String[] items = {"car", "toot", "box", "pencil", "per"};
        Stream.of(items)
                .filter(x -> x.startsWith("p"))
                .sorted()
                .forEach(x -> System.out.print(x + " "));

        Arrays.stream(new int[]{2, 4, 5, 1, 4, 6, 2})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        List<String> list = Arrays.asList("Computer", "ott", "toot");
        list.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("t"))
                .sorted()
                .forEach(System.out::println);

        String wordFile = "src/main/resources/wordFile.txt";
        try (Stream<String> lines = Files.lines(Paths.get(wordFile))) {
            lines.sorted()
                    .filter(l -> l.length() > 10)
                    .forEach(System.out::println);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        List<String> words = null;
        try {
            words = Files.lines(Paths.get(wordFile))
                    .filter(x -> x.contains("th"))
                    .collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Objects.requireNonNull(words).forEach(System.out::println);
    }
}
