package main;

public class RideCharge {
	public static int MinimumCostPerKM = 10;
	public static int CostPerMinute = 1;
	public static int MinimumFare = 5;
}

class Ride extends RideCharge {
	public double distance;
	public int time;

	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}

	public double CalculateFare() {
		double totalFare = (distance * MinimumCostPerKM) + (time * CostPerMinute);
		return Math.max(MinimumFare, totalFare);
	}
}
