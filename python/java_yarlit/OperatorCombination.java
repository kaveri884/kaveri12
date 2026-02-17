class OperatorCombination{
	public static void main(String args[]){
		int a=10;
		int b=3;
		int c=5;
		
		a= b++ + c++;
		System.out.println("a:"+b);
		System.out.println("a:"+b);
		System.out.println("a:"+b);
		
		c = b = a;
		System.out.println("a:"+b);
		System.out.println("a:"+b);
		System.out.println("a:"+b);
		
		b = a-- + --b - c++;
		System.out.println("a:"+b);
		System.out.println("a:"+b);
		System.out.println("a:"+b);
	}
}