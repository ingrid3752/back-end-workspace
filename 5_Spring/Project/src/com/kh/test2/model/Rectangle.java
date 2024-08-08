package com.kh.test2.model;

public class Rectangle {
	
	private int width; // 원인1 : width,height - 접근제어자인데 + 접근제어자인 public으로 지정
	private int height;
	
	public Rectangle() { // superclass,field,getter,setter,toString
		super();
	}
	
	public Rectangle(int width, int height) { // 원인2 : public이 아닌 protected로 작성
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) { // 원인3 : setter에서 적용할것을 getter에서 작성
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
