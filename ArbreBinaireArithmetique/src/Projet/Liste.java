package Projet;


public interface Liste {
  public int taille();
  public Object r�cup�rer(int pos)throws PositionInvalideException,
                                         ListeVideException;
  public void ins�rer(int pos,Object o)throws PositionInvalideException,
                                              ListeSatureeException,
                                              TypeIncompatibleException;
  public void supprimer(int pos)throws PositionInvalideException,
                                       ListeVideException;
  public boolean equals(Liste L)throws PositionInvalideException,
                                     TypeIncompatibleException,
                                     ListeVideException;
  public Liste copie();
  public boolean vide();
  public boolean satur�e();
  public void affiche();
}
