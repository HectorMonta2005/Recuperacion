/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.espoch.edu.recuperacion;

import ec.espoch.edu.recuperacion.Clases.Horario;
import ec.espoch.edu.recuperacion.Clases.Persona;

/**
 *
 * @author KARLA
 */
public class Recuperacion {

    public static void main(String[] args) {
         // Instanciar una clase
        /*Persona objPersona = new Persona();
        objPersona.setNombre("Andrea");
        objPersona.setApellido("Montaño");
        objPersona.setNacionalidad("Ecuatoriana");
        objPersona.setFechaNacimiento(07);
        objPersona.imprimir();
        String result = objPersona.calcularEdad(0);
        
        System.out.println("Resultado:"+result);
        System.out.println("Resultado:"+objPersona.calcularEdad(0));
        System.out.println("Datos"+objPersona.imprimirDatos());*/
            
            Horario objHorario = new Horario();
            objHorario.setDiaTrabajo("lunes");
            Persona objPersona = new Persona();
            objPersona.identificarDiaTrabaj0(objHorario);
            System.out.println("Result:" +objPersona.identificarDiaTrabaj0(objHorario));
                   
    }
}
