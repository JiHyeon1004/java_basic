package chap09;

import javax.xml.validation.Validator;
import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //key, value
        //중복 x, 순서 x
        //순서 보장하고싶다면 LinkedHashMap 사용하면된다.

        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        System.out.println(map.size());

        System.out.println("--------------------------");

        //조회
        System.out.println(map.get("유재석"));
        System.out.println(map.get("박명수"));

        //확인
        if(map.containsKey("서장훈")){
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        }else{
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록, 포인트 1");
        }

        System.out.println("----------------------");

        //삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        //전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("------------------------");


        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        //순회

        //key
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------------------");

        //value
        for (int value : map.values()) {
            System.out.println(value);
        }

        //key&value
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}
