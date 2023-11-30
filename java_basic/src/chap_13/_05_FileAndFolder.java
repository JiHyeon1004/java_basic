package chap_13;

import java.io.File;
import java.io.FileDescriptor;

public class _05_FileAndFolder {
    public static void main(String[] args) {
//        String folder = "."; //현재 위치를 뜻한다.
//        String folder = "C:\\Dev\\WorkSpace\\Java(IntelliJ)\\java_basic\\java_basic\\src\\chap_13"; //절대 경로
        String folder = "src/chap_13"; //상대경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
            if(file.isFile()){
                System.out.println("파일입니다. : " + file.getName());
            }
            else if(file.isDirectory()){
                System.out.println("폴더입니다. : " + file.getName());
            }
        }
    }
}
