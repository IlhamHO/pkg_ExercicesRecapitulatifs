import eu.epfc.prm2.Array;

public class Programme {

    public static void tabTrieAlphab(Array<Joueur> tab){
        for(int i=0; i<tab.size();++i){
            int minIdJoueur=i;
            for(int j=i+1;j< tab.size();++j){
                if(tab.get(j).idJoueur.compareTo(tab.get(minIdJoueur).idJoueur)<0) minIdJoueur=j;
            Joueur tmp = tab.get(i);
            tab.set(i,tab.get(minIdJoueur));
            tab.set(minIdJoueur,tmp);
            }
        }
    }

    public static void tabTrieInsertion(Array<Joueur> tab, Joueur jr){
            tab.add(null);
            int j=tab.size()-1;
            while(j>0 && (jr.idJoueur.compareTo(tab.get(j-1).idJoueur))<0){
                tab.set(j,tab.get(j-1));
                --j;
            }
            tab.set(j,jr);
    }

    public static int chercher(Array<Joueur>tab, String nom){
        int pos=-1;
        for(int i=0; i< tab.size(); ++i){
            if(tab.get(i).idJoueur.compareTo(nom)==0) {
                pos=i;
            }
        }
        return pos;
    }

    public static void gestion(Array<Joueur> tab,String nom,int score){
        tab = new Array<>();
        tabTrieAlphab(tab);
        chercher(tab,nom);
        
    }

    public static void main(String[] args) {

    }
}
