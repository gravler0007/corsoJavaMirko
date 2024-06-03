import Annotazioni.Info;

import java.lang.reflect.Method;

import Annotazioni.DeprecatedCustom;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mirko", 72);

        if (Person.class.isAnnotationPresent(Info.class)) {
            Info info = Person.class.getAnnotation(Info.class);
            System.out.println("Autore: " + info.author() + ", Versione: " + info.version());
        }

        Method[] metodi = Person.class.getDeclaredMethods();
        for (Method metodo : metodi) {
            if (metodo.isAnnotationPresent(DeprecatedCustom.class)) {
                DeprecatedCustom deprecatedCustom = metodo.getAnnotation(DeprecatedCustom.class);
                System.out.println(deprecatedCustom.message());
            }
        }

    }
}
