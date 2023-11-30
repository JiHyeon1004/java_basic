package chap_13;

import java.io.File;
import java.io.PushbackInputStream;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("파일 삭제 성공 : " + file.getName());
            }
            else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }
        else{
            System.out.println("파일이 없어요");
        }

        File folder = new File("A");
//
//        //하위에 폴더가 있다면 상위폴더를 지울 수 없다.
//
//        if(folder.exists()){
//            if(folder.delete()){
//                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
//            }
//            else{
//                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
//            }
//        }

        if(deleteFolder(folder)){
            System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
        }
        else {
            System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
        }

    }


    //팁 : 하위 폴더들이 있을 때 한꺼번에 지우는 방법

    public  static boolean deleteFolder(File folder){
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }

}
