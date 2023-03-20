package Modelo;

import Vista.InOut;
import static java.lang.Math.pow;
import java.math.BigInteger;

//System.out.println(v[i]);
public class Procesos {
    InOut o1 = new InOut();
    long[] NumeroInicialEntero2;
    int TamañoVectorString;
    long[] NumeroInicialEntero;
    String[] DigitosString2,VectorString;
    String Matriz1[][],Matriz2[][];
    
    public String BaseI(int BaseInicial){
    String NumeroInicial="",op;
    boolean Validador,VerMatriz;
    
    if(BaseInicial<=10){           

     do{
            Validador=true;
            NumeroInicial = o1.cadena("Ingrese el numero en base "+BaseInicial);
            Cifras(NumeroInicial); 
            NumeroInicialEntero2 = NumeroInicialEntero;
            for (int i = 0; i < NumeroInicialEntero2.length; i++) {
                if(NumeroInicialEntero2[i]>=BaseInicial){
                    Validador=false;
                    i=NumeroInicialEntero2.length;
                    o1.mostrar("Ha ingresado un numero invalido para la base ingresada");
                }
            }
            
        }while(Validador==false);

            do{
                Validador=false;
            op = o1.cadena("Desea ver la matriz con la cifraz que se detecten del numero?(si/no)"
                    + "\nNotá: Si ha escogido verla asegurese de que hasta base 10 las cifras sean"
                    + "\n6 como maximo, ya que esto supera el tamaño máximo y la capacidad de calculo"
                    + "\nde cualquier matríz.");
            if(op.equalsIgnoreCase("si")){
                VerMatriz=true;
                Validador=true;
            }else if(op.equalsIgnoreCase("no")){
                VerMatriz=false;
                Validador=true;
            }else{
                o1.cadena("Ha ingresado una opcion que no esta en a lista");
                Validador=false;                
              }
            }while(Validador==false);
        
        if(VerMatriz=true){    
            Matriz1(BaseInicial,NumeroInicial);
        }
        
    }else if(BaseInicial>10){


            Validador=false;
            do{
            op = o1.cadena("Desea ver la matriz con la cifraz que se detecten del numero?(si/no)"
                    + "\nNotá: Si ha escogido verla asegurese de que hasta base 39 las cifras sean"
                    + "\n4 como maximo, ya que esto supera el tamaño máximo y la capacidad de calculo"
                    + "\n de cualquier matríz.");
            if(op.equalsIgnoreCase("si")){
                VerMatriz=true;
                Validador=true;
            }else if(op.equalsIgnoreCase("no")){
                VerMatriz=false;
                Validador=true;
            }else{
                o1.cadena("Ha ingresado una opcion que no esta en a lista");
                Validador=false;                
              }
            }while(Validador==false);
            
            
            NumeroInicial = o1.cadena("Ingrese el numero en base "+BaseInicial);
            
            Cifrastring(NumeroInicial); 
            
            VectorString = DigitosString2;
            if(VerMatriz=true){
                Matriz2(BaseInicial,NumeroInicial);
            }
            
            omega();
     
    }



        return NumeroInicial;
}

    public void Matriz1(int baseInicial,String NumeroInicial){
        int Cifras=DigitosString2.length;
        BigInteger cont= new BigInteger("0");
        BigInteger cont2= new BigInteger("1");
        String Resultado;
        int Filas=(int) Math.pow(baseInicial, (Cifras-1));
        
        //System.out.println(Cifras);
        //16 inicial
                 
            this.Matriz2 = new String[baseInicial][Filas];
            for (int i = 0; i < baseInicial ; i++) {
                for (int j = 0; j < Filas; j++) {
                    
                    Resultado = reverse(Metodo1(BigIntegerS(cont), baseInicial));
                    Matriz2[i][j]=Resultado;
                    System.out.print(Matriz2[i][j]+" ");
                    cont=cont.add(cont2);
                }
              System.out.println();
            }            
                        

    }

