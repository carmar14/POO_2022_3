package guiFvectores;
import java.awt.event.*;
public class GestionVector implements ActionListener{
    private FormularioVectores fv;

    public GestionVector(FormularioVectores form_vect){
        fv = form_vect;
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("sumar")){
            sumarVectores();
        }
        if(ae.getActionCommand().equals("multiplicar")){
            multiplicarVectores();
        }
    }

    private void sumarVectores(){
        double[] vector1 = fv.obtenerVector1();
        double[] vector2 = fv.obtenerVector2();
        double[] vector3 = new double[vector1.length];

        for(int i=0;i<vector1.length;i++){
            vector3[i] = vector1[i]+vector2[i];
        }
        fv.asignarVectorSuma(vector3);
    }

    private void multiplicarVectores(){
        double[] vector1 = fv.obtenerVector1();
        double[] vector2 = fv.obtenerVector2();
        double producto = 0;

        for(int i=0;i<vector1.length;i++){
            producto = producto + vector1[i]*vector2[i];
        }
        
        fv.asignarProducto(producto);
    }
}
