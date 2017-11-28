
package boletin10;

import javax.swing.JOptionPane;

public class Juego {
    public Juego(){
        
    }
    
    public void practicarJuego(){
       
    String respuesta = JOptionPane.showInputDialog("Teclea un número entre 1 y 50");
    int num = Integer.parseInt(respuesta);
    
    juego:
    while (num!=0){    
        if (num >= 1 && num <= 50){
            String intentos = JOptionPane.showInputDialog("¿En cuántos intentos quieres adivinar el número?");
            int numIntentos = Integer.parseInt(intentos); 
            
            for (int contador=0; contador<numIntentos; contador++){
                String respuesta2 = JOptionPane.showInputDialog("Teclea un número entre 1 y 50");
                int num2 = Integer.parseInt(respuesta2);
                
                if (num==num2){
                    int respuesta3 = JOptionPane.showConfirmDialog(null, "¡Enhorabuena "+num2+" es el número correcto!"
                    + "\n¿Deseas continuar jugando?");
                    if(respuesta3 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Genial, pues empezemos!");
                    Juego.this.empezarJuego();
                    }
                    else if(respuesta3 == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "¡Hasta otra entonces!");
                    break juego;
                    }
                }
                
                if (num2>num){
                JOptionPane.showMessageDialog(null, "El número que tienes que adivinar es menor"); 
                }
                else {
                JOptionPane.showMessageDialog(null, "El número que tienes que adivinar es mayor ");
                } 
            } 
            
            int respuesta4 = JOptionPane.showConfirmDialog(null, "Lo siento superaste el número de intentos"
                    + "\n¿Deseas continuar intentándolo?");
                if(respuesta4 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Buena suerte esta vez!");
                    Juego.this.empezarJuego();
                }
                else if(respuesta4 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Hasta otra!");
                break juego;
                }
                
        }
        else {
           respuesta = JOptionPane.showInputDialog(null, "Ese número no es válido, ingrese otro", "Error!", JOptionPane.ERROR_MESSAGE);
            num = Integer.parseInt(respuesta); 
        }
    } //salir while
    
    
    } //salir metodo
    
    public void empezarJuego(){
        Juego.this.practicarJuego();
    }
    
    public void acabarJuego(){
       
    
    }
}
