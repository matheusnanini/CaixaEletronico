/*
' * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

public class Bandeja {
    private final double valorFace;
    private int qntNotas;

    public Bandeja(double valorFace, int qntNotas) {
        this.valorFace = valorFace;
        this.qntNotas = qntNotas;
    }

    
    public double getValorFace() {
        return valorFace;
    }
    
    public int getQntNotas() {
        return qntNotas;
    }

    public void retirarNotas(int s){
        this.qntNotas -= s;
    }
    
}
