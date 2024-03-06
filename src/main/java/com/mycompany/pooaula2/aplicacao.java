/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula2;

/**
 *
 * @author Admin
 */
public class aplicacao {
    public static void main (String args[]){
          aluno p1 = new aluno("dudinha");
           p1.nota = 9;
             p1.setPasseando(true);
             p1.setAprovado(true);
        
          aluno p2 = new aluno("cizoka");
          p2.nota = 5;
          
        System.out.println("Eduarda");
        System.out.println(p1.passeia());
       
        
        System.out.println("Tarcisio");
        System.out.println(p2.passeia());
        
        
           professor prof1 = new professor ("pantera");
        
        System.out.println("professor");
        System.out.println(prof1.nome);
        
        System.out.println(prof1.passeia());
          System.out.println ("dudinha");
           System.out.println(p1.aprovado());
          System.out.println("cizoka"); 
            System.out.println(p2.aprovado());
       
    }
}
