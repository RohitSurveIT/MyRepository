package com.dsa.array;

public class GasStation {

	
	public static int gasStation(int[] gas,int[] cost) {
		int totalGas=0,totalCost=0;
		for(int i=0;i<gas.length;i++) {
			totalGas+=gas[i];
			totalCost+=cost[i];
		}
		if(totalGas<totalCost) {
			return -1;
		}
		
		int currentTank=0,startIndex=0;
		for(int i=0;i<gas.length;i++) {
			currentTank+=gas[i]-cost[i];
			if(currentTank<0) {
				currentTank=0;
				startIndex=i+1;
			}
		}
		
		
		
		
		
		
		
		
		return startIndex;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		System.out.println(gasStation(gas,cost));

	}

}
