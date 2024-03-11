package juegocartas1;
import java.util.*;
import javax.swing.*;

public class Jugador {
    private int TOTAL_CARTAS = 10;
    private int MARGEN = 20; // las cartas comienzan a ubicarse en una posición inicial
    private int DISTANCIA = 30; // espacio entre carta y carta
    private Random r;
    private Carta[] cartas = new Carta[TOTAL_CARTAS]; // vector de cartas

    private NombreCarta[] cartasFigura;
    
    public Jugador() {
        r = new Random();
    }
    
    public void repartir() {
        for(int i = 0; i < TOTAL_CARTAS; i++){
            cartas[i] = new Carta(r); // Crea las 10 cartas
        }
    }
    
    public void mostrar(JPanel pnl, boolean tapada){
        pnl.removeAll(); // limpia el panel
        
        int s = MARGEN;
        
        for(Carta c : cartas){ // por cada carta en el arreglo de cartas. (es una simulación de un for each)
            c.showCarta(s, 5, pnl, tapada);
            s += DISTANCIA;
        }
        
        pnl.repaint(); // redibujar el panel
    }
    
    public String getGrupos(){
        String msg = "No se encontraron";
        int[] contadores = new int[NombreCarta.values().length];
        ArrayList<ArrayList<String>> escaleras = new ArrayList<>(); // arreglo para guardar las escaleras
        
        for(Carta c : cartas){ // Por cada carta
            contadores[c.getNombre().ordinal()]++; // obtiene el número y aumenta el conteo de ese numero
        }
        
        for(int i = 0; i < contadores.length; i++){
            if(contadores[i] >= 1){
                int cantidad = contadores[i];
                int carta = i;
            }
        }
        
        int totalGrupos = 0;
        
        for(int c : contadores)
            if(c >= 2) // pares, ternas, cuartas, etc
                totalGrupos++;
        
        if(totalGrupos > 0) {
            msg = "Los grupos encontrados fueron:\n ";
            
            for(int i = 0; i < contadores.length; i++){
                if(contadores[i] >= 2){
                    msg += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                }
            }
        }
        
        
        // ESCALERAS
        
        Pinta pinta = cartas[0].getPinta();
        
        for (Pinta palo : Pinta.values()) { // por cada pinta
            ArrayList<String> cartasPalo = new ArrayList<>(); // arreglo para las cartas de cada pinta
            
            for (Carta carta : cartas) { // recorre las cartas del jugador
                if (carta.getPinta() == palo) { // si la pinta de la carta coincide
                    cartasPalo.add(carta.getNombre().toString()); // añade al arreglo el nombre de la carta
                }
            }
            
            for(int i = 0; i < cartasPalo.size(); i++){ // Algoritmo de ordenamiento por selección
                int indice = i;
                String valor = cartasPalo.get(i);
                
                for(int j = i; j < cartasPalo.size(); j++){
                    if(NombreCarta.valueOf(cartasPalo.get(j)).ordinal() < NombreCarta.valueOf(valor).ordinal()){
                        indice = j;
                        valor = cartasPalo.get(j);
                    }
                }
                
                String aux = cartasPalo.get(i); // auxiliar
                cartasPalo.set(i, cartasPalo.get(indice));
                cartasPalo.set(indice, aux);
            }
            
            // Verificar si es una escalera
            ArrayList<String> escaleraActual = new ArrayList<>();
            String valorAnterior = null;
            
            for (String valor : cartasPalo) { // para cada valor en cartasPalo
                if (valorAnterior != null && esSiguiente(valorAnterior, valor)) { // si hay un valor anterior y el nuevo es contiguo
                    escaleraActual.add(valor); // se añade ese valor a la escalera actual
                } else {
                    if (escaleraActual.size() >= 3) { // si es una terna o mayor
                        escaleras.add(escaleraActual); // lo añade al arreglo de escaleras
                    }
                    
                    escaleraActual = new ArrayList<>(); // se 'resetea' el arreglo
                    escaleraActual.add(valor); // se añade el valor
                }
                
                valorAnterior = valor; // ahora el valor anterior va a ser igual al valor
            }
            
            if (escaleraActual.size() >= 3) {
                escaleras.add(escaleraActual);
                pinta = palo;
                msg += "\nLas escaleras encontradas fueron:\n";
                
                for (ArrayList<String> escalera : escaleras) {
                    msg += "Escalera de " + pinta + ": " + escalera + "\n";
                }
            }
        }
        
        return msg;
    }
    
    private boolean esSiguiente(String valorAnterior, String valorActual){ // verifica si son contiguos
        int indiceAnterior = NombreCarta.valueOf(valorAnterior).ordinal();
        int indiceActual = NombreCarta.valueOf(valorActual).ordinal();
        return indiceActual - indiceAnterior == 1; // si se cumple que tienen una diferencia de 1 unidad, retorna true
    }
    
    public int getPuntaje() {
        int puntaje = 0;
        String grupos = getGrupos();
        String text = "";
        
        for (int i = 0; i < cartas.length; i++){
            text = cartas[i].getNombre().toString();
            
            if(!grupos.contains(text) || grupos.contains("PAR de " + text)){ // si el mensaje de grupos no contiene el nombre de esa carta
                
                if(text.equals("JACK") || text.equals("QUEEN") || text.equals("KING") || text.equals("ACE")){
                    puntaje += 10;
                } else{
                    puntaje += NombreCarta.valueOf(text).ordinal();
                }
            }
        }
        
        return puntaje;
    }
}