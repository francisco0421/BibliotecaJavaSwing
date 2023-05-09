/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno TDS
 */
public class Biblioteca {
    private final String nome;
    private final List<Livro> livros;
    private int idCounter = 0;

    public static void main(String[] args) {
        FrameHome home = new FrameHome();
        home.setVisible(true);
    }
    
    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    
    public void devolveLivro(Livro livro){
        livro.setId(++this.idCounter);
        this.livros.add(livro);
    }
        
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    void addLivro(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
