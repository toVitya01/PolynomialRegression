package practica.polynomialregression;

public class DataSet {
        
    private int n;
    private double[] x, y;
    
    //Constructor
    public DataSet(){
        this.x = new double[]{-3, -2, -1, 0, 1, 2, 3};
        this.y = new double[]{7.5, 3, 0.5, 1, 3, 6, 14};
        this.n = x.length;
    }
    
    //Setters y Getters de variables
    public int getN() { return n;   }
    
    public double[] getX(){ return this.x;   }
    public void setX(double[] aux){ this.x = aux;   }
    
    public double[] getY(){ return this.y;   }
    public void setY(double[] aux){ this.y = aux;   }
}
