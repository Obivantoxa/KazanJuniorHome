package lesson13.homeWork;

public class Cat extends Animal {
	
	private String skinColor;

	public Cat(String name, String skinColor) {
		super(name);
		this.skinColor = skinColor;
	}

	public Cat() {
		super();
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((skinColor == null) ? 0 : skinColor.hashCode());
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
		Cat other = (Cat) obj;
		if (skinColor == null) {
			if (other.skinColor != null)
				return false;
		} else if (!skinColor.equals(other.skinColor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [catName = " + getName() + ", skinColor = " + skinColor + "]";
	}
	
	
	
}
