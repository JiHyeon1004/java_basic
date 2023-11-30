package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        //bufferedReader : 읽을 때
        //bufferedWriter : 쓸 때

        //파일 쓰기
        //try구문 끝날 때 자동으로 bw.close 메소드 호출해준다.
        //두 번째 값의 true는 append의 true이다.
        // (덮어쓰기를 할 지, 추가를 할지)
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
////            bw.write("1. 이제 거의 끝이 보여요.");
////            bw.newLine();
////            bw.write("2. 여기까지 오신 여러분들 정말 대단해요");
////            bw.newLine();
//            bw.write("조금만 더 화이팅");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
