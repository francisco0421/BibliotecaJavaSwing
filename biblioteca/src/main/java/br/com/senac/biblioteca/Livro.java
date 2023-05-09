/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;

/**
 *
 * @author Aluno TDS
 */
public class Livro {
    public int id;
    private String titulo;
    private String autor;
    private String categoria;
    
    public Livro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    public Livro(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
