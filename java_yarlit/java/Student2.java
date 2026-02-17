class Student2 {
    int id;
    String name;
    int m1; 
	int m2;
	int m3;
    int total;
    double average;

    void setStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void setResult(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calTotal() {
        total = this.m1 + this.m2 + this.m3;
    }

    void calAverage() {
        average = total / 3.0;
    }

    void getResult() {
        if (average >= 75) {
            System.out.println("A" );
        } else if (average >= 65) {
            System.out.println("B" );
        } else if (average >= 55) {
            System.out.println("C" );
        } else if (average >= 45) {
            System.out.println("D" );
	    }else {
            System.out.println("E" );
        }
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.m1 + ", " + this.m2 + ", " + this.m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + getResult());
    }
}