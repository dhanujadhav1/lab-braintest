package service;


public class PersonalityCalculator {
	
	public  String findYourBrainType(String ans) {
		int sum1=0;
		int[] ans_int_array=findAnswers(ans);
		for(int i=0;i<ans_int_array.length;i++) {
			sum1=sum1+ans_int_array[i];
		}
		if(sum1 >=20 && sum1<=55)
			return "rightbrained";
		else if(sum1>=56 && sum1<=64)
			return "No clear preference";
		else if(sum1 >=65 && sum1<=100)
			return "leftbrained";
	 
	 }
	private int[] findAnswers(String ans) {
		int[] ans_array=new int [20];
		int count=0;
		for (int i=0;i<ans.length;i++)
		{
			ans_array[i]=Integer.parseInt(ans[count]);
			count+=2;
			
		}
		return ans_array;
	}
	
}