package practica.polynomialregression;

public class SPR {
   
    HelperArithmetic helper = new HelperArithmetic();
    DataSet data = new DataSet();
    Coeficientes c = new Coeficientes();
    
    public SPR() {}
    
    public void Metodo() {
        
        double sumax = 0, sumay = 0, sumaxy = 0, sumax2 = 0, sumax3 = 0, sumax4 = 0, sumax2y = 0;
        int n = data.getN();
        
        sumax = helper.sumatoria(data.getX());
        sumax2 = helper.sumatoria(data.getX(), 2);
        sumax3 = helper.sumatoria(data.getX(), 3);
        sumax4 = helper.sumatoria(data.getX(), 4);
        sumay = helper.sumatoria(data.getY());
        sumaxy = helper.sumatoria(data.getX(), data.getY());
        sumax2y = helper.sumatoria(data.getX(), 2, data.getY());
        
        double Ds = (n*sumax2*sumax4)+(sumax*sumax3*sumax2)+(sumax2*sumax*sumax3)-(sumax*sumax*sumax4)-(n*sumax3*sumax3)-(sumax2*sumax2*sumax2);
        double Db0 = (sumay*sumax2*sumax4)+(sumax*sumax3*sumax2y)+(sumaxy*sumax3*sumax2)-(sumax2*sumax2*sumax2y)-(sumax3*sumax3*sumay)-(sumaxy*sumax*sumax4);
        double Db1 = (n*sumaxy*sumax4)+(sumay*sumax3*sumax2)+(sumax*sumax2y*sumax2)-(sumax2*sumaxy*sumax2)-(sumax3*sumax2y*n)-(sumax*sumay*sumax4);
        double Db2 = (n*sumax2*sumax2y)+(sumax*sumaxy*sumax2)+(sumax*sumax3*sumay)-(sumay*sumax2*sumax2)-(sumaxy*sumax3*n)-(sumax*sumax*sumax2y);
        
        c.setBeta0(Db0 / Ds);
        c.setBeta1(Db1 / Ds);
        c.setBeta2(Db2 / Ds);
        
        System.out.println("f(x) = " + c.getBeta0() + " + " + c.getBeta1() + "x " + c.getBeta2() + " x^2"); 
    }
}
