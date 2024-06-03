import Annotazioni.DeprecatedCustom;
import Annotazioni.Info;

@Info(author = "Flavio", version = "2.0")
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @DeprecatedCustom(message = "il metodo è deprecato")
    public int getAge() {
        return age;
    }
    
  
    public String getName() {
        return name;
    }

    
    public String getInfo() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    
}
