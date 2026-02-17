class Number{
	public static void main(String args[]){
		System.out.print(35+47);
	}


}
class Student{
	public static void main(String args[]){
	
	Int id;
	id=2;
	String name;
	name="kavi";
	
	void setStudent();
	System.out.println("id"+ID );
	System.out.println("name"+NAME );
	
    getStudent();
	System.out.println("2"+ID );
	System.out.println("name"+NAME );
	

	}

}

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Navbar Example</title>
  <style>
    body {
      margin: 0;
      font-family: system-ui, sans-serif;
    }

    /* Navbar container */
    .navbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: #2563eb; /* blue */
      padding: 0.75rem 1rem;
    }

    /* Brand/logo */
    .navbar .brand {
      font-weight: bold;
      color: #fff;
      font-size: 1.2rem;
      text-decoration: none;
    }

    /* Nav links */
    .navbar ul {
      list-style: none;
      display: flex;
      margin: 0;
      padding: 0;
    }

    .navbar ul li {
      margin-left: 1rem;
    }

    .navbar ul li a {
      color: #fff;
      text-decoration: none;
      padding: 0.5rem;
      border-radius: 4px;
      transition: background 0.2s;
    }

    .navbar ul li a:hover {
      background: rgba(255, 255, 255, 0.2);
    }

    /* Responsive: stack links on small screens */
    @media (max-width: 600px) {
      .navbar {
        flex-direction: column;
        align-items: flex-start;
      }
      .navbar ul {
        flex-direction: column;
        width: 100%;
      }
      .navbar ul li {
        margin: 0.5rem 0;
      }
    }
  </style>
</head>
<body>
  <nav class="navbar">
    <a href="#" class="brand">MySite</a>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Services</a></li>
      <li><a href="#">Contact</a></li>
    </ul>
  </nav>
</body>
</html>