    public void Matriz2(int baseInicial,String NumeroInicial){
        int Cifras=DigitosString2.length;
        BigInteger cont= new BigInteger("0");
        BigInteger cont2= new BigInteger("1");
        String Resultado;
        int Filas=(int) Math.pow(baseInicial, (Cifras-1));
        
        //System.out.println(Cifras);
        //16 inicial
                 
            this.Matriz2 = new String[baseInicial][Filas];
            for (int i = 0; i < baseInicial ; i++) {
                for (int j = 0; j < Filas; j++) {
                    
                    Resultado = reverse(Metodo1if2(BigIntegerS(cont), baseInicial));
                    Matriz2[i][j]=Resultado;
                    System.out.print(Matriz2[i][j]+" ");
                    cont=cont.add(cont2);
                }
              System.out.println();
            }            
                 
    }


    
    public void Cifras(String sc){
    
    String[] DigitosString = sc.split("");
    DigitosString2 =DigitosString;
    this.TamañoVectorString = DigitosString.length;
    NumeroInicialEntero = new long[this.TamañoVectorString];

    for (int i = 0; i < this.TamañoVectorString; i++) {
      NumeroInicialEntero[i] = Integer.valueOf(DigitosString[i]).intValue();       
        } 
    
    }
    
    public void Cifrastring(String sc){
    
    String[] CifrasStringNumeroInicial = sc.split("");
    DigitosString2 =CifrasStringNumeroInicial;
    
    }
    
    
    public String Metodo1(String m, int divisor){
        
        String cad="";
        BigInteger dividendo = new BigInteger(m),cociente,residuo;
        BigInteger divisorbig = new BigInteger(Integer.toString(divisor));
        //long cociente,dividendo=Long.parseLong(m),residuo;
        
        do{
            
            cociente = dividendo.divide(divisorbig);
            residuo = dividendo.subtract(divisorbig.multiply(cociente));
            dividendo=cociente;
            cad+= String.valueOf(residuo);
            
            
        }while(cociente.compareTo(divisorbig)==1 || cociente.compareTo(divisorbig)==0);
         cad+=cociente;
         
        //o1.mostrar("cociente: "+cociente+" residuo "+residuo+" cadena: "+cad+" invertida: "+cad1);
        //System.out.println(reverse(cad));
        return cad;
    }

    public String Metodo1if2(String m, int DivisorInt){
        String cad="";
        BigInteger nueve= new BigInteger("9");

        //long dividendo = Long.parseLong(m),cociente;
        BigInteger dividendo = new BigInteger(m), cociente;
        BigInteger DivisorBig= new BigInteger(Integer.toString(DivisorInt)),residuo;
        do{
            
            cociente = dividendo.divide(DivisorBig);
            residuo = (dividendo.subtract(DivisorBig.multiply(cociente)));
            dividendo=cociente;
            
            if(Integer.parseInt(residuo.toString())>9){
                
                cad+=cambio(Integer.parseInt(residuo.toString()));
            
            }else{
            
                cad+= Integer.toString(Integer.parseInt(residuo.toString()));
            
            }

        }while(cociente.compareTo(DivisorBig)==1 || cociente.compareTo(DivisorBig)==0);
        //Integer.parseInt(cociente.toString())>9

        if(cociente.compareTo(nueve)==1){
                
                cad+=cambio(BigInteger(cociente));
            
            }else{
            
                cad+=cociente.toString();
            
            }        
        
         
        //o1.mostrar("cociente: "+cociente+" residuo "+residuo+" cadena: "+cad+" invertida: "+cad1);
        return cad;
    }
    
    public String reverse(String palabra) {
     if (palabra.length() == 1)
       return palabra;
     else 
       return reverse(palabra.substring(1)) + palabra.charAt(0);
    }   
    
    public String Metodo2(String num,int basei){
        String cont="";
        int maximo = NumeroInicialEntero2.length;
        BigInteger contbig = new BigInteger("0");
        BigInteger expo= new BigInteger(String.valueOf(basei));
        String[] VectorNumeroInicialRevertido = num.split("");
        BigInteger[] VNumeroIRevertidoEntero = new BigInteger[VectorNumeroInicialRevertido.length];
        BigInteger[] Convertidor = new BigInteger[NumeroInicialEntero2.length];
        BigInteger[] InvertirVector= new BigInteger[NumeroInicialEntero2.length];
        
        for (int i = 0; i < NumeroInicialEntero2.length; i++) {
            Convertidor[i]= expo.pow(i);
        }    
        
        

        for (int i = 0; i < NumeroInicialEntero2.length; i++) {
            VNumeroIRevertidoEntero[i] = BigInteger(VectorNumeroInicialRevertido[i]);       
        }
    
        for (int i = 0; i<NumeroInicialEntero2.length; i++) {
            InvertirVector[maximo - 1] = Convertidor[i];
            //System.out.println(InvertirVector[maximo-1]);
            maximo--;
        }
        
        for (int i = 0; i < NumeroInicialEntero2.length; i++) {             
            InvertirVector[i]=InvertirVector[i].multiply(VNumeroIRevertidoEntero[i]);
        }

        for (int i = 0; i < NumeroInicialEntero2.length; i++) {            
            contbig=contbig.add(InvertirVector[i]);
            //System.out.println(contbig);
        }
        
        cont=BigIntegerS(contbig);
        //System.out.println("cont "+cont);
        return cont;
    }
    

