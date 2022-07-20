package lesson13.homeWork;

public class Parrot extends Animal {
	
	private String countryFrom;

	public Parrot() {
		super();
	}

	public Parrot(String name, String countryFrom) {
		super(name);
		this.countryFrom = countryFrom;
	}

	public String getCountryFrom() {
		return countryFrom;
	}

	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((countryFrom == null) ? 0 : countryFrom.hashCode());
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
		Parrot other = (Parrot) obj;
		if (countryFrom == null) {
			if (other.countryFrom != null)
				return false;
		} else if (!countryFrom.equals(other.countryFrom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parrot [parrotName = " + getName() + ", countryFrom=" + countryFrom + "]";
	}
	
	
	

}
