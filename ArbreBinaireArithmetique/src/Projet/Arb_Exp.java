package Projet;


public interface Arb_Exp {
  public void Insérer(Comparable x)throws
      TypeIncompatibleException,ArbreSatureException;
  public void Afficher(int Ordre);
  public boolean Vide();
  public boolean Saturé();
  public int Taille();
}
