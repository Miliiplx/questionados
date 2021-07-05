package ar.com.ada.api.questionados.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pregunta_id")
    private Integer preguntaId;

    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Respuesta> opciones = new ArrayList<>();

    public void agregarRespuesta(Respuesta respuesta){
        this.opciones.add(respuesta); //creo este metodo para hacer la relacion
        //bidereccional en Respuesta
    }

    public Integer getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(Integer preguntaId) {
        this.preguntaId = preguntaId;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.categoria.agregarPregunta(this);
    }

    public List<Respuesta> getRespuestas() {
        return opciones;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.opciones = respuestas;
    }

    


    
}
