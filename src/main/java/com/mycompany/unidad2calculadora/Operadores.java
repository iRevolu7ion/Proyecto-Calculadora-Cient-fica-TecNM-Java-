/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2calculadora;
//import javax.Swing.JOptionPane;

/**
 *
 * @creador Antonio Holguin
 */
public class Operadores 
{
    float valorA;
    float valorB;
   
    float realizarOperacion(float A, float B, String simbolo)
    {
        float resultado=0;
        switch(simbolo)
        {
            case "-" -> resultado=A-B;
            case "+" -> resultado=A+B;
            case "*" -> resultado=A*B;
            case "/" -> resultado=A/B;
            default -> {
            }
        }
        return resultado;
    }
    
    
    String revisarNumeros(String nums, String numBoton)
    {
        String NumNuevo;
        
        if(nums.equals("0"))
        {
            NumNuevo=numBoton;
        }
        else
        {
            NumNuevo=nums+numBoton;
        }
        return NumNuevo;
    }
    String BorrarCaracter(String numeros)
    {
        String numsMenos;
        if(numeros.length()!=1)
        {
            numsMenos=numeros.substring(0, numeros.length()-1);
        }
        else
        {
            numsMenos="0";
        }
        return numsMenos;
    }
    
    String revisarPunto(String numeros)
    {
        int i;
        String numerosPunto="";
        boolean hayPunto=false;
        char caracter;
        for(i=0;i<numeros.length();i++)
        {
            caracter=numeros.charAt(i);
            if(caracter=='.')
            {
                hayPunto=true;
            }
        }
        if(!hayPunto)
        {
            numerosPunto=numeros+".";
        }
        else
        {
            numerosPunto=numeros;
        }
        return numerosPunto;
    }
    
    String revisarComas(String numerostxt)
    {
        int indiceDelPunto;
        int i;
        String numeroResultanteconComas="";
        String numeroEntero="";
        String numeroDecimal="";
        String numeroRevisadoComas;
        String numeroCompleto="";
        numeroRevisadoComas=quitarComas(numerostxt);
        indiceDelPunto=numeroRevisadoComas.indexOf(".");
        if(indiceDelPunto==-1)
        {
            numeroEntero=numeroRevisadoComas;
            numeroResultanteconComas=ponerComas(numeroEntero);
        }
        else
        {
            for(i=0;i<indiceDelPunto;i++)
            {
                numeroEntero=numeroEntero+numeroRevisadoComas.charAt(i);
            }
            for(i=indiceDelPunto;i<numeroRevisadoComas.length();i++)
            {
                numeroDecimal=numeroDecimal+numeroRevisadoComas.charAt(i);
            }
            numeroResultanteconComas=ponerComas(numeroEntero);
        }
        numeroCompleto=numeroResultanteconComas+numeroDecimal;
        return numeroCompleto;
    }
    
    public String ponerComas(String numeroSinComas)
    {
        String numeroConComas="";
        int indiceDeComas=0;
        int i;
        for(i=numeroSinComas.length()-1;i>=0;i--)
        {
            indiceDeComas++;
            if(indiceDeComas==3&&i>0)
            {
                numeroConComas=","+numeroSinComas.charAt(i)+numeroConComas;
                indiceDeComas=0;
            }
            else
            {
                numeroConComas=numeroSinComas.charAt(i)+numeroConComas;
            }
        }
        return numeroConComas;
    }
    
    public String quitarComas(String numeroSinComas)
    {
        String numSinComas="";
        int i;
        for(i=0;i<numeroSinComas.length();i++)
        {
            if(numeroSinComas.charAt(i)!=',')
            {
                numSinComas=numSinComas+numeroSinComas.charAt(i);
            }
        }
        return numSinComas;
    }
    /*
    public double logaritmo(float a)
    {
     double valoranterior;
     double exponencial=0.1;
     double resultado=0.0;
     double vfinal;
     double incremento=1;
     
     resultado=math.pow(10, incremento);
     
     if(resultado>a)
     {
         valoranterior=incremento;
         
         if(incremento!=exponencial)
         {
             incremento=incremento-exponencial;
         }
     }
     
    }
    */
    
    
    
    
}
