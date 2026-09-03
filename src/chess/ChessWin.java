package chess;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ChessWin extends JFrame {
/**
	 * 
	 */
	private  JLabel [][]lab;
	private static final long serialVersionUID = 1L;

	public JLabel[][] getLab() {
		return lab;
	}

	public void setLab(JLabel[][] lab) {
		this.lab = lab;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



ChessWin(Case tab[][]) throws IOException{
	setSize(400, 400);
	setTitle("Chess Bayes");
	Container contain = getContentPane();
    JPanel cadre = new JPanel(new GridLayout(8,8));
    lab=new JLabel[8][8];
   
    
    for(int i =0;i<8;++i)
    	for(int j=0; j<8; ++j){
    		lab[i][j]= new JLabel();
    		lab[i][j].setIcon(new ImageIcon(tab[i][j].getFigure().getFile()));
    		cadre.add(lab[i][j]);
    	}
   	  
   	contain.add(cadre);
	}
}
