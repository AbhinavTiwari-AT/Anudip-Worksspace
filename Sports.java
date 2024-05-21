package com.anudip.javaDemo;

class Sports
{
	void play()
	{
		System.out.println("i am playing");
	}
	
	class football extends Sports
	{
		 void ball()
		{
			System.out.println("i am playing with ball");
		}
	} 

	
	
	public static void main(String[] args)
	{
		Sports s=new Sports();
		s.play();
		s.ball();
	}
}
