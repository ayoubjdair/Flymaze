package testing_package;

public class tempTestingClass {

	
	
	public static void main(String[] args){
		
		for (int i = 0; i<20; i++) {
			int zombieRoom = (int) ((Math.random() * (9 - 1)) + 1);
			//System.out.println("Number is:" + zombieRoom );
		}
		
		
		String map1 ="    [B]    \n[6] [7] [8]\n[5] [4] [3]\n[S] [1] [2]";
		String map2 = "        [3] [4]    \n[S] [1] [2]        \n        [5] [6] [B]";
		
		System.out.println(map2);
		
		
		
		
	}
	
	
}
