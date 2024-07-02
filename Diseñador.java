/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

/**
 *
 * @author falbo
 */
public class Diseñador extends Empleado {
    
    public Diseñador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }
    
     public void diseñarInterfaz() {
        System.out.println(getNombre() + " esta diseñando una interfaz.");
    }
    
      private String getNombre() {
        return nombre;
    }
}
