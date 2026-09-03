package chess;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Chess mychess= new Chess();
		
	//	Scanner sc = new Scanner(System.in);
		System.out.println("Chess instanciE");
		//mychess.afficher();
		ChessWin fen=new ChessWin(mychess.getTableau());
		fen.setVisible(true);
		//int i=0;
		//File repertoire = new File("playcommand");
		BufferedReader entree=new BufferedReader(new FileReader("playcommand.txt"));
		String ligne=new String();
		String mot=new String();
		//Timer tim = new Timer();
     	 //int nb=0;
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;
		while (elapsedTime < 5*1000) 
		      elapsedTime = (new Date()).getTime() - startTime;
		do{
			ligne=entree.readLine();
	        if(ligne!=null){
        			StringTokenizer tok= new StringTokenizer(ligne,"\t");
        			String[] vect= new String[3];
        			
        			for(int j=0; j<3;++j){
    					mot=tok.nextToken();
    					vect[j]=mot;
        			}
	        		int pcnum =	Integer.parseInt(vect[0]);	
					int dest_x = Integer.parseInt(vect[1]);
					int dest_y = Integer.parseInt(vect[2]);
					
					//Constater la couleur de la case à la position actuelle de la figure à déplacer
					int posact_x= mychess.getFigures()[pcnum].getPos_x();
					int posact_y= mychess.getFigures()[pcnum].getPos_y();
					boolean coul_act = mychess.getTableau()[posact_x][posact_y].getCouleur();
			
					//Constater la couleur de la case de destination
					boolean coul_dest = mychess.getTableau()[dest_x][dest_y].getCouleur();
					
					//Calculer la position correspondante dans les labs
					String fond_coul=new String();
					if(coul_act==false)//si c'est false, donc couleur correspondante=fond vert, sinon fond blanc
						fond_coul= "FondV.jpg";
					else
						fond_coul= "FondB.jpg";
					
					//Si la case de destination est false (verte) la pièce doit avoir le fond vert, autrement blanc
					String suffix_coul=new String();
					if(coul_dest==false)
						suffix_coul= "-FondV.jpg";
					else
						suffix_coul= "-FondB.jpg";
					//modifier le fichier à affecter à la pièce selon le suffixe calculé
					mychess.getFigures()[pcnum].setFile(mychess.getFigures()[pcnum].getFileprefix()+suffix_coul);
					//charger la case vide (pour le fond) à la place de l'ancienne case occupée par la pièce déplacée
					fen.getLab()[posact_x][posact_y].setIcon(new ImageIcon(fond_coul));
					
					fen.getLab()[dest_x][dest_y].setIcon(new ImageIcon(mychess.getFigures()[pcnum].getFile()));
					java.awt.Toolkit.getDefaultToolkit().beep(); 
					elapsedTime=0L;
					startTime = System.currentTimeMillis();
					while (elapsedTime < 5*1000) 
		    		      elapsedTime = (new Date()).getTime() - startTime;
			       	}
		}while(true);
		
	}
}
