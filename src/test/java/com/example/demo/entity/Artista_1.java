
package com.example.demo.entity;
import java.io.Serializable;
import javax.lang.model.SourceVersion;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="conciertos")
public class Artista implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String costo;
    private String fecha;
    private String cant;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name="artistas_id")
    private Anuel artista;

    public Artista(String costo, String fecha, String cant, String lugar) {
        this.costo = costo;
        this.fecha = fecha;
        this.cant = cant;
        this.lugar = lugar;
    }

    public Anuel() {
    }
    
    
    public int getId() {
        return id;
    }

    public String getCosto() {
        return costo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCant() {
        return cant;
    }

    public String getLugar() {
        return lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    
    
}
