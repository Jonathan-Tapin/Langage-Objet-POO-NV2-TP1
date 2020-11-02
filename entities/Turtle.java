package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Omnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Tetrapoda;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
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
