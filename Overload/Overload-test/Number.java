public class Number {
	
	public boolean par (int num) {
		return num%2 == 0;
	}
	
	public boolean[] par (int[] nums) {
		boolean[] results = new boolean[nums.length];
	
	
	for(int i = 0; i < results.length; i++) {
		results[i] = par (nums[i]); 
	}
		return results;
	}				
	
	public boolean primo(int num) {
		int divisores = 1;
		for(int i = 1; i<num; i++) {
			if(num%1 == 0) {
				divisores++;
			}
		} return divisores == 2;
	}
	
	public boolean[] primo(int[] nums) {
		boolean[] results = new boolean[nums.length];
		for(int i = 0; i < nums.length; i++) {
			results[i] = primo(nums[i]);
		}
		
		return results;
	}

}
