/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class tableLivro extends AbstractTableModel {
    private List<Livro> items;
    private String[] columns = new String[] {
        "Código",
        "Título",
        "Autor",
        "Categoria",
    };
    private Class[] types = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
    };
    private boolean[] canEdit = new boolean [] {
        false, 
        false, 
        false, 
        false, 
        false
    };

    public tableLivro(List<Livro> items) {
        this.items = items;
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
        Livro item = items.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getId();
            case 1: return item.getTitulo();
            case 2: return item.getAutor();
            case 3: return item.getCategoria();
        }
        return null;
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
    
    public void add(Livro item) {
        items.add(item);
        int row = items.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove(Livro item) {
        if (items.contains(item)) {
            int row = items.indexOf(item);
            items.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
}
