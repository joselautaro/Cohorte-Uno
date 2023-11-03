package Clase5;

import javax.swing.JOptionPane;

public class Clase5 {
    
    public static void main(String[] args){
       /*
        //Ejemplo1 
        
        //Solicitar al usuairo que ingrese un número y guardarlo en una variable
        
        String numeroString = JOptionPane.showInputDialog("Ingrese un número");
        
        int numero = Integer.parseInt(numeroString);
        
        //Comprobar si el numero es par o impar
        
        if( numero % 2 == 0 ){
            JOptionPane.showMessageDialog(null, "El numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
*/
       
       /*
       //Ejemplo 2
       
       String calificacion = JOptionPane.showInputDialog("Ingrese un número");
       
       int nota = Integer.parseInt(calificacion);
       
       if( nota >= 70 ){
           JOptionPane.showMessageDialog(null, "Tu examen fue aprobado");
       }else{
           JOptionPane.showMessageDialog(null, "Tu examen fue desaprobado");
       }
*/
       
       //Ejemplo 3
       
       String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
       
       String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");
       
       String num3 = JOptionPane.showInputDialog("Ingrese el tercer número");
      
       //Inicializar una variable para almacenar el número mayor 
       int mayor = Integer.parseInt(num1);
       
       //Comprobar si el segundo número es mayor que el actual número mayor
       if( Integer.parseInt(num2) > mayor ){
           mayor = Integer.parseInt(num2);
       }
       
       //Comprobar si el tercer número es mayor que el numero mayor
       if( Integer.parseInt(num3) > mayor ){
           mayor = Integer.parseInt(num3);
       }
       
       JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
       
       
        
        
    }
    
}
