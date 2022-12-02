package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) throws IOException {
		// json 읽기
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/member.json"));
		String json = br.readLine();
		br.close();
		// json parsing
		JSONObject root = new JSONObject(json);
		
		// json 속성 정보 읽기
		System.out.println("id: "+root.getString("id"));
		System.out.println("name: "+root.getString("name"));
		System.out.println("age: "+root.getInt("age"));
		System.out.println("student: "+root.getBoolean("student"));
		
		// json 객체 속성 정보 읽기
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: "+tel.getString("home"));
		System.out.println("mobile: "+tel.getString("mobile"));
		
		// json 배열 정보 읽기
		JSONArray skill = root.getJSONArray("skill");
		Iterator<Object> iter = skill.iterator();
		System.out.print("skill: ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
	}

}
