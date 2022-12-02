package ch18.sec08;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        //DataOutputStream 생성
        FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("정지훈");
        dos.writeDouble(95.1012);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(9510.12);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();
        //DataInputStream 생성
        FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        //기본 타입 입력
        for(int i=0; i<2; i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name+" : "+score+" : "+order);
        }
        dis.close();
        fis.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }
}
