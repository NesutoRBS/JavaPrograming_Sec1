
public class TestDate {

	public static void main(String[] args) {
		// Test constructor and toString()
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
		
		//Test setters and getters method
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		System.out.println(d1);
		//Year is: 2012
		//Month is: 12
		//Day is: 23
		System.out.println("Year is: " + d1.getYear()
							+"\nMonth is: " + d1.getMonth()
							+"\nDay is: " + d1.getDay());
		//Test setDate
		d1.setDate(2024,3,15);
		System.out.println(d1);
	}

}
