
package boletin10_2;

import javax.swing.JOptionPane;

public class Juego {
    
    public Juego (){
        
    }
    
    public void practicarJuego (){
         double numAle = Math.floor(Math.random()*(1-50+1)+50);  

            String intentos = JOptionPane.showInputDialog("¿Cuántos intentos quieres?");
            int numIntentos = Integer.parseInt(intentos); 
            juego:
            for (int contador=0; contador<=numIntentos; contador++){
                String respuesta = JOptionPane.showInputDialog("Teclea un número entre 1 y 50");
                double numRes = Integer.parseInt(respuesta);
                double resul;
                if (numRes>numAle){
                   resul = numRes - numAle;
                }
                else {
                    resul = numAle - numRes;
                }
                
                if (numRes==numAle){
                    int respuesta2 = JOptionPane.showConfirmDialog(null, numRes+" COOOOORRECTOOO"
                    + "\n¿Deseas continuar jugando?");
                    if(respuesta2 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null," Pues empezemos!");
                    Juego.this.empezarJuego();
                    }
                    else if(respuesta2 == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Venga chao");
                    break juego;
                    }
                }
                
                if (resul > 20){
                JOptionPane.showMessageDialog(null, "Estás muy lejos"); 
                }
                else if (resul >=10 && resul<=20){
                JOptionPane.showMessageDialog(null, "Estás lejos");
                } 
                else if (resul <=10 && resul >=5){
                JOptionPane.showMessageDialog(null, "Estás cerca"); 
                }
                else {
                JOptionPane.showMessageDialog(null, "Estás muy cerca");    
                }
               
            } 
            int respuesta4 = JOptionPane.showConfirmDialog(null, "Perdiste, superaste el número de intentos"
                    + "\n¿Deseas continuar intentándolo?");
                
                juego2:
                if(respuesta4 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Venga, tu puedes");
                    Juego.this.empezarJuego();
                }
                else if(respuesta4 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Venga chao");
                break juego2;
                }
                
        }
    
     public void empezarJuego(){
        Juego.this.practicarJuego();
    }
    
}
