package main.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Ingredient implements serializable {
    private String name;

    private int volume;

    public Ingredient(){

    }
    // repositories aanmaken per groep
    class FileBasedIngredientRepository implements IngredientsRepository{
        public void save(Ingredient ingredient){
            List<Ingredient> ingredients = new ArrayList<>();
            ingredients.add(Ingredient);
            this.saveToFile(ingredients);
        }
        private saveToFile(ArrayList<Ingredient> ingredients){
            try{
                OutputStream outputStream = Files.newOutputStream(path.of("Persons.obj"));
                ObjectOutputStream objectStream = new ObjectOutputStream((outputStream));

                objectStream.writeObject(ingredients);

                List<Ingredient> ingredients = this.loadAllFromFile();
                if(ingredients.contains(ingredients)){
                    if(!Files.exists(Path.of)){

                    }
                }
                    ingredients.set(people.indexOf(Ingredient))
                }
                ObjectStream.close();
            }catch(IOException e){
                throw new RuntimeException("can not save people: " + e.getMessage());
            }


        }
        private List<Ingredient> loadAllFromFile(){
            try{
                InputStream inputStream = Files.newInputStream(Path.of("persons.obj"));
                ObjectInputStream objectInputStream = new ObjectInputStream((inputStream));


                Object object = objectInputStream.readObject();

                List<Ingredient> ingredients =
            }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException("can not load ingredients:" + e.getMessage());
        }
    }
}
