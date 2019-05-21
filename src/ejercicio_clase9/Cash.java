/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase9;

/**
 *
 * @author usuario
 */
public class Cash implements Interfaz_Asset {
    double amount;

    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarketValue(){
    return amount;}
    
    @Override
    public double getProfit(){
    return 0;
    }
}

