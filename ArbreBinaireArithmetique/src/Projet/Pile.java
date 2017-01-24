package Projet;


public interface Pile
        {
        public void dépiler() throws PileVideException;
        public void empiler(Object e) throws PileSaturéeException, TypeIncompatibleException;
        public Object sommet() throws PileVideException;
        public boolean vide ();
        public boolean saturée();
        public void effacer ();
        public void afficher();
          public Pile Copie();
          public boolean equals(Pile P);
        }
