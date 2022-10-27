
package com.example.demo.service;
import com.example.demo.entity.Anuel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface IAnuelService {
    public List<Anuel> getAnuel();
    public void saveAnuel(Anuel anuel);
    public Anuel getAnuelById(long id);
    public void delete(long id);
}
