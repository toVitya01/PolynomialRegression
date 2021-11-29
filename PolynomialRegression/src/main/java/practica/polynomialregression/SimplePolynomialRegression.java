/*
* AUTOR = Victor Manuel Iñiguez Mercado
* TRABAJO = Hands-on9
*/
package practica.polynomialregression;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SimplePolynomialRegression extends Agent{
    
        
    @Override
    protected void setup(){
        System.out.println("Inicio del agente " + getLocalName());
        addBehaviour(new MyOneShotBehaviour());
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("-Agente en accion-");
        SPR Benetton = new SPR();
        Benetton.Metodo();
    } 
    
    @Override
    public int onEnd() {
      System.out.println("-Agente muriendo-");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  } 
    
}
