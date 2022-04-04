package testing_package;

public class tempTestingClass {

	
	
	public static void main(String[] args){
		
		for (int i = 0; i<5; i++) {
			int zombieRoom = (int) ((Math.random() * (9 - 1)) + 1);
			System.out.println("Number is:" + zombieRoom );
		}
		
		
		String map1 ="    [B]    \n[6] [7] [8]\n[5] [4] [3]\n[S] [1] [2]";
		String map2 = "        [3] [4]    \n[S] [1] [2]        \n        [5] [6] [B]";
		String map3 = "[B] [12] [11]     \n[4]      [6]  [7]\n[3] [2]  [5]  [8]\n[S] [1]  [10] [9]";
		String map4 = "[3] [4]  [5]  [6]\n[2] [9]  [8]  [7]\n[1] [10] [11] [12]\n[S] [B]  [14] [13]";
		
		System.out.println(map4);
		
		
		
		
	}
	
	
}
