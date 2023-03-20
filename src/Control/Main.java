package Control;

import Modelo.Procesos;
import Modelo.Validaciones;
import Vista.InOut;
//terminado :3 3.0
public class Main {
    public static void main(String[] args){
        InOut o1 = new InOut();
        Procesos o2 = new Procesos();
        Validaciones o3 = new Validaciones();
        String NumeroBaseInicial,resultado, resultadoi; 
        
        int baseI, baseF;
        baseI = o3.Esentero("Ingrese la base Inicial");
        NumeroBaseInicial = o2.BaseI(baseI); 
        baseF = o3.Esentero("Ingrese la base Final");
        if(baseI==10 && baseF<10){
            resultado = o2.reverse(o2.Metodo1(NumeroBaseInicial,baseF));
            System.out.println(resultado);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);
        }else if(baseI<10 && baseF==10){
            resultadoi = o2.Metodo2(NumeroBaseInicial, baseI);
            System.out.println(resultadoi);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultadoi);
        }else if(baseI<10 && baseF<10){
            resultadoi = o2.Metodo2(NumeroBaseInicial, baseI);
            System.out.println(resultadoi);
            resultado = o2.reverse(o2.Metodo1(resultadoi,baseF));
            System.out.println(resultado);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);
        }else if(baseI==10 && baseF>10){
            resultado = o2.reverse(o2.Metodo1if2(NumeroBaseInicial, baseF));
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);
            System.out.println(resultado);
        }else if(baseI>10 && baseF==10){
            resultadoi = o2.Metodo2if2(NumeroBaseInicial, baseI);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultadoi);
            System.out.println(resultadoi);
        }else if(baseI>10 && baseF >10){
            resultadoi= o2.Metodo2if2(NumeroBaseInicial, baseI);
            System.out.println(resultadoi);
            resultado = o2.reverse(o2.Metodo1if2(resultadoi, baseF));
            System.out.println(resultado);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);
        }else if(baseI<10 && baseF>10){

            resultadoi = o2.Metodo2(NumeroBaseInicial, baseI);  
            System.out.println(resultadoi);
            resultado = o2.reverse(o2.Metodo1if2(resultadoi, baseF));
            System.out.println(resultado);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);            
        
        }else if(baseI>10 && baseF<10){
            resultadoi = o2.Metodo2if2(NumeroBaseInicial, baseI);
            System.out.println(resultadoi);
            resultado = o2.reverse(o2.Metodo1(resultadoi,baseF));
            System.out.println(resultado);
            o1.mostrar("la conversion del numero '"+NumeroBaseInicial+"' en base "+baseI+" a la base "+baseF+" es "+resultado);
            
        }   
      
    }
}