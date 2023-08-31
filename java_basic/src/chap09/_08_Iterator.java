package chap09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        //데이터를 순회
        //확인하다가 바로 삭제도 가능

        List<String> list = new ArrayList<>(); //List가 인터페이스이고 이를 ArrayList가 상속하므로 이렇게 쓸 수 있다.
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------------");

        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------------------");


        it = list.iterator();
        while (it.hasNext()) {
            if(it.next().contains("(알 수 없음)")){
                it.remove();
            }
        }

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------------------------------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("--------------------------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator는 제공되지 않는다. (키와 벨류 중 어떤 것을 기준으로 할 지 몰라서)

        //key 기준
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        //value 기준
       Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        //세트로
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
