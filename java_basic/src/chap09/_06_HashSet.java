package chap09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //중복 허용하지 않는다.
        //set을 썼을 때는 순서 보장되지 않는다.
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        //확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }

        //삭제
        System.out.println("삭제 전 :" + set.size());
        set.remove("삼겹살");
        System.out.println("삭제 후 :" + set.size());

        //전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 수 : " + set.size());
            System.out.println("집으로 출발");
        }


        //linkedHashSet을 사용하면 순서가 보장된다.
        HashSet<Integer> integerHashSet = new LinkedHashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(13);
        integerHashSet.add(2);

        for (int i :integerHashSet) {
            System.out.println(i);
        }


    }
}
