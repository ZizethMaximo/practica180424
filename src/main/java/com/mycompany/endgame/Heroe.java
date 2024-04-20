package com.mycompany.endgame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL 7490
 */
public class Heroe extends Personaje{
    protected String arma;
    
    public Heroe(String nombre,String arma,String poder){
    super(nombre,poder);
    this.arma=arma;
    }
    
    @Override       //sobreescrito lo del metodo atacar se sobreescribe Heroe, no en la rpincipal(pader)
    public void atacar(){
        System.out.println(nombre+ " realiza un ataque con el arma" +arma+"!");
    }
    
}
