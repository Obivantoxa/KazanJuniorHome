package lesson13.homeWork;

public class Dog extends Animal {
	
	private int weigth;

	public Dog() {
		super();
	}

	public Dog(String name, int weigth) {
		super(name);
		this.weigth = weigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + weigth;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (weigth != other.weigth)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [dogName = " + getName() + ", weigth = " + weigth + "]";
	}
	
	
	
	

}
