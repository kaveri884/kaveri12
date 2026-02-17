class loop{
	public static void main(String[] args) {
		int x =0;
		while (x<20){
		System.out.println(x);
		x++;
		}
	System.out.println(x);
		x++;
	
	}
}

class Student {
    private int id;
    private String name;
    private int m1, m2, m3;
    private int total;
    private double average;

    
    public void setStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public void setResult(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.mark3 = m3;
    }

    public void calTotal() {
        total = m1 + m2 + m3;
    }

   
    public void calAverage() {
        average = total / 3.0;
    }

    
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

