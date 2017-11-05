/** 
	* Embedded class/enumeration <code>Floor</code>
	* Floor encapsulates all the logic and data surrounding floors.
	* Floor contains constant names e.g. <code>FIRST</code> for each floor.
	*/
public enum Floor{
		//name, queuedPassengers, hasDestinationRequest
		FIRST("FIRST",0,false), 
		SECOND("SECOND",0,false), 
		THIRD("THIRD",0,false), 
		FOURTH("FOURTH",0,false),
		FIFTH("FIFTH",0,false);
	;

	public int floorNumber; 
	public String name; 
	public int queuedPassengers; 
	public boolean hasDestinationRequest; 
	
	/**
	 * Floor constructor
	 */
	Floor(String name, int queuedPassengers, boolean hasDestinationRequest )
	{
		this.name= name; 
		this.floorNumber = this.ordinal()+1;
		this.queuedPassengers = queuedPassengers; 
		this.hasDestinationRequest = hasDestinationRequest; 
	}
	
	public Floor goDown() {
		Floor next;
		switch(floorNumber)
		{
		case 2:
			next = Floor.FIRST;
			break;
		case 3:
			next = Floor.SECOND;
			break;
		case 4:
			next = Floor.THIRD;
			break;
		case 5:
			next = Floor.FOURTH;
			break;
		default:
			next = Floor.FIRST;
			break;
		}
		return next; 
		
	}

	public Floor goUp() {
		Floor next;
		switch(floorNumber)
		{
		case 1:
			next = Floor.SECOND;
			break;
		case 2:
			next = Floor.THIRD;
			break;
		case 3:
			next = Floor.FOURTH;
			break;
		case 4:
			next = Floor.FIFTH;
			break;
		default:
			next = Floor.FIRST;
			break;
		}
		return next; 
	}

	public void addQueuedPassenger() {
		queuedPassengers++;
	}

	public void clearQueuedPassenger() {
		queuedPassengers=0;
	}
	
	public void makeDestinationRequest() {
		hasDestinationRequest = true; 
	}

	public void clearDestinationRequest() {
		hasDestinationRequest = false; 
	}
	
	public boolean hasDestinationRequests() {
		return this.hasDestinationRequest;
	}
}