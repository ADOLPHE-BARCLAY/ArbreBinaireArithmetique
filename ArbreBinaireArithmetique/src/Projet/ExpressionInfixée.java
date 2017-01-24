package Projet;


public class ExpressionInfixée {
   private String ch;
   private Pile p=new PileListeChainée(java.lang.String.class);
    public ExpressionInfixée(String Expression) {
      ch=Expression;
    }
    private String Extraire(int pos,String ch){
      String res="";
      int i=pos-1;
      boolean stop=false;
      while((stop==false)&&(i>=0)){
        if(ch.charAt(i)==' '){
          stop=true;
        }else
          res=ch.charAt(i)+res;
          i--;
      }
      return res;
    }
    public String Préfixée() throws TypeIncompatibleException,
        PileSaturéeException, PileVideException {
      String r="";
      int i=ch.length();
      while(i>=0){

        if(Extraire(i,ch).equals(")")){
          p.empiler(Extraire(i,ch));
        }
        else if(Extraire(i,ch).equals("+")|Extraire(i,ch).equals("-")
                |Extraire(i,ch).equals("*")|Extraire(i,ch).equals("/")){

          p.empiler(Extraire(i,ch));

        }
        else if(this.Extraire(i,ch).equals("(")){
              while (!p.sommet().equals(")")) {
                String v = (String) p.sommet();
                if(!v.equals(")")){
                  r = v + " "+r;
                  p.dépiler();
                }

              }
              p.dépiler();
            }
            else r=this.Extraire(i,ch)+" "+r;
              i-=this.Extraire(i,ch).length()+1;
          }
          while(!p.vide()){
            String v=(String)p.sommet();
            r=v+" "+r;
            p.dépiler();
          }
          return r.substring(0,r.length()-1);
        }


  }
