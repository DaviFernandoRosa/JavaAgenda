/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dados.Pessoa;


public class Inicio {
    
   
    public static void main(String args[]){
      
      Pessoa pes;
      pes = new Pessoa();
      Pessoa pes2 = new Pessoa(" João","(11) 0980-0980",13);
      pes.nome = "Fulano";
      pes.idade = 22;
      pes.telefone = "(00)7654-3210";
      System.out.println(pes.mostrarDados());
      System.out.println(pes2.mostrarDados());
      
      
      
      }
    
}
