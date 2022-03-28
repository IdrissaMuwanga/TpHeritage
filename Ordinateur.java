public class Ordinateur {
protected String reference;
private String processeur;
private String ram;
private String disqueDur;
private String systemExploitation;
private int prix;
//Constructeur
public Ordinateur(String reference,String processeur,String ram,String disqueDur, String systemExploitation,int prix){
this.reference=reference;
this.processeur=processeur;
this.ram=ram;
this.disqueDur=disqueDur;
this.systemExploitation=systemExploitation;
this.prix=prix;
}
//Getter et Setter
public String getReference() {
return reference;	
}
public void setReference(String reference) {
this.reference = reference;
}
public String getProcesseur() {
return processeur;
}
public void setProcesseur(String processeur) {
this.processeur = processeur;
}
public String getRam() {
return ram;
}
public void setRam(String ram) {
this.ram = ram;
}
public String getDisqueDur() {
return disqueDur;
}
public void setDisqueDur(String disqueDur) {
this.disqueDur = disqueDur;
}
public String getSystemeExploitation() {
return systemExploitation;
}
public void setSystemeExploitation(String systemeExploitation) {
this.systemExploitation = systemeExploitation;
}
public int getPrix() {
return prix;
}
public void setPrix(int prix) {
this.prix = prix;
}
//methode toString()
public String toString() {
return " reference= " + reference + ", processeur= " + processeur + ", ram= " + ram + ", disqueDur= "
+ disqueDur + ", systemeExploitation= " + systemExploitation + ", prix= " + prix;
}
}
