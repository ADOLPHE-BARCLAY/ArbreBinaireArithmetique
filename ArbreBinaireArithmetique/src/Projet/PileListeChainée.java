package Projet;


public class PileListeChain�e extends ListeDoubleChainee implements Pile{

  public PileListeChain�e(int n,Class c){
    super(n,c);
  }
  public PileListeChain�e(Class c){
    super(c);
  }
  public void d�piler() throws PileVideException{
    if (vide()) throw new PileVideException();
        try { supprimer(lg); }
        catch (PositionInvalideException a)
        { System.out.println(a);}
        catch (ListeVideException a)
        { System.out.println(a);}

  }
  public void empiler(Object e) throws PileSatur�eException,
      TypeIncompatibleException{
    if ( satur�e() ) throw new PileSatur�eException();
     try { ins�rer(lg+1,e) ;}
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
    try { e = r�cup�rer(lg); }
    catch (PositionInvalideException a)
    { System.out.println(a);}
    catch (ListeVideException a)
    { System.out.println(a);}
    return e;

  }
  public boolean vide (){
    return (super.vide());
  }
  public boolean satur�e(){
    return (super.satur�e());
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
  { Pile P = new PileListeChain�e(max_size,typeDesEl�ments);

    for (int i= lg; i>=1; i--)
      try {
        P.empiler(r�cup�rer(i));
      }
      catch (ListeVideException ex) {
      }
      catch (PositionInvalideException ex) {
      }
      catch (TypeIncompatibleException ex) {
      }
      catch (PileSatur�eException ex) {
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
