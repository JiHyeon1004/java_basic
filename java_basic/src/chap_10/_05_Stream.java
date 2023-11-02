package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    //스트림 : 데이터가 흐른다.
    //스트림을 쓴다고 해서 원본 데이터가 훼손되지 않는다ㅣ.

    public static void main(String[] args) {

        //Stream 생성
        //Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        //Collections.stream
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();


        //Stream.of
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");


        //Stream 사용
        //중간 연산 (intermediate Operation) : filter, map, sorted, distinct, skip, ,,,
        //최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ,,,

        //90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("--------------------");

        //90점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);

        //90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);

        //90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("--------------------------------");

        //c로 시작하는 언어만 추출
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);

        //java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);

        //글자 길이가 4 이하인 언어
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);

        //4글자 이하 언어 중에서 c를 포함하는 언어
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);

        System.out.println("--------------------------");


        //4글자 이하 언어 중 c라는 글자를 포함하는 언어가 하나라도 있는지
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);


        //map
        //4글자 이하 언어 중 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        langList.stream().filter(x->x.length() <= 4).filter(x->x.contains("c")).map(x->x+" 어려워요").forEach(System.out::println);

        //c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream().filter(x->x.contains("c")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("---------------------------");

        //c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);
    }

}
