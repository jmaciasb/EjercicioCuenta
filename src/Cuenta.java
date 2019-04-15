/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmaciasb
 */
public class Cuenta {
    private int numero;
    private String dueno;
    private int clave;
    private float saldo;

    public Cuenta(int numero, String dueno, int clave, float saldo) {
        this.numero = numero;
        this.dueno = dueno;
        this.clave = clave;
        this.saldo = saldo;
    }
    
    public boolean consignar(double valor){
        if (valor > 0 && this.saldo <= valor){
            this.saldo += valor;
            return true;}
        else return false;
        
    }
    public boolean retirar(double retiro){
        if(retiro>0 && saldo>retiro){
                this.saldo -= retiro;
                return true;}
        else return false;
    }
    public double consultarSaldo(){
        
        return saldo;
    }
    public boolean cambiarClave(int nuevaClave){
        if (nuevaClave != this.clave && nuevaClave!=0){
        this.clave = nuevaClave;
        return true;}
        else return false;
    }
    public float setSaldo(float saldo){
        return this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
}

    