package com.bdqn.hx.Score;

import java.util.Scanner;
public class Z{
	
	 private int Length;
	 private int Height;
	 int Collect(){
	  Rect();
	  return (Length+Height)*2;
	 }
	 int Area(){
	  Rect();
	  return Length*Height;
	 }
	    void Rect(){}
	    void Rect(int Length) {
	     this.Length = Length;
	        this.Height = Length;
	    }
	   void Rect(int Length,int Height)
	    {
	        this.Length=Length;
	        this.Height=Height;
	    }
	}
	
