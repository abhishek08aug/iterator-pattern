package in.blogspot.randomcompiler.iterator.pattern.demo;

import in.blogspot.randomcompiler.iterator.pattern.api.Iterator;
import in.blogspot.randomcompiler.iterator.pattern.impl.Collage;
import in.blogspot.randomcompiler.iterator.pattern.impl.Picture;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		Collage collage = new Collage();
		try {
			collage.add(new Picture("Hills"));
			collage.add(new Picture("Beach"));
			collage.add(new Picture("Trees"));
			collage.add(new Picture("Crowd"));
			collage.add(new Picture("Rides"));
			collage.add(new Picture("Cottages"));
			collage.add(new Picture("Boats"));
			collage.add(new Picture("Life-jackets"));
			collage.add(new Picture("Goggles"));
			collage.add(new Picture("Dolphins"));
			collage.add(new Picture("Sand"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Iterator iterator = collage.iterator();
		
		while(iterator.hasNext()) {
			Picture picture = (Picture)iterator.next();
			System.out.println(picture.getName());
		}
	}

}
