/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

/**
 *
 * @author falbo
 */
class Desarrollador extends Empleado {
      public Desarrollador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }
       public void escribirCodigo() {
        System.out.println(getNombre() + " está escribiendo codigo.");
    }

    private String getNombre() {
        return nombre;
    }
    
}
