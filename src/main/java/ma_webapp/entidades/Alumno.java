/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma_webapp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author miltonahdz
 */

@Entity
@Table(name = "alumno")
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_id_seq")
    @SequenceGenerator(name = "alumno_id_seq", sequenceName = "alumno_id_seq", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "carnet")
    private String carnet;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(id, alumno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "alumnos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", carnet='" + carnet + '\'' +
                '}';
    }

    public Alumno(int id, String nombre, String carnet) {
        this.id = id;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public Alumno() {
    }

    public Alumno(int id) {
        this.id = id;
    }

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
}
