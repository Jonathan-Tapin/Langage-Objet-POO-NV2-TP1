package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Omnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Terrestrial;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	
}
}