    public String Metodo2if2(String num,int basei){
        String cont="";
        BigInteger contbig= new BigInteger("0");
        
        int maximo = VectorString.length;
        
        //String pal= reverse(num);
        //String[] r = pal.split("");
        BigInteger expo= new BigInteger(String.valueOf(basei));
        BigInteger[] VectorBig = new BigInteger[VectorString.length];
        BigInteger[] VectorNumeroIEntero = new BigInteger[VectorString.length];
        BigInteger[] Convertidor = new BigInteger[VectorString.length];
        BigInteger[] InvertirVector = new BigInteger[VectorString.length];
               
        //BigInteger(Integer.toString((int) pow(basei,i)))
        for (int i = 0; i < VectorString.length; i++) {
            Convertidor[i]= expo.pow(i);
            //System.out.println(Convertidor[i]);
        }    
        
       
 
        for (int i = 0; i<VectorString.length; i++) {
            InvertirVector[maximo - 1] = Convertidor[i];
            //System.out.println(InvertirVector[maximo-1]);
            maximo--;
        }        

        for (int i = 0; i < VectorString.length; i++) {
            VectorBig[i] = BigInteger(VectorString[i]);
            VectorNumeroIEntero[i] = VectorBig[i];
            //System.out.println(VectorNumeroIEntero[i]);
        }
    
        for (int i = 0; i < VectorString.length; i++) {             
            InvertirVector[i]=InvertirVector[i].multiply(VectorNumeroIEntero[i]);
            //System.out.println(InvertirVector[i]);
        }

        for (int i = 0; i < VectorString.length; i++) {            
            contbig=contbig.add(InvertirVector[i]);
        }
        //o1.mostrar("Numero en decimal: "+contbig+"\n");
        cont=BigIntegerS(contbig);
        return cont;
    }
      
    
    
    
    
