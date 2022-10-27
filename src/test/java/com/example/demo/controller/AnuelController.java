
package com.example.demo.controller;
import com.example.demo.ExamenProgra.entity.Anuel;
import com.example.demo.ExamenProgra.service.IAnuelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnuelController {
    @Autowired
    
    private IAnuelService conciertoService;
    
    @GetMapping("/conciertos")
    public String index(Model model){
    List<Anuel> listaConciertos=conciertoService.getAllConcierto();
    model.addAttribute("titulo","Conciertos");
    model.addAttribute("conciertos", listaConciertos);
    return "conciertos";
    }
    
    @GetMapping("/anuelesN")
    public String crearConcierto(Model model){
    model.addAttribute("Anuel",new Anuel());
    //conciertoService.saveAnuel(Anuel);
    return "crear";
    }
    
    @PostMapping("/save")
    public String guardarAnuel(Anuel concierto){
    conciertoService.saveAnuel(Anuel);
    return "redirect:/Anuel";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarAnuel(@PathVariable("id") Long idAnuel){
    conciertoService.delete(idAnuel);
    return "redirect:/Anuel";
    }
}
