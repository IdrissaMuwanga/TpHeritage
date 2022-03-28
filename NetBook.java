public class NetBook extends Ordinateur{
private int tailleEcran;
private int poids;
private boolean webcam;
private boolean lecteurCarteMemoire;
//constructeur
public NetBook(String reference, String processeur, String ram, String disqueDur, String systemExploitation,
int prix,int tailleEcran, int poids,boolean webcam,boolean lecteurCarteMemoire) {
super(reference, processeur, ram, disqueDur, systemExploitation, prix);
this.tailleEcran=tailleEcran;
this.poids=poids;
}
//Getter et setter
public int getTailleEcran() {
return tailleEcran;
}
public void setTailleEcran(int tailleEcran) {
this.tailleEcran = tailleEcran;
}
public int getPoids() {
return poids;
}
public void setPoids(int poids) {
this.poids = poids;
}
public boolean isWebcam() {
return webcam;
}
public void setWebcam(boolean webcam) {
this.webcam = webcam;
}
public boolean isLecteurCarteMemoire() {
return lecteurCarteMemoire;
}
public void setLecteurCarteMemoire(boolean lecteurCarteMemoire) {
this.lecteurCarteMemoire = lecteurCarteMemoire;
}
//methode toString()
public String toString() {
return super.toString()+"NetBook [tailleEcran=" + tailleEcran + ", poids=" + poids +" webcam= "+webcam+" lecteurCarteMemoire "+ "
] ";
}
}
