package com.rentco;

/**
 * Created by kgalligan on 4/25/15.
 */
public class Car
{
	int gas = 0;

	public Car()
	{
		refill();
	}

	public void drive(int distance)
	{
		gas = gas - distance;
		if(gas < 0)
			gas = 0;
	}

	public boolean isEmpty()
	{
		return gas == 0;
	}

	public void refill()
	{
		gas = gas + 10;
	}

	public void playMusic()
	{
		//Pretend we coded this
	}

	public void turn(int amount)
	{
		//Really complex turn code that we don't care about
	}

	public int getGas()
	{
		return gas;
	}
}
