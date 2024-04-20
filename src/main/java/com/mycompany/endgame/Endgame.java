/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author DELL 7490
 */
public class Endgame {

    public static void main(String[] args) {
        Heroe blackPanther=new Heroe("Black Panter grrrr, "," Garras de Vibranium","Rey de todo Wakanda");
        Villano galactus=new Villano("Galactus","Devorador de mundos","usa de chalan a Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark"," Mark42 "," Genio,Filantropo,multimillonario,playboy"," Prime ");
        Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito Chitaury"," con Gemas del Infiito");
        
          //aplicando polimorfismo
    Personaje[]personajes={blackPanther,galactus,ironMan,thanos};
    for(Personaje personaje:personajes){
    personaje.atacar();
}
    
    //metodo especifico de avener
    ((Avenger)ironMan).reunirse();
    
    //ejemplo metodo especifico de thanos
    thanos.chasquearDedos();
    }
   
}
