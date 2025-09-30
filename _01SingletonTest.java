import java.util.Calendar;
class MainDoor {
	static MainDoor mainDoorRef = null; //default is null, one copy
	private MainDoor() { }
	static MainDoor getMainDoor() {
		if(mainDoorRef == null)
			mainDoorRef = new MainDoor(); //1st object created
		return mainDoorRef;
	}
}
class House {
	MainDoor mainDoor1 = MainDoor.getMainDoor(); //1st call
	MainDoor mainDoor2 = MainDoor.getMainDoor();
	MainDoor mainDoor3 = MainDoor.getMainDoor();
	void showHouse() {
		System.out.println("hash code of mainDoor1 : "+mainDoor1);
		System.out.println("hash code of mainDoor2 : "+mainDoor2);
		System.out.println("hash code of mainDoor3 : "+mainDoor3);
	}
}
public class _01SingletonTest {
	public static void main(String[] args) 
	{
		House house = new House();
		house.showHouse();
	}
}

			
/*		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Begin main...");
		
		Kitchen x = Kitchen.getKitchen();
		System.out.println("x "+x);
		
		Kitchen y = Kitchen.getKitchen();
		System.out.println("y "+y);
		
		Kitchen z = Kitchen.getKitchen();
		System.out.println("z "+z);
		
		System.out.println("End main...");
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		System.out.println("cal1 "+cal1.hashCode());
		System.out.println("cal2 "+cal2.hashCode());
		System.out.println("cal3 "+cal3.hashCode());
		
		
	}
}

class Kitchen {
	private static Kitchen ref; // created only once

	private Kitchen() {
		System.out.println("Kitchen Ctor()..");
	}	
	
	static Kitchen getKitchen() {
		System.out.println("getKitchen()...");
		
		if(ref==null) {
			System.out.println("creating Kitchen...");
			ref = new Kitchen();
		}
		else {
			System.out.println("Kitchen is already created...");
		}
		return ref;
	}
}*/





























