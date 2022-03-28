import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
ArrayList <Ordinateur> magasinOrdi = new ArrayList <Ordinateur>();
//Instanciation des differents ordinateurs
Ordinateur asus = new Ordinateur("reference 1","i7-6700","8 Go","Samsung","Windows",850);
NetBook chromebook = new NetBook("reference 2","i5-6300","8 Go","World Digital","Windows",950,15,550,true,true);
Portable lenovo = new Portable("reference 3","i5-5900","8 Go","Wolf","Windows",995,17,900,true,false);
OrdiBureau msi = new OrdiBureau("reference 4","i9-8200","16 Go","Intel","Windows",850,"Nvidia","AMD","logitech");
//ajout des differents objets dans l'array list magasinOrdi
magasinOrdi.add(asus);
magasinOrdi.add(chromebook);
magasinOrdi.add(lenovo);
magasinOrdi.add(msi);
//Boucle foreach permettant d'afficher chaque indice du tableau separemment et non sur une seule ligne
for(Ordinateur m: magasinOrdi){
System.out.println("Voici ce qu'il y a dans le magasin : ");
System.out.println("");//Pour espacer le tableau (pour que ca soit plus beau)
System.out.println("-"+m.toString());
}
}
}
