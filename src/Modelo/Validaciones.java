package Modelo;

import Vista.InOut;


public class Validaciones {
    InOut o = new InOut();
    public int Esentero(String r) {
        int m;
        String n;

        do{
        n = o.cadena(r);   
        if (isNumeric(n)==false || Integer.parseInt(n)<0 || Integer.parseInt(n)>39){
            o.mostrar(n + " no es un numero o esta fuera del rango de bases establecido");
        }
            
        
        }while(isNumeric(n)==false || Integer.parseInt(n)<0 || Integer.parseInt(n)>39);
        
        m = Integer.parseInt(n);
                
       return m; 
    } 
        
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }    
    
    public String Escadena(String s) {
        InOut ob = new InOut();
        String m;
        do{
            
            m = ob.cadena(s);
            if(!m.matches("^[A-Za-z ]*$")){
                ob.mostrar("ah ingresado un dato distinto al pedido");
                m = "";
            }
            
        }while(m.equals(""));
       return m; 
    }               
        
}