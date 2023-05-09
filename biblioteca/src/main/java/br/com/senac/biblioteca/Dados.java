/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;

/**
 *
 * @author Aluno TDS
 */
public class Dados {
    private Biblioteca biblioteca;

    public Dados() {
        initDados();
    }
    
    private void initDados(){
        // Inicializa biblioteca
        this.biblioteca = new Biblioteca("Biblioteca Estadual");
        this.biblioteca.addLivro(new Livro("Guerra e Paz","Liev Tolstói","Romance"));
        this.biblioteca.addLivro(new Livro("1889","Laurentino Gomes","História brasileira"));
        this.biblioteca.addLivro(new Livro("O Silmarillion","J.R.R. Tolkien","Fantasia"));
        this.biblioteca.addLivro(new Livro("Crime e Castigo","Fiódor Dostoiévski","Romance"));
        this.biblioteca.addLivro(new Livro("Fausto","J.W. Goethe","Poesia"));
    }
    
    public Biblioteca getBiblioteca(){
        return this.biblioteca;
    }
}
