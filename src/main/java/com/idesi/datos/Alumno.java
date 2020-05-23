package com.idesi.datos;

public class Alumno {
    public String nombre;
    public String codigo;
    public String docente;
    public String asignatura;
    public double adeudo;
    
    public Alumno(String nombre, String codigo, String docente, String asignatura, double adeudo){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.docente = docente;
        this.codigo = codigo;
        this.adeudo = adeudo;
        
    }
    
    public Alumno(){
        this.nombre = "";
        this.asignatura = "";
        this.docente = "";
        this.codigo = "";
        this.adeudo = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }
    
    
}
