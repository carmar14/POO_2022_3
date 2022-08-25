/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usacurso;

/**
 *
 * @author Acer
 */
public class UsaCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n_Est = IO.readInt("Digite la cantidad de estudiantes del curso");
        Curso curso_ = new Curso();
        //for(int i=0; i<n_Est; i++){
        curso_.gestionar();
        //}
    }
    
}
