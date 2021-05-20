/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenentornos;

/**
 *
 * @author nachovelagomez
 */
public class Restaurante {
    String nom_restaurante;
    String descripcion; 
    String tipo; 
    String dirección; 
    int horario; 

    public Restaurante(String nom_restaurante, String descripcion, String tipo, String dirección, int horario) {
        this.nom_restaurante = nom_restaurante;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.dirección = dirección;
        this.horario = horario;
    }

    public String getNom_restaurante() {
        return nom_restaurante;
    }

    public void setNom_restaurante(String nom_restaurante) {
        this.nom_restaurante = nom_restaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    
    
}
