package chap09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("유재석", "파이썬"));
        studentList.add(new Student("박명수", "자바"));
        studentList.add(new Student("김종국", "자바"));
        studentList.add(new Student("조세호", "C"));
        studentList.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("----------------------------");

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if(s.certificate.equals("자바")){
                System.out.println(s.name);
            }
        }

    }

}
class Student{
    String name;
    String certificate;

    public  Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }
}
