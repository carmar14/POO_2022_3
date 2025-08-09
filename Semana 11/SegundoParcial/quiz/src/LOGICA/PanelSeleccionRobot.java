package LOGICA;

import BASEDATOS.Usuario;
import LOGICA.ConexionRobotManager;

import javax.swing.*;
import java.awt.*;

public class PanelSeleccionRobot extends JPanel {
    private JLabel etiquetaTitulo;
    private JComboBox<String> comboRobots;
    private JButton botonContinuar;
    private Usuario usuario;

    public PanelSeleccionRobot(Usuario usuario) {
        this.usuario = usuario;
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 245));

        personalizarUIManager();
        inicializarComponentes();
        organizarComponentes();
    }

    private void inicializarComponentes() {
        etiquetaTitulo = new JLabel("Selecciona tu Robot");
        etiquetaTitulo.setFont(new Font("SansSerif", Font.BOLD, 22));
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setForeground(new Color(44, 62, 80));

        String[] opcionesRobots = {"Robot 1", "Robot 2", "Robot 3", "Robot 4"};
        comboRobots = new JComboBox<>(opcionesRobots);
        comboRobots.setFont(new Font("SansSerif", Font.PLAIN, 16));
        comboRobots.setForeground(new Color(44, 62, 80));
        comboRobots.setBackground(Color.WHITE);
        comboRobots.setPreferredSize(new Dimension(220, 40));
        comboRobots.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(189, 195, 199), 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        comboRobots.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setFont(new Font("SansSerif", Font.PLAIN, 16));
                label.setForeground(new Color(44, 62, 80));
                label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
                return label;
            }
        });

        botonContinuar = new JButton("Continuar");
        estilizarBotonPrincipal(botonContinuar);

        botonContinuar.addActionListener(e -> {
            String seleccionado = (String) comboRobots.getSelectedItem();

            boolean conectado = ConexionRobotManager.conectarARobot(seleccionado);

            if (conectado) {
                JOptionPane.showMessageDialog(this, "¡Conectado con " + seleccionado + "!");
                // marcoPadre.mostrarPantallaControl(...);
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se pudo establecer conexión con " + seleccionado,
                        "Error de conexión",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }

    private void organizarComponentes() {
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setOpaque(false);
        panelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        JLabel etiquetaUsuario = new JLabel("Usuario: " + usuario.getNombre());
        etiquetaUsuario.setFont(new Font("SansSerif", Font.PLAIN, 14));
        etiquetaUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
        etiquetaUsuario.setForeground(new Color(127, 140, 141));
        panelSuperior.add(etiquetaUsuario, BorderLayout.EAST);
        panelSuperior.add(etiquetaTitulo, BorderLayout.SOUTH);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel centro = new JPanel(new GridBagLayout());
        centro.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        centro.add(comboRobots, gbc);
        add(centro, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(230, 230, 230));
        panelInferior.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelInferior.add(botonContinuar);
        add(panelInferior, BorderLayout.SOUTH);
    }

    private void estilizarBotonPrincipal(JButton boton) {
        boton.setFocusPainted(false);
        boton.setFont(new Font("SansSerif", Font.BOLD, 16));
        boton.setBackground(new Color(39, 174, 96));
        boton.setForeground(Color.WHITE);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
    }

    private void personalizarUIManager() {
        UIManager.put("ComboBox.background", Color.WHITE);
        UIManager.put("ComboBox.selectionBackground", new Color(52, 152, 219));
        UIManager.put("ComboBox.selectionForeground", Color.WHITE);
        UIManager.put("ComboBox.font", new Font("SansSerif", Font.PLAIN, 16));
    }
}
