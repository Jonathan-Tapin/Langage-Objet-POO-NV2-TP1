package fr.mds.langageobjet.niv2.polymorphisme.entities;

import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;

public abstract class Animal implements Eatable {

  private long id;
  private String name;
  private float weight;
  private float height;

  public Animal() {

  }

  public Animal(Long id, String name, Float weight, Float height) {
    super();
    this.id = id;
    this.name = name;
    this.weight = weight;
    this.height = height;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public abstract void move();

  public abstract void eat(Eatable eatable);
}
