package com.kh.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.object.model.Person;

public class SerializationTest {
	
	String fileName = "src/person.obj";

	public static void main(String[] args) {
		SerializationTest s = new SerializationTest();
		s.fileSave();
	}
	
	// 직렬화(Serialization) : 객체를 데이터 스트림으로 만드는 것
	public void fileSave() {
		// 1. 스트림 생성 
		// FileOutputStream : 파일 출력에 사용되는 기본 바이트 스트림 클래스 
		// ObjectOutputStream : 객체 단위로 출력 시에 사용되는 보조 바이트 스트림 클래스 
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);	
				) {
			
			// 2. 파일에 저장할 객체 생성
			Person p = new Person("셀레나 고메즈", "selenagomez");
			
			// 3. 파일에 데이터(객체) 저장
			oos.writeObject(p);
			
			System.out.println("person.obj 파일에 정보 저장!");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 역직렬화(deserialization) : 저장된 내용이나 전송받은 내용을 다시 복원하는 것
	public void fileRead() {
		// 1. 스트림 생성 
	}
	
	
	
}
