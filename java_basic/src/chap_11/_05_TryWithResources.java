package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {

        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("--------------------------");

        //자동으로 해주는 방법 (close 메소드를 자동으로 호출)
        //단, 이 객체가 AutoCloseable을 구현하고 있어야한다.
        try (MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("빵이 먹고 싶엉");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

class MyFileWriter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다ㅣ.");
    }

    public void write(String line){
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}