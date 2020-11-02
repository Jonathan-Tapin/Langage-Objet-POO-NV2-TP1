package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Herbivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Omnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Terrestrial;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Carnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

  public Caribou() {
    super();
  }

  public Caribou(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	if (this instanceof Terrestrial) {
		System.out.println("Your caribou named " + this.getName() + " just move walking" );		
	}
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	
	if (this instanceof Omnivorus ) {
		System.out.println("Your caribou named " + this.getName() + " just eat herbe" );
		System.out.println("Your caribou named " + this.getName() + " can eat meat" );
		
	} else if ( this instanceof Herbivorus) {
		if ( eatable instanceof Vegetable) { 
			System.out.println("Your caribou named " + this.getName() + " just eat herbe" );
		} else if (  eatable instanceof Animal) {		
			System.out.println("Your caribou named " + this.getName() + " cannot eat meat" );		
		}
		
	} else if ( this instanceof Carnivorus) {
		if ( eatable instanceof Vegetable) { 
			System.out.println("Your caribou named " + this.getName() + " cannot eat herbe" );
		} else if (  eatable instanceof Animal) {		
			System.out.println("Your caribou named " + this.getName() + " can eat meat" );		
		}
		}
	}
}
