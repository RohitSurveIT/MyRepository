package com.dsa.array;

public class BuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		int i,n,cost;
		n=prices.length;
		cost=0;
		for(i=0;i<n;i++) {
			minPrice=Math.min(minPrice,prices[i]);
			cost=prices[i]-minPrice;
			maxProfit=Math.max(maxProfit, cost);			
		}
	
		return maxProfit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		
		

	}

}
