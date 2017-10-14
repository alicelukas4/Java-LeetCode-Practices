
public class superTest {

	superTest(){
		System.out.println("super constructor");
	}
}

class childTest extends superTest
{
	int i = 9; 
	childTest(){ 
		System.out.println("child constructor");
	}
}

class SuperChildTest {
	public static void main(String[] args) {
		childTest childClass = new childTest(); 
		System.out.println(childClass.i); 
	}
}
