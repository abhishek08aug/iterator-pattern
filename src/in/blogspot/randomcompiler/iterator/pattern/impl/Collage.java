package in.blogspot.randomcompiler.iterator.pattern.impl;

import in.blogspot.randomcompiler.iterator.pattern.api.Collection;
import in.blogspot.randomcompiler.iterator.pattern.api.Iterator;

public class Collage implements Collection {
	
	private Picture [] pictures;
	private final int MAX_PICTURES_IN_COLLAGE = 10;
	private int pictureCount;
	
	public Collage() {
		this.pictures = new Picture[MAX_PICTURES_IN_COLLAGE];
		this.pictureCount = 0;
	}

	@Override
	public Iterator iterator() {
		return new PictureIterator();
	}

	@Override
	public void add(Object obj) throws Exception {
		if(pictureCount < MAX_PICTURES_IN_COLLAGE)
			pictures[pictureCount++] = (Picture)obj;
		else
			throw new Exception("Collage can't have any more pictures");
	}
	
	private class PictureIterator implements Iterator {
		
		private int index;
		
		PictureIterator() {
			index = 0;
		}

		@Override
		public boolean hasNext() {
			if(index < pictures.length) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(hasNext()) {
				return pictures[index++];
			}
			return null;
		}
		
	}
	

}
