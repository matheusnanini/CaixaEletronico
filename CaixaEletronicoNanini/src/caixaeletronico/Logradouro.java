/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author Gabriel
 */
public class Logradouro {
    private final String logradouro;
    private final String numero;
    private final String cidade;
    private final String estado;

    public Logradouro(String logradouro, String numero, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco : " + "Rua:" + logradouro + " numero: " + numero + "\n   Cidade: " + cidade + " Estado: " + estado;
    }
    
}
