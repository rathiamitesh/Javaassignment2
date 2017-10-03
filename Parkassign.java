package parkplaza;


class Vehicle {	 
 String model;
 String regnum;
 int numofwheels;
 public Vehicle(){	  
 }
 public Vehicle(String model, String regnum, int numofwheels){
 this.model = model;
 this.regnum = regnum;
 this.numofwheels = numofwheels;
}

 public void printDetails(){
 System.out.println("The Licence number of this vehicle is " + this.regnum);
 System.out.println("The model of this vehicle is " + this.model);
 System.out.println("The number of wheels in this vehicle is "+ this.numofwheels);
 }
  
}

class Bike extends Vehicle {
	
	public Bike(){	  
	 }
	 public Bike(String model, String regnum){
	 this.model = model;
	 this.regnum = regnum;
	 this.numofwheels=2;
	}
 }
class Car extends Vehicle {
	
	public Car(){	  
	 }
	 public Car(String model, String regnum){
	 this.model = model;
	 this.regnum = regnum;
	 this.numofwheels=4;
	}
 }
class Parkinglevel 
{
	public Parkinglevel(){
		
	}
	public int tspacesfor4=100,tspacesfor2=100,aspacesfor4=0,aspacesfor2=0;
	public String[] vehiclesonlevel = new String[200];
	public int i=0;
	static int total=0;
	public void caradd(Car a){
		if(tspacesfor4==0)
		{
			System.out.println(" No available spaces on this level! ");
			System.exit(0);

		}
		else{
		tspacesfor4--;
		aspacesfor4++;
		vehiclesonlevel[i]=a.regnum;
		i++;
		total++;}
	}
	public void bikeadd(Bike b){
		if(tspacesfor2==0)
		{
			System.out.println(" No available spaces on this level! ");
			System.exit(0);

		}
		else
			{tspacesfor4--;
		aspacesfor4++;
		vehiclesonlevel[i]=b.regnum;
		i++;
		total++;
		}
	}
}

public class Parkassign extends Parkinglevel {
		 		 
public static void main(String[] args) {
	Car random = new Car("XTR", "Z32E874");
	random.printDetails();
Parkinglevel l1= new Parkinglevel();
l1.caradd(random);
Parkinglevel l2= new Parkinglevel();
l2.caradd(random);
System.out.println(" No. of Parked vehicles: "+Parkinglevel.total);

}}