    public void omega(){
        for (int i = 0; i < DigitosString2.length; i++) {
            if (DigitosString2[i].equalsIgnoreCase("a") || DigitosString2[i].equalsIgnoreCase("A")) {
                VectorString[i]="10";
            } else if (DigitosString2[i].equalsIgnoreCase("b") || DigitosString2[i].equalsIgnoreCase("B")) {
                VectorString[i]="11";
            }else if (DigitosString2[i].equalsIgnoreCase("c") || DigitosString2[i].equalsIgnoreCase("C")) {
                VectorString[i]="12";
            }else if (DigitosString2[i].equalsIgnoreCase("d") || DigitosString2[i].equalsIgnoreCase("D")) {
                VectorString[i]="13";
            }else if (DigitosString2[i].equalsIgnoreCase("e") || DigitosString2[i].equalsIgnoreCase("E")) {
                VectorString[i]="14";
            }else if (DigitosString2[i].equalsIgnoreCase("f") || DigitosString2[i].equalsIgnoreCase("F")) {
                VectorString[i]="15";
            }else if (DigitosString2[i].equalsIgnoreCase("g") || DigitosString2[i].equalsIgnoreCase("G")) {
                VectorString[i]="16";
            }else if (DigitosString2[i].equalsIgnoreCase("h") || DigitosString2[i].equalsIgnoreCase("H")) {
                VectorString[i]="17";
            }else if (DigitosString2[i].equalsIgnoreCase("i") || DigitosString2[i].equalsIgnoreCase("I")) {
                VectorString[i]="18";
            }else if (DigitosString2[i].equalsIgnoreCase("j") || DigitosString2[i].equalsIgnoreCase("J")) {
                VectorString[i]="19";
            }else if (DigitosString2[i].equalsIgnoreCase("k") || DigitosString2[i].equalsIgnoreCase("K")) {
                VectorString[i]="20";
            }else if (DigitosString2[i].equalsIgnoreCase("l") || DigitosString2[i].equalsIgnoreCase("L")) {
                VectorString[i]="21";
            }else if (DigitosString2[i].equalsIgnoreCase("m") || DigitosString2[i].equalsIgnoreCase("M")) {
                VectorString[i]="22";
            }else if (DigitosString2[i].equalsIgnoreCase("n") || DigitosString2[i].equalsIgnoreCase("N")) {
                VectorString[i]="23";
            }else if (DigitosString2[i].equalsIgnoreCase("o") || DigitosString2[i].equalsIgnoreCase("O")) {
                VectorString[i]="24";
            }else if (DigitosString2[i].equalsIgnoreCase("p") || DigitosString2[i].equalsIgnoreCase("P")) {
                VectorString[i]="25";
            }else if (DigitosString2[i].equalsIgnoreCase("q") || DigitosString2[i].equalsIgnoreCase("Q")) {
                VectorString[i]="26";
            }else if (DigitosString2[i].equalsIgnoreCase("r") || DigitosString2[i].equalsIgnoreCase("R")) {
                VectorString[i]="27";
            }else if (DigitosString2[i].equalsIgnoreCase("s") || DigitosString2[i].equalsIgnoreCase("S")) {
                VectorString[i]="28";
            }else if (DigitosString2[i].equalsIgnoreCase("t") || DigitosString2[i].equalsIgnoreCase("T")) {
                VectorString[i]="29";
            }else if (DigitosString2[i].equalsIgnoreCase("u") || DigitosString2[i].equalsIgnoreCase("U")) {
                VectorString[i]="30";
            }else if (DigitosString2[i].equalsIgnoreCase("V") || DigitosString2[i].equalsIgnoreCase("v")) {
                VectorString[i]="31";
            }else if (DigitosString2[i].equalsIgnoreCase("W") || DigitosString2[i].equalsIgnoreCase("w")) {
                VectorString[i]="32";
            }else if (DigitosString2[i].equalsIgnoreCase("X") || DigitosString2[i].equalsIgnoreCase("x")) {
                VectorString[i]="33";
            }else if (DigitosString2[i].equalsIgnoreCase("y") || DigitosString2[i].equalsIgnoreCase("Y")) {
                VectorString[i]="34";
            }else if (DigitosString2[i].equalsIgnoreCase("z") || DigitosString2[i].equalsIgnoreCase("Z")) {
                VectorString[i]="35";
            }else if (DigitosString2[i].equals(" ")) {
                VectorString[i]="36";
            }else if (DigitosString2[i].equals(".")) {
                VectorString[i]="37";
            }else if (DigitosString2[i].equals(",")) {
                VectorString[i]="38";
            }
        }
        

        
    }
    
  
    
    

    
    public String cambio(int m){
        String h = "";
        switch(m){
            case 10:
                h="A";
            break;
            case 11:
                h="B";
            break;
            case 12:
                h="C";
            break;
            case 13:
                h="D";
            break;
            case 14:
                h="E";
            break;
            case 15:
                h="F";
            break;
            case 16:
                h="G";
            break;
            case 17:
                h="H";
            break;
            case 18:
                h="I";
            break;
            case 19:
                h="J";
            break;
            case 20:
                h="K";
            break;
            case 21:
                h="L";
            break;
            case 22:
                h="M";
            break;
            case 23:
                h="N";
            break;
            case 24:
                h="O";
            break;
            case 25:
                h="P";
            break;
            case 26:
                h="Q";
            break;
            case 27:
                h="R";
            break;
            case 28:
                h="S";
            break;
            case 29:
                h="T";
            break;
            case 30:
                h="U";
            break;
            case 31:
                h="V";
            break;
            case 32:
                h="W";
            break;
            case 33:
                h="X";
            break;
            case 34:
                h="Y";
            break;
            case 35:
                h="Z";
            break;
            case 36:
                h=" ";
            break;
            case 37:
                h=".";
            break;
            case 38:
                h=",";
            break;            
        }
        return h;
    }
    private BigInteger BigInteger(String m){
        BigInteger cadena = new BigInteger(m);
        return cadena;
    }
    
    private int BigInteger(BigInteger m){
        String n=m.toString();
        int p=Integer.parseInt(n);
        return p;
    }    
    private String BigIntegerS(BigInteger m){
        String n=m.toString();
        return n;
    }    
}
