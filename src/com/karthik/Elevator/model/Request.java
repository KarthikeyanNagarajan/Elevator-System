package com.karthik.Elevator.model;

public class Request
{
	private int sourceFloor;
	private int destinationFloor;

	public Request(int sourceFloor, int destinationFloor)
	{
		this.sourceFloor = sourceFloor;
		this.destinationFloor = destinationFloor;
	}

	public int getSourceFloor()
	{
		return sourceFloor;
	}

	public int getDestinationFloor()
	{
		return destinationFloor;
	}
}
