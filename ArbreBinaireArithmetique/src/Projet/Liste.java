package Projet;


public interface Liste {
  public int taille();
  public Object récupérer(int pos)throws PositionInvalideException,
                                         ListeVideException;
  public void insérer(int pos,Object o)throws PositionInvalideException,
                                              ListeSatureeException,
                                              TypeIncompatibleException;
  public void supprimer(int pos)throws PositionInvalideException,
                                       ListeVideException;
  public boolean equals(Liste L)throws PositionInvalideException,
                                     TypeIncompatibleException,
                                     ListeVideException;
  public Liste copie();
  public boolean vide();
  public boolean saturée();
  public void affiche();
}
