/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula2;

/**
 *
 * @author Admin
 */
public class pessoa {
    
    String nome ;
    static String cromossomo = "h";
    
    boolean passeando ;
    
    public pessoa(String nome){
        //this representa 
        //a instancia que 
        //está sendo criada
        
        this.nome = nome;
        //qdo uma pessoa passa a existir 
        //quando o contrutor para de rodar. 
    }

    public boolean isPasseando() {
        return passeando;
    }

    public void setPasseando(boolean passeando) {
        this.passeando = passeando;
    }
    
    
    public void estuda (){
        System.out.println("estudando...");
    }
    
    public String passeia (){
        if(this.passeando){
         return "Eu preciso estudar para a atividade";
        }   
        else{
        return "Pra que estudar, vou é passear "; 
        }    
    }
    
    
}
