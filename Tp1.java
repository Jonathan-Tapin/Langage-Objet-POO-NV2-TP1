package fr.mds.langageobjet.niv2.polymorphisme;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.mds.langageobjet.niv2.polymorphisme.entities.Animal;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Caribou;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Cat;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Deer;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Dog;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Dolphin;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Hyena;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Turtle;
import fr.mds.langageobjet.niv2.polymorphisme.entities.Vegetable;
import fr.mds.langageobjet.niv2.polymorphisme.functionnalities.Eatable;
import fr.mds.langageobjet.niv2.polymorphisme.utils.StringUtils;

/**
 *
 * @author tactfactory
 *
 * - Créer un programme qui permet de faire se déplacer et manger des animaux
 * - Sans modifier le point d'entré de l'application et sans rajouter de classe permettre l'affichage dans la console
 *     des actions réalisées par les animaux (un fichier d'exemple de sortie appelé outputExample.txt est disponible
 *     à la racine du dossier)
 * - Les animaux aquatique se déplacerons en nageant
 * - Les animaux terrestre se déplacerons en marchant
 * - Les animaux tétrapode se déplacerons à la fois en nageant et en marchant
 * - Les animaux carnivore mangerons d'autre animaux
 * - Les animaux herbivore mangerons des végétaux
 * - Les animaux omnivore mangerons à la fois d'autre animaux et des végétaux
 */
public class Tp1 {

  public static void main(String[] args) throws InstantiationException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

    List<Class<?>> types = new ArrayList<Class<?>>();
    types.add(Caribou.class);
    types.add(Cat.class);
    types.add(Deer.class);
    types.add(Dog.class);
    types.add(Dolphin.class);
    types.add(Hyena.class);
    types.add(Turtle.class);

    List<Animal> animals = new ArrayList<Animal>();

    long id = 0;
    for (Class<?> klazz : types) {
      Random rand = new Random();
      int loop = rand.nextInt(10);
      for (int i = 0; i < loop; i++) {
        id++;
        animals.add((Animal) klazz.getConstructor(Long.class, String.class, Float.class, Float.class).newInstance(id,
            StringUtils.randomString(2, 20), rand.nextFloat(), rand.nextFloat()));
      }
    }

    Vegetable myVegetable = new Vegetable(1L, "herbe");
    Animal myAnimal = new Animal() {

      @Override
      public void move() {
      }

      @Override
      public void eat(Eatable eatable) {
      }

      {
        setName("viande");
      }
    };

    for (Animal animal : animals) {
      animal.move();
      animal.eat(myVegetable);
      animal.eat(myAnimal);
    }
  }

}
