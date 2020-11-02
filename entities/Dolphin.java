package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Aquatic;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Carnivorus;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
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
