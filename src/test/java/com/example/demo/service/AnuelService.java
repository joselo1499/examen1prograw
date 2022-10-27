
package com.example.demo.service;
import com.example.demo.entity.Anuel;
import java.util.List;
import java.util.Optional;
import com.example.demo.service.IAnuelService;
import com.example.demo.repository.AnuelRepository;
import com.example.demo.service.IAnuelService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AnuelService implements IAnuelService{
       
    @Autowired
    private AnuelRepository anuelRepository;
    
    @Override
    public List<Anuel> getAllAnuel() {
            return (List<Anuel>)anuelRepository.findAll();
    }

    @Override
    public void saveConcierto(Anuel anuel) {
        AnuelRepository.save(anuel);
    }

    @Override
    public Anuel getAnuelById(long id) {
        return AnuelRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        anuelRepository.deleteById(id);
    }
}
