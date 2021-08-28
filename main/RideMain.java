package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RideMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Ride> noOfRide = new ArrayList<>();
		System.out.println("Enter how many ride's want to travel");
		int n = sc.nextInt();
		int ride = n;
		while (ride != 0) {
			System.out.println("Enter the how much distance want to travel: ");
			double distance = sc.nextDouble();
			System.out.println("Enter the how much time want to travel: ");
			int time = sc.nextInt();
			Ride userCab = new Ride(distance, time);
			noOfRide.add(userCab);
			ride--;
		}
		double totalFare = 0;
		for (Ride r : noOfRide) {
			totalFare += (r.distance * RideCharge.MinimumCostPerKM) + (r.time * RideCharge.CostPerMinute);
		}
		int avgFarePerRide=  (int) (totalFare/n);

		System.out.println("The total Fare " + totalFare + " for " + n + " no.of ride's");
		System.out.println("Average Fare per Ride is "+avgFarePerRide );
		sc.close();
	}

}