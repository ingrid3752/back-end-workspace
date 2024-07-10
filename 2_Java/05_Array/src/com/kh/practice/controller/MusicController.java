package com.kh.practice.controller;

import com.kh.practice.model.Music;

public class MusicController {

	private Music music = new Music();
	
	public void add(String name, String songName) {
		music.setName(name);
		music.setSongName(songName);
	}
	
	public void modify(String name, String songName) {
		music.setName(name);
		music.setSongName(songName);
	}
	
	public Music info() {
		return music;
	}
}
