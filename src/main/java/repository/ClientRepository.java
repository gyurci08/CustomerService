package repository;

import model.Client;

import java.util.List;

public interface ClientRepository <T extends Client>{

    List<T> listAll();
    T create(T client);
    T remove(T client);
    T save(T client);
    T update(T client);
    T findById(int id);

}
