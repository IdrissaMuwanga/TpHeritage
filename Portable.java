public class Portable extends Ordinateur{
private int tailleEcran;
private int poids;
private boolean webcam;
private boolean lecteurDVD;
//Constructeur
public Portable(String reference, String processeur, String ram, String disqueDur, String systemExploitation,
int prix,int tailleEcran, int poids, boolean webcam, boolean lecteurDVD) {
super(reference, processeur, ram, disqueDur, systemExploitation, prix);
this.tailleEcran=tailleEcran;
this.poids=poids;
this.webcam=webcam;
this.lecteurDVD=lecteurDVD;
}
//Getter et Setter
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
public boolean isLecteurDVD() {
return lecteurDVD;
}
public void setLecteurDVD(boolean lecteurDVD) {
this.lecteurDVD = lecteurDVD;
}
//methode toString()
public String toString() {
return super.toString()+" [ tailleEcran= " + tailleEcran + ", poids=" + poids + ", webcam= " + webcam + ", lecteurDVD= "
+ lecteurDVD+" ] " ;
}
}
