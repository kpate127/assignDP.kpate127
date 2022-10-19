package System;

public class OfferingList extends ArrayList {

	public Offering offerings_Names[] = {new Offering("Beef","Meat"), new Offering("Fish","Meat"),
			new Offering("Ginger","Produce"), new Offering("Tomato","Produce"), };

	public ListIterator fetchListIterator()
	{
		return new OfferingIterator();
	}

	public class OfferingIterator implements ListIterator {

		int pos;

		public boolean hasNext() {

			if (pos < offerings_Names.length) {
				return true;
			}
			return false;
		}

		public Offering next() {

			if (this.hasNext()) {
				return offerings_Names[pos++];
			}
			return null;
		}

		public void MoveToHead() {

		}

		public void Remove() {

		}

//	private Trading trading;
//
//	private Offering[] Offering;
//
//	private OfferingIterator OfferingIterator;
	}
}
