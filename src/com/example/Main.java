package com.example;
import com.example.CRUD.CocheCRUDImpl;
import com.example.CRUD.CocheCRUD;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl(); //Crea un objeto de tipo CocheCRUD
        //Se guardan 2 nuevos coches
        cocheCrud.save(new Coche("Toyota","Sprinter TRUENO AE86","Blanco",3, false));
        cocheCrud.save(new Coche("Ford","Escort","Negro",3, false));
        //Se genera e imprime la lista
        List<Coche> coches = cocheCrud.findAll();
        System.out.println(coches);
        //Se eliminan de la lista y se imprime nuevamente
        cocheCrud.delete(coches.get(0));
        System.out.println(coches);
        cocheCrud.delete(coches.get(0));
        System.out.println(coches);
    }
}
