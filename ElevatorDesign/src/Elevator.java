/*
 * Design an elevator control system for a busy 5 floor  building with 4 elevators.
 * 
 * Requirements:
 * <ul>
 * <li>Create an Elevator class. The class should have a no argument constructor that sets 
 * up the elevator's state.</li>
 * <li>Define several constant values in the Elevator class. Include the capacity and number of floors in the building.</li>
 * <li>Augment the Elevator with data members indicating the current floor and current direction of travel. Also add 
 * data members for both its destination requests and the number of passengers destined for each floor. [It's tempting 
 * to think that an Elevator can determine if a given floor is among its destinations just by checking to see if it 
 * has any passengers destined for the floor. But this will not stand up under the later requirement that an Elevator 
 * could be destined for a particular floor just to fetch passengers, while having none on board who are going there.]</li>
 * <li>Add a method move() to the elevator with the characteristic that every time it is called it increments or 
 * decrements the value of the current floor, according to whether the elevator is moving up or down, changing 
 * directions as appropriate.</li>
 * <li>Override the toString() method of java.lang.Object (the default base class of every Java class) in your 
 * Elevator class which returns a String object summarizing all the pertinent values in the elevator, including the 
 * number of passengers on board and the current floor. [The call to System.out.println() will accept any object as 
 * an argument and will look for a toString method for a means to create a String it can write to standard out. 
 * Thus, if Elevator is equipped with toString, then System.out.println(myElevator) will get a String from 
 * myElevator.toString() and send it to standard out.]</li>
 * <li>When the Elevator reaches a floor that is among its destinations it should stop, otherwise it should keep moving. 
 * Write the stop() method in such a way that it prints a message to standard out announcing the event of its stopping 
 * and have it send your Elevator to standard out after all processing for the stop is complete, i.e. after discharging 
 * passengers, to show its post-stop-processing state.</li>
 * <li>Stopping should entail appropriate changes in state. For instance, if an Elevator had two passengers destined 
 * for a particular floor, stopping there should clear the number of passengers destined there and the number of 
 * passengers on board should decrease by two and eliminate the floor as a destination of the Elevator. [The class 
 * Floor comes in the next homework so you needn't worry about what happens to the passengers after the Elevator stops.]</li>
 * <li>Endow your Elevator with a method, boardPassenger(int floor), for boarding a passenger destined for a particular 
 * floor. Calling this method should increase the number of passengers destined there by one, and should increase the 
 * number of passengers on board by one. [Note: this does not require defining a class Passenger.] For now, allow your 
 * elevator to fill beyond its capacity, accepting more passengers than it can hold. In homework 2, we will use an 
 * exception to handle this error case and limit the occupancy in the elevator.</li>
 * <li>Add self-documenting javadoc comments to your class. Run the javadoc utility on your class and submit the resulting 
 * HTML file, Elevator.html, with your work. If you are submitting hard copy, submit a printout from your browser 
 * displaying the html documentation for the class. [This requirement will apply to every homework during the course.]</li>
 * </ul>
 */
	
public class Elevator{
	
	public static final int CAPACITY = 10; 
	//public static final int NUMBER_OF_FLOORS = 5;
	public int passengersOnBoard;
	public Floor currentFloor;
	public ElevatorDirection directionOfTravel;

	public enum ElevatorDirection {
		UP,      
		DOWN,    
		HOLD     
	}
	
	public void loadPassenger(int floor) {
		System.out.println("Loading a passenger. Destination Floor #" + floor );
		passengersOnBoard++;  
		switch(floor){
        case 1: Floor.FIRST.makeDestinationRequest();
            Floor.FIRST.addQueuedPassenger();
            break;
        case 2: Floor.SECOND.makeDestinationRequest();
            Floor.SECOND.addQueuedPassenger();
            break;
        case 3: Floor.THIRD.makeDestinationRequest();
            Floor.THIRD.addQueuedPassenger();
            break;
        case 4: Floor.FOURTH.makeDestinationRequest();
            Floor.FOURTH.addQueuedPassenger();
            break;
        case 5: Floor.FIFTH.makeDestinationRequest();
            Floor.FIFTH.addQueuedPassenger();
            break;
		}
	}

	public void unloadPassenger(int numberOfPeople) {
		System.out.println("Arriving at floor #"+this.currentFloor + ". Unloading a passenger");
		passengersOnBoard--; 
	}
	
	public Elevator(){
		currentFloor = Floor.FIRST;
        passengersOnBoard = 0;
        directionOfTravel = ElevatorDirection.UP;
	}
	
	public void move() {

        if (currentFloor == Floor.FIRST) {
            directionOfTravel = ElevatorDirection.UP;
        }
        if (currentFloor == Floor.FIFTH) {
            directionOfTravel = ElevatorDirection.DOWN;
        }

        if (directionOfTravel == ElevatorDirection.UP) {
        	System.out.println("--"+currentFloor);
            currentFloor = currentFloor.goUp();
        } else if (directionOfTravel == ElevatorDirection.DOWN) {
           currentFloor = currentFloor.goDown();
        }

       if(currentFloor.hasDestinationRequests()){
            stop();
        } 

    }
	
	public void stop()
	{
		System.out.println("Stopping on " + currentFloor.name + " floor");
		currentFloor.clearDestinationRequest();
		passengersOnBoard = passengersOnBoard - currentFloor.queuedPassengers;
		System.out.println(this);
	}
	
	@Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("Currently " + passengersOnBoard + " Passengers Onboard\r\n");
        output.append("On Floor   : " + currentFloor + "\r\n");
        return output.toString();

    }
	
	
}

