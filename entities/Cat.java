package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Omnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Terrestrial;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Carnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Herbivorus;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	if (this instanceof Terrestrial) {
		System.out.println("Your Cat named " + this.getName() + " just move walking" );		
	}
	
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
if (this instanceof Omnivorus ) {
	System.out.println("Your Cat named " + this.getName() + " can eat herbe and viande" );

	} else if ( this instanceof Herbivorus) {
		if ( eatable instanceof Vegetable) { 
			System.out.println("Your Cat named " + this.getName() + " just eat herbe" );
		} else if (  eatable instanceof Animal) {		
			System.out.println("Your Cat named " + this.getName() + " cannot eat meat" );		
		}
		
	} else if ( this instanceof Carnivorus) {
		if ( eatable instanceof Vegetable) { 
			System.out.println("Your Cat named " + this.getName() + " cannot eat herbe" );
		} else if (  eatable instanceof Animal) {		
			System.out.println("Your Cat named " + this.getName() + " can eat meat" );		
		}
		}
	
}
}
