package easy;

public class leet121{

	public static int maxProfit(int[] prices) {
		int min_price = prices[0];
		int maxprof = 0;

		for(int i=0;i<prices.length;i++){
				maxprof = Math.max(maxprof,prices[i]-min_price);
				min_price = Math.min(prices[i],min_price);
		}

		return maxprof;
}

public static void main(String[] args){
    System.out.println(211);

		int[] numbers = new int[]{7,1,5,3,6,4};


		System.out.println(maxProfit(numbers));


}

}