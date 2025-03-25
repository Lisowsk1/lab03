package dsaa.lab03;

import java.util.Iterator;
import java.util.ListIterator;


public class TwoWayUnorderedListWithHeadAndTail<E> implements IList<E>{
	
	private class Element{
		public Element(E e) {
			// TODO
		}
		public Element(E e, Element next, Element prev) {
			//TODO
		}
		E object;
		Element next=null;
		Element prev=null;
	}
	
	Element head;
	Element tail;
	// can be realization with the field size or without
	int size;
	
	private class InnerIterator implements Iterator<E>{
		Element pos;
		// TODO maybe more fields....
		
		public InnerIterator() {
		//TODO
		}
		@Override
		public boolean hasNext() {
			//TODO
			return false;
		}
		
		@Override
		public E next() {
			//TODO
			return null;
		}
	}
	
	private class InnerListIterator implements ListIterator<E>{
		Element p;
		// TODO maybe more fields....

		@Override
		public void add(E e) {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int previousIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public void set(E e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public TwoWayUnorderedListWithHeadAndTail() {
		// make a head and a tail	
		head=null;
		tail=null;
	}
	
	@Override
	public boolean add(E e) {
		//TODO
		
		return true;
	}

	@Override
	public void add(int index, E element) {
		//TODO
	}

	@Override
	public void clear() {
		//TODO
	}

	@Override
	public boolean contains(E element) {
		//TODO
		return false;
	}

	@Override
	public E get(int index) {
		//TODO
		return null;
	}

	@Override
	public E set(int index, E element) {
		//TODO
		return null;
	}

	@Override
	public int indexOf(E element) {
		//TODO
		return -1;
	}

	@Override
	public boolean isEmpty() {
		//TODO

		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new InnerIterator();
	}

	@Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public E remove(int index) {
		//TODO
		return null;
	}

	@Override
	public boolean remove(E e) {
		//TODO
		return true;
	}

	@Override
	public int size() {
		//TODO
		return -1;
	}
	public String toStringReverse() {
		ListIterator<E> iter=new InnerListIterator();
		while(iter.hasNext())
			iter.next();
		String retStr="";
		//TODO use reverse direction of the iterator 
		return retStr;
	}

	public void add(TwoWayUnorderedListWithHeadAndTail<E> other) {
		//TODO
	}
}

