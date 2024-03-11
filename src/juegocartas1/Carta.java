package juegocartas1;
import java.util.*;
import javax.swing.*;

public class Carta {
    private int indice;
    
    public Carta(Random r) {
        indice = r.nextInt(52) + 1; // El número de la carta es generado aleatoriamente. Son 52 cartas iniciando en 1 (A)
    }
    
    public Pinta getPinta(){
        if(indice <= 13){
            return Pinta.TREBOL;
        } else if (indice <= 26){
            return Pinta.PICA;
        } else if (indice<=39){
            return Pinta.CORAZON;
        } else {
            return Pinta.DIAMANTE;
        }
    }
    
    public NombreCarta getNombre() {
        //Obtiene el nombre que corresponde al número de la carta
        int numero = indice % 13; // obtiene el residuo
        
        if (numero == 0) { // si es cero es porque el número era el 13
            numero = 13;
        }
        
        return NombreCarta.values()[numero];
    }
    
    public void showCarta(int x, int y, JPanel pnl, boolean tapada) {
        String nombreImagen;
        
        if(tapada){
            nombreImagen = "/images/Tapada.jpg";
        } else {
            nombreImagen = "/images/CARTA" + String.valueOf(indice) + ".jpg";
        }
        
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        JLabel lblCarta = new JLabel(imagen); // Instancia label para mostrar la imagen
        lblCarta.setBounds(x, y,
                                x + imagen.getIconWidth(),
                                y + imagen.getIconHeight()
        ); // recibe la posición en x y y, y el tamaño
        pnl.add(lblCarta); // Muestra la carta en la ventana
    }
}