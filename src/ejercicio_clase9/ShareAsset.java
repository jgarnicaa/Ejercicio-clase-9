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
public abstract class ShareAsset implements Interfaz_Asset {
    int id;
    double totalC;
    double currentP;

    public ShareAsset(int id, double totalC, double currentP) {
        this.id = id;
        this.totalC = totalC;
        this.currentP = currentP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalC() {
        return totalC;
    }

    public void setTotalC(double totalC) {
        this.totalC = totalC;
    }

    public double getCurrentP() {
        return currentP;
    }

    public void setCurrentP(double currentP) {
        this.currentP = currentP;
    }
    
    
    
    @Override
    
    public abstract double getProfit();
}
