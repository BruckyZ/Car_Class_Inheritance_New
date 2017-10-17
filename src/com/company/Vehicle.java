package com.company;

public class Vehicle
{
	//This is constractor: This is the no argument constructor which is automatically generated unless we define another constructor
	public Vehicle()
	{
	//	System.out.println("The New Vehicle is Tested: ");
	}

	private String starting;
	private String going_90_mph;
	private String accelerating;
	private String stopped;

	public String getStarting()
	{
		return starting;
	}

	public void setstarting(String starting)
	{
		this.starting = starting;
	}

	public String getGoing_90_mph()
	{
		return going_90_mph;
	}

	public void setgoing_90_mph(String going_90_mph)
	{
		this.going_90_mph = going_90_mph;
	}

	public String getaccelerating()
	{
		return accelerating;
	}
	public void setaccelerating(String accelerating)
	{
		this.accelerating = accelerating;
	}
	public String getStopped()
	{
		return stopped;
	}

	public void setStopped(String stopped)
	{
		this.stopped = stopped;
	}

}



