package com.mycompany.unidad2calculadora;


import com.mycompany.unidad2calculadora.Operadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irevo
 */
public class OperadoresCientificos extends Operadores
{
    double Potencia(float A, float B)
    {
        double resultado;
        resultado=(float)Math.pow(A,B);
        return resultado;
    }
    double Seno(float A)
    {
        double resultado;
        resultado=(float)Math.sin(A);
        return resultado;
    }
    
    double Coseno(float A)
    {
        double resultado;
        resultado=(float)Math.cos(A);
        return resultado;
    }   
    double Tangente(float A)
    {
        double resultado;
        resultado=(float)Math.tan(A);
        return resultado;
    }
    
    double Inversa(float A)
    {
        double resultado;
        resultado=1/A;
        return resultado;
    }   
    
    double logaritmo(float a)
    {
     double valoranterior;
     double exponencial=0.1;
     double resultado=0.0;
     double vfinal;
     double incremento=1;
     
     resultado=Math.pow(10, incremento);
     
     if(resultado>a)
     {
         valoranterior=incremento;
         
         if(incremento!=exponencial)
         {
             incremento=incremento-exponencial;
         }
     }
        return resultado;
     }
   float realizarOperacionCientifica(float A, float B, String Simbolo)
    {
        float resultado=0;
        switch(Simbolo)
        {
            case "Sen"-> resultado=(float)Math.sin(A);
            case "Cos"-> resultado=(float)Math.cos(A);
            case "Tan"-> resultado=(float)Math.tan(A);
            case "-1" -> resultado=1/A;
            case "Log" -> resultado=(float)Math.log(A)/(float)Math.log(10);
            case "p" -> resultado=(float)Math.pow(A, B);

            default -> {
        }
      }
        return resultado;
    }
}
