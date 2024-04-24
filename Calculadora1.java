/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Alumnado
 */
// añadir raiz cuadrada
public class Calculadora1 {

    private int num1;
    private int num2;
    public Calculadora1(int a, int b) {
    num1 = a;
    num2 = b;
    }
    public int suma() {
        int result = num1+num2;
        return result;
    }
    public int resta() {
        int result = num1-num2;
        return result;
    }
    public int multiplica(){
        int result = num1*num2;
        return result;
    }
    public int divide() {
        int result = num1/num2;
        return result;
    }
    
}
