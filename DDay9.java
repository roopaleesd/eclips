package build;

public class DDay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String

				
				String fname = new String("Rupali");
				String lname = "dhokchaule";
                System.out.println(fname);
                System.out.println(lname);
				

				String city = "pune";
				System.out.println(city);

				
				System.out.println(city.charAt(0));
				System.out.println(city.charAt(1));
				System.out.println(city.charAt(2));
				System.out.println(city.charAt(3));

				// printing every character of string
				String city2 = "chandrapur";
				for (int i = 0; i < city2.length(); i++) {
					//System.out.println(i);
					System.out.println(city2.charAt(i));
				}

			
				for(int i = city2.length()-1  ; i >= 0 ; i--) {
					System.out.println(city2.charAt(i));
				}
				
				
				// program 2 
				int a = 10;
				int b = 50;
				String c = "hello";
				System.out.println(a+b+c);
				System.out.println(b+c+a);
				System.out.println(c+a+b);
				
				
				String first_namea = "shlok";
				String last_nameb = "dhokchaule";
			
				System.out.println("My firstname is "+first_namea +" my lastName name is "+last_nameb);
				
				String greeting = "hello";
				String greet = greeting.concat("world !");
				System.out.println(greet);
				
				
				// program 3
				
				String firstName2 = "sangamner";
				String upperCase = firstName2.toUpperCase();
				System.out.println(upperCase);
				
				// program 4
				

				String firstName3 = "Flower";
				String lowerCase = firstName3.toLowerCase();
				System.out.println(lowerCase);
				
				//program 5
				// substring()
				
				String myName="AhmedNagar";
				String substr=myName.substring(5);
			    System.out.println(substr);
			    
				
				//program 6
				// equals()
			    
				
				
				// contains()
				
				
				
				
				
				
				
				
	}

		
	}


