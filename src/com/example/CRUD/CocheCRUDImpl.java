package com.example.CRUD;
import com.example.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    List<Coche> listaCoches = new ArrayList<>();

    @Override
    public void save(Coche cocheNuevo) {
        listaCoches.add(cocheNuevo);
    }

    @Override
    public List<Coche> findAll() {
        return listaCoches;
    }

    @Override
    public void delete(Coche cocheNuevo) {
        listaCoches.remove(cocheNuevo);
    }
}
