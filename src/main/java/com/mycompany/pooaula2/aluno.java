/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula2;

/**
 *
 * @author Admin
 */
public class aluno extends pessoa {
    
    public int nota;  
    
   public aluno (String nome) {
     
       super (nome);
      
      
   }
 boolean aprovado;

    public boolean isAprovado(){
        
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    public String aprovado (){
        if(nota >=7){
         return "aprovada";
        }   
        else{
        return "reprovado"; 
        }    
    }
 
}
