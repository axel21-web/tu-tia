package com.mycompany.prueba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.prueba.panel1;
/**
 *
 * @author Axel Moreno
 */
public class calculadora implements ActionListener
{
    private panel1 panel1;

    public calculadora(panel1 panel1) {
        this.panel1 = panel1;
        initComponent();
    }
     private void initComponent() {
        panel1.getCalc().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Calcular")) {
            double n1, n2;
            n1 = Double.parseDouble(panel1.getText1().getText());
            n2 = Double.parseDouble(panel1.getText2().getText());

            panel1.getTextresult().setText(String.valueOf(suma(n1, n2)));
        }
    }

    private double suma(double a, double b) {
        return a + b;
    }
}
