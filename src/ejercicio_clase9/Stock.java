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
public class Stock extends ShareAsset{
    int totalS;

    public Stock(int totalS, int id, double totalC, double currentP) {
        super(id, totalC, currentP);
        this.totalS = totalS;
    }
 
 @Override
 
 public double getProfit(){
 double p;
 p=((totalS*currentP)-(totalC));
 return p;
 }
 
 @Override
 
 public double getMarketValue(){
 double v;
 v=(totalS*currentP);
 return v;
 }
    
}
