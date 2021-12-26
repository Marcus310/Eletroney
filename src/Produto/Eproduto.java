/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author diogo
 */
public class Eproduto {
    
        private String id = "";
        private String nome = "";
        private String descricao = "";
        private String preco = "";
    
     public Eproduto() {
        }
        
        public void setId(String id){
        this.id = id;
        
        }
     
        public void setNome(String nome) {
          this.nome = nome;
        
    

        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;

        }

        public void setPreco(String preco) {
            this.preco = preco;

        }
        
        public String getId(){
        return this.id;
        
        }

        public String getNome() {
           
            return this.nome;
        }

        public String getDescricao() {
          
           return this.descricao;
        }

        public String getPreco() {
           
            return this.preco;
        }
        public void limpaProduto(){
         id = "";
         nome = "";
         descricao = "";
         preco = "";
    }   

}
