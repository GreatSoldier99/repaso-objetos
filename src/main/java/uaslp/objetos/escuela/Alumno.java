package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno{
    private String nombre;
    private String clave;
    private String claveCarrera;
    private int anioIngreso;
    private LocalDate fechaDeNacimiento;

    public static Alumno builder(){
        return new Alumno();
    }

    public Alumno nombre(String name){
        nombre = name;
        return this;
    }

    public String getNombre(){
        return nombre;
    }

    public Alumno clave(String clave){
        this.clave = clave;
        return this;
    }

    public String getClave(){
        return clave;
    }

    public Alumno claveDeCarrera(String claveCarrera){
        this.claveCarrera = claveCarrera;
        return this;
    }

    public String getClaveDeCarrera(){
        return claveCarrera;
    }

    public Alumno anioDeIngreso(int anioIngreso){
        this.anioIngreso = anioIngreso;
        return this;
    }

    public int getAnioDeIngreso(){
        return anioIngreso;
    }

    public Alumno fechaNacimiento(LocalDate fechaNacimiento){
        fechaDeNacimiento = fechaNacimiento;
        return this;
    }

    public LocalDate getFechaNacimiento(){
        return fechaDeNacimiento;
    }

    public Alumno build(){
        return this;
    }



}
