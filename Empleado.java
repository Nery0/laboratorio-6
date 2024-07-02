/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

/**
 *
 * @author falbo
 */
public class Empleado {
    private int id;
    String nombre;
    private double salario;
    
     public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
     public void realizarTrabajo() {
        System.out.println(nombre + " está trabajando.");
    }
    
    
}
