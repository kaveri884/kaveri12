class maincomputer{
	public static void main(String args[]){
		computer objcomputer=new computer();
    
		objcomputer.model = "srilanka";
		objcomputer.ram = 99.0;   
		objcomputer.weight = 10.0;    
		objcomputer.size = "7cm";
		objcomputer.brand = "DELL";
		
		objcomputer.stard();
		objcomputer.restart();
		objcomputer.shutdown();
		System.out.println("model"+ objcomputer.model);
		System.out.println("ram"+ objcomputer.ram);
		System.out.println("weight"+ objcomputer.weight);
		System.out.println("size"+ objcomputer.size);
		System.out.println("brand"+ objcomputer.brand);
		

		computer objcomputer1=new computer();
		
		objcomputer1.model = "indian";
		objcomputer1.ram = 167.0;   
		objcomputer1.weight = 20.0;    
		objcomputer1.size = "8cm";
		objcomputer1.brand = "HP";
		
		objcomputer1.stard();
		objcomputer1.restart();
		objcomputer1.shutdown();
		System.out.println("model"+ objcomputer1.model);
		System.out.println("ram"+ objcomputer1.ram);
		System.out.println("brand"+ objcomputer1.weight);
		System.out.println("size"+ objcomputer1.size);
		System.out.println("brand"+ objcomputer1.brand);
	}
}