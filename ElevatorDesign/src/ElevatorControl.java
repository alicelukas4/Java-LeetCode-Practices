

public class ElevatorControl {
	Elevator elevatorOne = new Elevator();  
	Elevator elevatorTwo = new Elevator(); 
	Elevator elevatorThree = new Elevator();  
	Elevator elevatorFour = new Elevator(); 
	
	public static final int ELEVATOR_COUNT = 4; 
	public Floor currentFloor;
	public String name;
	public boolean isFull; 
	public int direction;
	
	ElevatorControl()
	{
		currentFloor = Floor.FIRST; 
	}
	
	public void requestElevator(Floor origin, int dest, int passengers)
	{
		this.currentFloor = origin;

		if(elevatorOne.passengersOnBoard <= 10 && elevatorOne.currentFloor == this.currentFloor)
		{
			System.out.println("\n*****Elevator One approaching*****");
			elevatorOne.loadPassenger(dest);
			System.out.println(elevatorOne);
			for(int i=1;i<5;i++){
				elevatorOne.move();
			}
		}
		
		else if (elevatorTwo.passengersOnBoard <= 10 && elevatorTwo.currentFloor == this.currentFloor)
		{
			System.out.println("\n*****Elevator Two approaching*****");
			elevatorTwo.loadPassenger(dest);
			System.out.println(elevatorTwo);
			for(int i=1;i<5;i++){
				elevatorTwo.move();
			}
		}
		
		else if (elevatorThree.passengersOnBoard <= 10 && elevatorThree.currentFloor == this.currentFloor)
		{
			System.out.println("\n*****Elevator Three approaching*****");
			elevatorThree.loadPassenger(dest);
			System.out.println(elevatorThree);
			for(int i=1;i<5;i++){
				elevatorThree.move();
			}
		}
		
		else if (elevatorFour.passengersOnBoard <= 10 && elevatorFour.currentFloor == this.currentFloor)
		{
			System.out.println("\n*****Elevator Four approaching*****");
			elevatorFour.loadPassenger(dest);
			System.out.println(elevatorFour);
			for(int i=1;i<5;i++){
				elevatorFour.move();
			}
		}
	}
	
	public static void main(String[] args) {
		ElevatorControl elevatorControl = new ElevatorControl(); 
		elevatorControl.requestElevator(Floor.FIRST, 5,1);
		elevatorControl.requestElevator(Floor.FIRST, 3,1);
		elevatorControl.requestElevator(Floor.FIRST, 4,1);
		elevatorControl.requestElevator(Floor.FIRST, 5,1);
        
	}
}
