package service;


public class PersonalityCalculator {
	
	public  String findYourBrainType(String ans) {
		int sum1=0,sum2=0,sum12=0;
		int[] ans_int_array=new int [ans.length()];
		ans_int_array=findAnswers(ans);
		sum12=ans_int_array[0]+ans_int_array[1]+ans_int_array[2]+ans_int_array[4]+ans_int_array[7]+ans_int_array[9]+ans_int_array[10]+ans_int_array[11]+ans_int_array[13]+ans_int_array[17]+ans_int_array[19];
			sum2=ans_int_array[3]+ans_int_array[5]+ans_int_array[6]+ans_int_array[8]+ans_int_array[12]+ans_int_array[14]+ans_int_array[15]+ans_int_array[16]+ans_int_array[18];
			sum1=/*66-*/sum12+sum2;
		if(sum1 >=20 && sum1<=55)
			return "rightbrained";
		else if(sum1>=56 && sum1<=64)
			return "No clear preference";
		else if(sum1 >=65 && sum1<=100)
			return "leftbrained";
		else 
			return "Invalid ";
	 
	 }
	private int[] findAnswers(String ans) {
		String[] ans_array=ans.split(",");
		int arr[]=new int[20];
		for (int i=0;i<20;i++)
		{
			arr[i]=Integer.parseInt(ans_array[i]);
		}
		
		return arr;
	}
	
}