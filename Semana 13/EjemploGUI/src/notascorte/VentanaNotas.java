package notascorte;
import javax.swing.*;
import java.awt.*;
public class VentanaNotas extends JFrame{
    private JTextField notaTarea;
    private JTextField notaQuiz;
    private JTextField notaParcial;
    private JLabel notaCorte;
    private GestionNotas gn;
    
    public VentanaNotas(){
        gn = new GestionNotas(this);
    }
    
    public void inicializarGUI(){
        setTitle("Notas Corte Informática 2");
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        notaTarea   = new JTextField();
        notaQuiz    = new JTextField();
        notaParcial = new JTextField();
        notaCorte   = new JLabel();

        notaTarea.setColumns(3);
        notaQuiz.setColumns(3);
        notaParcial.setColumns(3);

        JButton calcular = new JButton("Calcular");
        JButton creditos = new JButton("Créditos");

        calcular.addActionListener(gn);
        creditos.addActionListener(gn);

        calcular.setActionCommand("calcular");
        creditos.setActionCommand("creditos");

        Container contenedor;
        contenedor = getContentPane();
        
        contenedor.setLayout(new FlowLayout());

        contenedor.add(new JLabel("Tarea:"));
        contenedor.add(notaTarea);
        contenedor.add(new JLabel("Quiz:"));
        contenedor.add(notaQuiz);
        contenedor.add(new JLabel("Parcial:"));
        contenedor.add(notaParcial);
        contenedor.add(new JLabel("Nota Corte:"));
        contenedor.add(notaCorte);
        contenedor.add(calcular);
        contenedor.add(creditos);

        pack();
        setVisible(true);
    }

    public double obtenerNTarea(){
        String tareaS;
        tareaS = notaTarea.getText();
        double tareaD;
        tareaD = Double.parseDouble(tareaS);
        return tareaD;
    }

    public double obtenerNQuiz(){
        String quizS;
        quizS = notaQuiz.getText();
        double quizD;
        quizD = Double.parseDouble(quizS);
        return quizD;
    }

    public double obtenerNParcial(){
        String parcialS;
        parcialS = notaParcial.getText();
        double parcialD;
        parcialD = Double.parseDouble(parcialS);
        return parcialD;
    }

    public void asignarNCorte(double nc){
        notaCorte.setText(nc+"");
        pack();
    }

    public void mostrarCreditos(){
        JOptionPane.showMessageDialog(this,
                "Desarrollado por:\n"+
                "Universidad Autónoma de Occidente\n"+
                "Facultad de Ingeniería\n"+
                "Informática 2");
    }
}
