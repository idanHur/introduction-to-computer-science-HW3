// 318247822 Idan Hur
package hw3;

public class Dog {
	private MyDate dateIn;
	private static int idCounter = 100;
	private boolean isMale;
	private int id;
	private String name;
	private String breed;
	private int weight;
	private int cageNum;
	

	public Dog( int weight , Boolean isMale ,MyDate in ,String name, String breed) {
		this.isMale = isMale;
		this.name = name;
		this.weight = weight;
		this.breed = breed;
		dateIn = in;
		id = idCounter++;
	}
	public int getCageNum() {
		return cageNum;
	}

	public void setCageNum(int cageNum) {
		this.cageNum = cageNum;
	}

	public MyDate getDateIn() {
		return dateIn;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getWeight() {
		return weight;
	}
	public static int getIdCounter() {
		return idCounter;
	}
	public String toString(){
		if (isMale) {
			return "dog id " + id + " " + name + " of type " + breed + " weights " + weight + " male enter to dog house on " + dateIn.toString();
		}
		else {
			return "dog id " + id + " " + name + " of type " + breed + " weights " + weight + " female enter to dog house on " + dateIn.toString() ;
		}
	}

	
}
