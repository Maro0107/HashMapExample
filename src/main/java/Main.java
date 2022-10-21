import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Animal> map = new HashMap();
        String names[] = {"Kot", "Pies","Koza","Puma"};

        for (int i=0; i<names.length; i++){

            map.put(names[i], new Animal(names[i]) );
            System.out.println(names[i]);
        }

        System.out.println(map.get("Pies"));
        System.out.println("///////////////////////////////////");

        for (Map.Entry<String, Animal> entry: map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
