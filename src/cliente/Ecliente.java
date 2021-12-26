/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author diogo
 */
public class Ecliente {
        private String nome = "";
        private String senha = "";
        private String cpf = "";
        
        public Ecliente() {
        }

        public void setUsuario(String nome) {
          this.nome = nome;
        
    

        }

        public void setSenha(String senha) {
            this.senha = senha;

        }

        public void setCpf(String cpf) {
            this.cpf = cpf;

        }

        public String getUsuario() {
           
            return this.nome;
        }

        public String getSenha() {
          
           return this.senha;
        }

        public String getCpf() {
           
            return this.cpf;
        }
}
