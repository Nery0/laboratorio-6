/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

/**
 *
 * @author falbo
 */
public class Main {
    public static void main(String[] args) {
  
        Desarrollador desarrollador1 = new Desarrollador(1, "Juan", 50000);
        Diseñador diseñador1 = new Diseñador(2, "María", 45000);
        GerenteProyecto gerente1 = new GerenteProyecto(3, "Carlos", 60000);

   
        Proyecto proyecto1 = new Proyecto("Sistema de gestión de inventario");

      
        proyecto1.agregarEmpleado(desarrollador1);
        proyecto1.agregarEmpleado(diseñador1);
        proyecto1.agregarEmpleado(gerente1);

   
        desarrollador1.escribirCodigo();
        diseñador1.diseñarInterfaz();
        gerente1.gestionarProyecto();
    }
}
