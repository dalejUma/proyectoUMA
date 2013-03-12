/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author Daniel Alejandro Castro García
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
        System.out.println("modificado por alum 1"); // insertado por alum1
    }
    
    public void metodoAlumno2(){
        System.out.println("modificado alumno2 angel jimenez");
    }
    
    public void metodoComunitario(){
        //Línea nueva de comentario
        System.out.println("Aqui escribimos todos");
        // modificacaciones alumno 1
        System.out.println("Alumno 1 inserta esta sentencia");
	// modificaciones alumno 2
        System.out.println("Alumno 2 inserta esta otra sentencia");
    }
    
    public void testGitAux(){
        //Método branch testing
        System.out.println("Método testing");
    }
}
