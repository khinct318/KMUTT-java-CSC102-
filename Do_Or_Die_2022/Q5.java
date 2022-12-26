import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args){
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<Owner> owners = new ArrayList<Owner>();
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0; i<count; i++){
			int id = sc.nextInt();
			String fn = sc.next();
			String ln = sc.next();
			String gender = sc.next();
			owners.add(new Owner(id, fn, ln, gender));
			int cid = sc.nextInt();
			String brand = sc.next();
			String color = sc.next();
			cars.add(new Car(cid, brand, color, owners.get(i)));
		}

		System.out.println("--- Car Owner List ---");
		for(int i=0; i<count; i++){
			Car c = cars.get(i);
			System.out.println("id: "+c.getId()+ 
					" brand: "+ c.getBrand() +
					" color: "+ c.getColor() + 
					" owner: "+ c.getOwner().getFirstName() + " " + c.getOwner().getLastName());
		}

	}
}

abstract class Person{
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    
    public Person(int id, String firstName, String lastName, String gender){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}

class Owner extends Person{
    public Owner(int id, String firstName, String lastName,String gender){
        super(id,firstName,lastName,gender);
    }
}

class Car{
    private int id;
    private String brand;
    private String color;
    private Owner owner;
    
    public Car(int id,String brand,String color,Owner owner){
        this.id = id;
        this.brand =brand;
        this.color = color;
        this.owner = owner;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public Owner getOwner(){
        return this.owner;
    }
    
    public void setOwner(Owner owner){
        this.owner = owner;
    }
}
