/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidorTemperatura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class GestionConvertidor implements ActionListener {
    private VentanaConvertidor vc;
    
    public GestionConvertidor(VentanaConvertidor venc){
        //vc = new VentanaConvertidor();
        vc = venc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("convertir")){
            convertir();            
        }
    }
    
    public void convertir(){
        double temperaturaF;
        double temperaturaC;       
        
        //ES.mostrar("hola");
        JTextField tempc= vc.getGradosCelcius();
        temperaturaC = Double.parseDouble(tempc.getText());        
        //ES.mostrar("La temperatura en Celcius es: "+ temperaturaC);
        temperaturaF = temperaturaC*1.8+32;
        //ES.mostrar("La temperatura en F es: "+ temperaturaF);
        JLabel tempF = new JLabel();
        tempF.setText(temperaturaF+ "° Fahrenheit");        
        //vc.setFahrenheit(tempF);
        vc.asignarTemperatura(Math.round(temperaturaF * 100.0)/100.0);
        
    }
    
}
