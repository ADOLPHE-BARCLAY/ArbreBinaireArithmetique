package Projet;



public class Noeud {
  protected Noeud succ;
  protected Noeud prec;
  protected Object info;
  public Noeud(Object e) {
    info=e;
  }
  public Noeud(Object e,Noeud s,Noeud p){
    info=e;
    succ=s;
    prec=p;
  }
}
