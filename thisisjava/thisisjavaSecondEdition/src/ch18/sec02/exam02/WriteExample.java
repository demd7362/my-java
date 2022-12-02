package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            byte[] arr = {10,20,30,40,50};

            os.write(arr); // 배열의 모든 바이트를 출력
            os.flush();
            os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
