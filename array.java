class array{
	public static void main(String args[]){
		/*int[] number;
		
		number=new int[6];
		
		number[0]=30;
		number[1]=20;
		number[2]=40;
		number[3]=70;
		number[4]=80;
		number[5]=90;
		
		System.out.println(number[3]);
		System.out.println(number[2]);
		System.out.println(number[1]);
		System.out.println(number[4]);
		System.out.println(number[5]);
		System.out.println(number[0]);*/
		
		
		/*String[]name=new String[6];
		
		name[0]="siva";
		name[1]="achchu";
		name[2]="kavi";
		name[3]="kapila";
		name[4]="apish";
		name[5]="apisanan";
		
		System.out.println(name[3]);
		System.out.println(name[2]);
		System.out.println(name[1]);
		System.out.println(name[4]);
		System.out.println(name[5]);
		System.out.println(name[0]);*/
		
		
		
		/*int i=0;
		while(i<5){
			System.out.println(i);
			i++;
		}*/
		
		/*int x=0;
		do{
			System.out.println(x);
			x++;
		}
		while(x<10);
		
		for(int i=0; i<=10; i=i + 2){
			System.out.println(i);
		}*/
		
	
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};

       
        System.out.println(" for loop:****************");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        
        System.out.println(" while loop:*****************");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j]);
            j++;
        }
			

       
        System.out.println(" do-while loop:*****************");
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);
    
		
		

			System.out.println("reverse:***************");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
}
		
			System.out.println("reverse while loop:***************");
				int s = numbers.length - 1;
		while (s >= 0) {
				System.out.println(numbers[s]);
			    s--;
		}

			System.out.println("reverse do-while loop:***************");
				int m = numbers.length - 1;
		do {
			System.out.println(numbers[m]);
				m--;
		} while (m >= 0);

    
		
    }


}
