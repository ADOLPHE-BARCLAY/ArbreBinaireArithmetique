package Projet;


public class PileListeChainée extends ListeDoubleChainee implements Pile{

  public PileListeChainée(int n,Class c){
    super(n,c);
  }
  public PileListeChainée(Class c){
    super(c);
  }
  public void dépiler() throws PileVideException{
    if (vide()) throw new PileVideException();
        try { supprimer(lg); }
        catch (PositionInvalideException a)
        { System.out.println(a);}
        catch (ListeVideException a)
        { System.out.println(a);}

  }
  public void empiler(Object e) throws PileSaturéeException,
      TypeIncompatibleException{
    if ( saturée() ) throw new PileSaturéeException();
     try { insérer(lg+1,e) ;}
     catch (TypeIncompatibleException a)
    { System.out.println(a); }
    catch (ListeSatureeException a)
    { System.out.println(a); }
    catch (PositionInvalideException a)
    { System.out.println(a);}
  }
  public Object sommet() throws PileVideException{
    if (vide()) throw new PileVideException();
    Object e = null;
    try { e = récupérer(lg); }
    catch (PositionInvalideException a)
    { System.out.println(a);}
    catch (ListeVideException a)
    { System.out.println(a);}
    return e;

  }
  public boolean vide (){
    return (super.vide());
  }
  public boolean saturée(){
    return (super.saturée());
  }
  public void effacer (){
    for (int i=1; i<=lg; i++)
     {  try { supprimer(1); }
        catch (PositionInvalideException a)
        { System.out.println(a);}
        catch (ListeVideException a)
        { System.out.println(a);}  }

  }
  public void afficher(){
    super.affiche();
  }
  public Pile Copie()
  { Pile P = new PileListeChainée(max_size,typeDesEléments);

    for (int i= lg; i>=1; i--)
      try {
        P.empiler(récupérer(i));
      }
      catch (ListeVideException ex) {
      }
      catch (PositionInvalideException ex) {
      }
      catch (TypeIncompatibleException ex) {
      }
      catch (PileSaturéeException ex) {
      }


    return P;  }

  public boolean equals(Pile P){
    try {
      return (super.equals( (Liste) P));
    }
    catch (ListeVideException ex) {
      return false;
    }
    catch (TypeIncompatibleException ex) {
      return false;
    }
    catch (PositionInvalideException ex) {
      return false;
    }
  }

}
