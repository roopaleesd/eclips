package build;

public class DDay10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			
			
				// CharAt()
				
				String firstName = "soni";
				char q  = firstName.charAt(1);
				System.out.println(q);
				
				// length()
				String lastName = "deshmukh";
				int j = lastName.length();
				System.out.println(j);
				
				// substring()
				String info = "javascript";
				
				
				
				String q2 = info.substring(2);
				System.out.println(q2);
				String q3 = info.substring(2,7);
				System.out.println(q3);
				
			
				// toUpperCase()
				String city = "pune";
				String q4 = city.toUpperCase();
				System.out.println(q4);
			
			
				// toLowerCase()
				
				String city2 = "Nagpur";
				String q5 = city2.toLowerCase();
				System.out.println(q5);
				
				//trim()
				String city3 = " Goa ";
				System.out.println(city3.length());
				String q6 = city3.trim();
				System.out.println(q6.length());
				
				// startsWith()
				String city4 = "Chandrapur";
				boolean q7 = city4.startsWith("Ch");
				System.out.println(q7);
				
				boolean q8 = city4.startsWith("C");
				System.out.println(q8);
			
				// endsWith()
				
				String city5 = "jaipur";
				boolean q9 = city5.endsWith("r");
				System.out.println(q9);
				
				boolean q10 = city5.endsWith("pur");
				System.out.println(q10);
				
				// replace()
				String info2 = "I am learning javascript and javascript is great";
				String q11 =  info2.replace("I", "J");
				System.out.println(q11);
				
				// replaceFirst()
				String q12 = info2.replaceFirst("javascript","java");
				System.out.println(q12);
				
				// replaceAll()
				String q13 = info2.replaceAll("javascript", "java");
				System.out.println(q13);
				
				// contains
				
				String q14 = "I am learning js";
				boolean a1 = q14.contains("learning");
				System.out.println(a1);
				
				
				// indexOf()
				
				String city33 = "pune";
				
				
				int a2 =  city33.indexOf("p");
				System.out.println(a2);
				
				// lastIndexOf()
				
				String city44 = "chandrapur";
			

				int a3 =  city44.indexOf("a");
				System.out.println(a3);
				
				int a4 = city44.lastIndexOf("a");
				System.out.println(a4);
				
			
				// split()
				
				String infoa = "rupali-dhokchaule-325362563653276";
				String [] vl = infoa.split("-");  
				System.out.println(vl);
				
				for(int i = 0 ; i < vl.length ; i++) {
					System.out.println(vl[i]);
				}
				
				// isEmpty()
				
				String h = "";
				System.out.println(h.isEmpty());
				
				String g = " ";
				System.out.println(g.isBlank());
				System.out.println(g.isEmpty());
				
				//isEqual()
				
				String a= "hello";
				String b = "Hello";
				
				System.out.println(a.equals(b));
				System.out.println(a.equals(b));
				System.out.println(a.equalsIgnoreCase(b));
				
				
				
				
				
				}

		
	}


