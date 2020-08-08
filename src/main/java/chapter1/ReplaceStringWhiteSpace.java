package chapter1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1.5 Write a method to replace all spaces in a string with ‘%20’

public class ReplaceStringWhiteSpace {

    public static void main(String args[]) {
        ReplaceStringWhiteSpace replaceStringWhiteSpace = new ReplaceStringWhiteSpace();
        String url = "https: evocloud-prod3-public.s3 us-east-2.amazonaws.com 19 media   8309.pdf";
        System.out.println(replaceStringWhiteSpace.replaceWithDelimiter(url, " ", "%20"));

        String url2 = "https://evocloud-prod3-public.s3.us-east-2.amazonaws.com/19/media/8309.pdf";
        System.out.println(replaceStringWhiteSpace.replaceWithDelimiter(url2, "/", "#"));
    }

    String replaceWithDelimiter(String url, String symbol, String delimiter) {
        return Stream.of(url.split(""))
                .map(s -> s.replaceAll(symbol, delimiter))
                .collect(Collectors.joining());
    }
}
