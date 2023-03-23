package PlayBoxing;

import java.util.Random;

public class PlayBoxing {

	public static void main(String[] args) {
	   	
		 Random rd= new Random();
		 int i=rd.nextInt(2);
		 if(i==0)
		 {
			  Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
		      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
		      Ring r = new Ring(marc,alex , 90 , 100);
		      r.run();
		 }
		 else if(i==1)
		 {
			 Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
			 Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
			 Ring r = new Ring(alex,marc , 90 , 100);
		      r.run();
		 }
	}

}
