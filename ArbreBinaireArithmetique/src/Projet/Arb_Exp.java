package Projet;


public interface Arb_Exp {
  public void Ins�rer(Comparable x)throws
      TypeIncompatibleException,ArbreSatureException;
  public void Afficher(int Ordre);
  public boolean Vide();
  public boolean Satur�();
  public int Taille();
}
