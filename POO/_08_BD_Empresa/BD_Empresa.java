/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_BD_Empresa;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class BD_Empresa {
    
    private ArrayList<Empresa> bd;

    
    public BD_Empresa() {
        this.bd = new ArrayList<>();
    }

    
    public ArrayList<Empresa> getBd() {
        return this.bd;
    }

    public void setBd(ArrayList<Empresa> bd) {
        this.bd = bd;
    }
    
    
    // Métodos
    public void addEmpresa(Empresa e){
        if(e != null){
            this.bd.add(e);
        }
    }//
    
    
    public Empresa buscarCIF(String cif){
        Empresa empresaBuscada = null;
        
        if(cif.equals("")){
            System.out.println("CIF incorrecto");
        }else{
            for(Empresa e: this.bd){
                if(e.getCIF().equalsIgnoreCase(cif)){
                    empresaBuscada = e;
                }
            }
        }
        
        return empresaBuscada;
    }//
    
    
    public ArrayList<Empresa> buscarNombre(String nombre){
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        
        nombre.toLowerCase();
        
        for(Empresa e: this.bd){
            if(e.getNombre().toLowerCase().startsWith(nombre)){
                listaEmpresas.add(e);
            }
        }
        return listaEmpresas;
    }//
    
    
}//
