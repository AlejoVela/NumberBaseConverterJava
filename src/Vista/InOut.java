package Vista;

import javax.swing.JOptionPane;


public class InOut {
    public String cadena(String m){
        return JOptionPane.showInputDialog(m);
    }
    
    public int cadena(int m){       
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    public int cadenaInt(String m){       
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }    
    
    public void mostrar(String m){
           JOptionPane.showMessageDialog(null,m);
        
    }
}