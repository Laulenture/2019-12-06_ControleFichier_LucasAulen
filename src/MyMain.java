import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MyMain {

	public static void main(String[] args) {
        //Nom du fichier texte d'entrée
        String nomFin =  "montexte.in.txt";
        
        try {
			//Création d'un fichier de caractères avec un BufferedWriter
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(new File(nomFin)));
			System.out.println("Création du fichier " + nomFin);
			
			//Écrit dans le fichier
			bWriter.write("Ceci est un texte de test comportant des voyelles et des consonnes, même des mots, voir des phrases.");
			System.out.println("Ecriture dans le fichier " + nomFin);
			
			//Ferme le fichier
			bWriter.close();
			System.out.println("Fermeture du fichier " + nomFin);
			
		}
		//Retourne un message d'erreur s'il y en a une
		catch (Exception e)
		{
			System.out.println("ERREUR :");
			System.out.print(e.getMessage());
		}
		try
		{
			//Créer un lecteur du fichier crée précédemment
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(nomFin)));
			System.out.println("Création lecteur pour le fichier " + nomFin);
			
			//La chaine de caractères qui recevra toutes les lignes du fichier
			String ligne;
			
			//Le lecteur de fichier affecte à ligne toutes les lignes du fichier et retourne cette chaine une fois que la fonction ReadLine retourne NULL, donc fin du fichier.
			System.out.println("Lecture du le fichier " + nomFin);
			if ((ligne=bReader.readLine())!=null)
			{
				//Calcule le nombre de voyelle et le retourne
				CalculVoyelles(ligne);
			}
			

			//Ferme le lecteur de fichier
			bReader.close(); 
			System.out.println("Fermeture dans le fichier " + nomFin);
		}	
		//Retourne un message d'erreur s'il y en a une
		catch (Exception e)
		{
			System.out.println("ERREUR :");
			System.out.print(e.getMessage());
		}
	}
	
	public static void CalculVoyelles(String ligne)
	{
		//Nom du fichier texte de sortie
        String nomFout =  "montexte.out.txt";
        
        //Initialisation des compteurs de voyelles
		int nA = 0;
		int nE = 0;
		int nI = 0;
		int nO = 0;
		int nU = 0;
		int nY = 0;
		
		System.out.println("Comptage des voyelles");
		for(int nCpt = 0; nCpt < ligne.length(); nCpt++) {
			
			switch(ligne.charAt(nCpt))
			{
			case 'a':
				nA++;
				break;
			case 'e':
				nE++;
				break;
			case 'i':
				nI++;
				break;
			case 'o':
				nO++;
				break;
			case 'u':
				nU++;
				break;
			case 'y':
				nY++;
				break;
			}
		} 
		
		try {
			//Création d'un fichier de caractères avec un BufferedWriter
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(new File(nomFout)));
			
			System.out.println("Ecriture dans le fichier " + nomFout);
			
			//Écrit dans le fichier les compteurs de variables
			bWriter.write("Nombre de A : " + nA + "\n");
			bWriter.write("Nombre de E : " + nE + "\n");
			bWriter.write("Nombre de I : " + nI + "\n");
			bWriter.write("Nombre de O : " + nO + "\n");
			bWriter.write("Nombre de U : " + nU + "\n");
			bWriter.write("Nombre de Y : " + nY + "\n");
			
			//Ferme le fichier
			bWriter.close();
			System.out.println("Fermeture dans le fichier " + nomFout);
		}
		//Retourne un message d'erreur s'il y en a une
		catch (Exception e) {
			System.out.println("ERREUR : ");
			System.out.print(e.getMessage());
		}
	}

}
