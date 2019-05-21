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
public class DividenStock extends Stock {
    int dividens;

    public DividenStock(int dividens, int totalS, int id, double totalC, double currentP) {
        super(totalS, id, totalC, currentP);
        this.dividens = dividens;
    }
    
  @Override
 
  public double getMarketValue(){
  double v;
  v=((totalS*currentP)+dividens);
  return v;
  }
  
   @Override
 public double getProfit(){
 double p;
 p=((totalS*currentP)-(totalC));
 return p;
 }
    
}
