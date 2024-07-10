package com.kh.practice.model;

import java.util.Objects;

public class Music {

	private String name;
	private String songName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, songName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(name, other.name) && Objects.equals(songName, other.songName);
	}
	
	@Override
	public String toString() {
		return "Music [name=" + name + ", songName=" + songName + "]";
	}
	
	public Music(String name, String songName) {
		super();
		this.name = name;
		this.songName = songName;
	}
	
	public Music() {
		super();
		
	}
}
