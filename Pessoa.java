/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Davi
 */
public class  Pessoa {
    
    public String nome;
    public String telefone;
    public int idade;

    
    public Pessoa(){
    
        idade = 0;
        nome = "";
        telefone = "";
    }
    
    public Pessoa(String nom, String tel, int id){
             
              nome = nom;
              telefone = tel;
              idade = id;
    
    }
        
    public String mostrarDados(){
    
   String retorno = "Nome: "+nome+ " Idade: "+ idade + " Telefone "+ telefone;
   return retorno;
    }
    
    }    
    
    
    

    

