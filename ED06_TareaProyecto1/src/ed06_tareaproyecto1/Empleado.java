/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto1;

/**
 *
 * @author alumno
 */
public class Empleado {
   private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    /**
     *constructor del empleado
     * @param dni. dnir del empleadoi
     * @param nombre
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }

    /**
     *
     * @return devuelve el dni empleado
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre envia el nombr
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     *
     * @param numHijos
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    /**
     *
     * @param base
     * @return
     */
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }  
}
