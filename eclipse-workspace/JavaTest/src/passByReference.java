
public class passByReference {
	public static void main (String args[])
	{
		Car car1 = new Car("Mazda"); 
		System.out.println("Car inside main before printBrand: " + car1.brand);
		printBrand(car1); 
		System.out.println("Car inside main after printBrand: " + car1.brand);
		printBrandAgain(car1); 
		System.out.println("Car inside main after printBrandAgain: " + car1.brand);
	}

	public static void printBrand(Car car1) {
		// TODO Auto-generated method stub
		car1.brand = "Prius";		
		System.out.println("number inside printNext: " + car1.brand);
	}
	
	public static void printBrandAgain(Car car1) {
		// TODO Auto-generated method stub
		car1.brand = "Mercedez";		
		System.out.println("number inside printNextAgain: " + car1.brand);
	}
	
	private static class Car{
		private String brand;
		
		public Car (String brand)
		{
			this.brand = brand; 
		}
	}
}
