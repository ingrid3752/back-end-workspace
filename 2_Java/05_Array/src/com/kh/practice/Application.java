package com.kh.practice;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.controller.MusicController;
import com.kh.practice.model.Music;

public class Application {

	ArrayList<String> list = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	MusicController musicController = new MusicController();

	public static void main(String[] args) {

		Application app = new Application();
		boolean check = true;
		while (check) {
			int select = app.musicMenu();
			switch (select) {
			case 1:
				app.insertMusic();
				break;
			case 2:
				break;
			case 3:
				app.printMusic();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			default:
				check = false;
				break;
			}
		}
	}

		public int musicMenu() {
			System.out.println("=====메인 메뉴 =====");
			System.out.println("1.마지막 위치에 곡 추가");
			System.out.println("2.첫 위치에 곡 추가");
			System.out.println("3.전체 곡 목록 출력");
			System.out.println("4.특정 곡 검색");
			System.out.println("5.특정 곡 삭제");
			System.out.println("6.특정 곡 수정");
			System.out.println("7.가수 명 내림차순 정렬");
			System.out.println("8.곡 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			return Integer.parseInt(sc.nextLine());
	}
		public void insertMusic() {
			System.out.println("****** 마지막 위치에 곡 추가 ******");
			System.out.print("곡 명 : ");
			String songName = sc.nextLine();
			list.add(songName);
			
			System.out.print("가수 명 : ");
			String name = sc.nextLine();
			list.add(name);
			
			System.out.println("추가된 곡 : " + list);
		}
		
		public void updateMusic() {
			System.out.println("****** 특정 곡 수정 ******");
			System.out.println("검색할 곡 명 : ");
			String songName = sc.nextLine();
			System.out.println("수정할 곡 명 : ");
			String upSong = sc.nextLine();
			System.out.println("수정할 가수 명 : ");
			String upSing = sc.nextLine();
		}
		
		public void firstInsertMusic() {
			System.out.println("****** 첫 위치에 곡 추가 ******");
			System.out.println("곡 명 : ");
			String songName = sc.nextLine();
			list.add(0, new Music(sc.nextLine()));
			System.out.println("가수 명 : ");
			String name = sc.nextLine();
			list.add(0, new Music(sc.nextLine()));
			System.out.print("마지막에 추가된 곡 명 : "+ list);
		}
		public void printMusic() {
			System.out.println(musicController.info());
		}

}
