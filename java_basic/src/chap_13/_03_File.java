package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) throws IOException {
        //파일 생성, 파일 정보 얻어오기
        String fileName = "test.txt"; //지금 작업하는 경로에 test.txt라는 이름으로 만들어진다.
        File file = new File(fileName);
        file.createNewFile(); //파일 생성
        if (file.exists()){
            System.out.println("파일이름 : " + file.getName());
            System.out.println("파일 절대 경로 : " + file.getAbsolutePath());
            System.out.println("파일 크기 (byte) : " + file.length());
        }
    }
}
