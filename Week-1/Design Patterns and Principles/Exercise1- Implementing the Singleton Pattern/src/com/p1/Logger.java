package com.p1;

public class Logger 
{
	private static Logger log;
	private Logger()
	{
		System.out.println("1st instance of Logger created!");
	}
	public static Logger getL1()
	{
		if(log==null)
		{
			log=new Logger();
		}
		return log;
	}
	public void message(String str)
	{
		System.out.println("Log:"+str);
	}

}
