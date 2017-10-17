package com.company;


public class CarApp extends Vehicle
{
	{
		System.out.println("The The Blue Jetta is Tested: ");
	}
	private String going_90_mph;

	@Override
	public String getaccelerating()
	{
		return going_90_mph;
	}

	@Override
	public void setaccelerating(String going_90_mph)
	{
		this.going_90_mph = going_90_mph;
	}

	public String accelerate()
	{

		return "accelerate";
	}
}



