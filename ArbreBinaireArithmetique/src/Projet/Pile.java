package Projet;


public interface Pile
        {
        public void d�piler() throws PileVideException;
        public void empiler(Object e) throws PileSatur�eException, TypeIncompatibleException;
        public Object sommet() throws PileVideException;
        public boolean vide ();
        public boolean satur�e();
        public void effacer ();
        public void afficher();
          public Pile Copie();
          public boolean equals(Pile P);
        }
