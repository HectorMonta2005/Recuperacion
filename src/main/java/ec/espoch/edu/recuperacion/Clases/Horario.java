/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.recuperacion.Clases;

/**
 *
 * @author KARLA
 */
public class Horario {
    
    private int numeroHorasTrabajo;
    private String diaTrabajo;
    
    
    
    public Horario(){
        
    }
    
    public int getNumeroHorasTrabajo(){
        return numeroHorasTrabajo;
        
    }
    
    public void setNuemroHorasTrabajo (int numeroHorasTrabajo){
        this.numeroHorasTrabajo= numeroHorasTrabajo;
    }

    public String getDiaTrabajo() {
        return diaTrabajo;
    }

    public void setDiaTrabajo(String diaTrabajo) {
        this.diaTrabajo = diaTrabajo;
    }
    
    

    
}
