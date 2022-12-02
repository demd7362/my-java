package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("C:/Users/user/Desktop/lab/VSCode/Java/thisisjava/src/Ch18/sec07/exam02/ReadLineExample.java");
        BufferedReader br = new BufferedReader(fr);

        int lineNo = 1;
        while(true){
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNo +"\t"+str);
            lineNo++;
        }
        br.close();
    }
}
