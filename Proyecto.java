/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author falbo
 */
public class Proyecto {
    private String nombre;
    private List<Empleado> empleadosAsignados;
    
     public Proyecto(String nombre) {
        this.nombre = nombre;
        this.empleadosAsignados = new ArrayList<>();
    }
     
      public void agregarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }
    
    
}
