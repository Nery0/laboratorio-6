/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

/**
 *
 * @author falbo
 */
public class GerenteProyecto extends Empleado {
    
    public GerenteProyecto(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }
    
    public void gestionarProyecto() {
        System.out.println(getNombre() + " está gestionando un proyecto.");
    }
    
      private String getNombre() {
        return nombre;
    }
    
}
