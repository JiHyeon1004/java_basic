package chap09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        //데이터 추가
        list.addFirst("서장훈");
        list.addLast("김희철");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------");


        list.add(1, "김영철");
        for (String s : list) {
            System.out.println(s);
        }

        //삭제
        System.out.println("삭제 전 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("삭제 후 : " + list.size());

        //처음과 마지막 삭제
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }


        //변경
        list.set(0, "이수근");

        for (String s : list) {
            System.out.println(s);
        }

        //확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }

        //전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("리스트가 비었습니다. size : " + 0);
        }

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }


    }
}
