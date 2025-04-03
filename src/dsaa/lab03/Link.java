package dsaa.lab03;

public class Link{
	public String ref;
	// in the future there will be more fields
	public Link(String ref) {
		this.ref=ref;
	}


	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Link that)) {
			return false;
		}
		return this.ref.equals(that.ref);
	}

	@Override
	public String toString() {
		return ref;
	}
}