package org.edu;

public class Medicine  extends Engineering {

	public void physio() {
		System.out.println("physio is depatment");
		
	}
private void dental() {
	System.out.println("dental is  about tooth");
}

private void mbbs() {
System.out.println("mbbs is degree");
}

	public static void main(String[] args) {
		Medicine k= new Medicine();
		k.physio();
		k.dental();
		k.mbbs();
		k.engDegree();
		k.engTech();
		k.bcom();
		k.bed();
		k.bsc();
		k.eduDgree1();
		k.eduDegree2();
		
	}

}
