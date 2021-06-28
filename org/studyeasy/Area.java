package org.studyeasy;

public class Area {
	static int l;
	static int b;
	static int h;
	

	public int Area(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
		
		return l*b*h;
	}
	public int Area(int l) {
		this.l = l;
		return l*l;
	}
	public int Area(int l, int b) {
		this.l = l;
		this.b = b;
		return l*b;
	}
	public float Area1(int t) {
		this.l = t;
		return t*3.14f;	
		
	}
	

}
