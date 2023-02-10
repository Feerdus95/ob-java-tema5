package com.example.CRUD;

import com.example.Coche;
import java.util.List;

public interface CocheCRUD {
    public void save(Coche cocheNuevo);
    List<Coche> findAll();
    public void delete(Coche cocheNuevo);
}
