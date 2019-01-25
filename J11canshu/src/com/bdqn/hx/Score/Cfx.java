package com.bdqn.hx.Score;

public class Cfx {
	
	public int height;
	public  int lenght;
	
	 
	public void rect(int lenght,int height){
		this.height=height;
		this.lenght=lenght;
	}
	 public int z(int height, int lenght){
			
			return (lenght+height)*2;
	 }
	 public int m( int height, int lenght){
		 return lenght*height;
	 }
	 public int zc(){
	
		return (lenght+height)*2;
	 }
	 public int mj(){
		 return lenght*height;
	 }
}
