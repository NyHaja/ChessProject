package chess;

import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;

public class ChessTableModel extends AbstractTableModel{

		private static final long serialVersionUID = 1L;
		private final Ligne lilist[] = new Ligne[8];
		private final String[] entetes = {"A(1)", "B(2)","C(3)", "D(4)", "E(5)", "F(6)", "G(7)", "H(8)"};
		
		public ChessTableModel(Case tab[] ) throws IOException{
			//==========
			//System.out.println("file= "+tab[0].getFigure().getFile());
			for(int i=0; i<8;++i)
				lilist[i] = new Ligne();
			
			ImageIcon help = new ImageIcon(tab[0].getFigure().getFile());
			lilist[0].getA1().setIcon(help);
						
			help = new ImageIcon( tab[1].getFigure().getFile());
			lilist[0].getB2().setIcon(help);
			
			help = new ImageIcon( tab[2].getFigure().getFile());
			lilist[0].getC3().setIcon(help);
						
			help = new ImageIcon( tab[3].getFigure().getFile());
			lilist[0].getD4().setIcon(help);
			
			help = new ImageIcon( tab[4].getFigure().getFile());
			lilist[0].getE5().setIcon(help);
						 
			help = new ImageIcon( tab[5].getFigure().getFile());
			lilist[0].getF6().setIcon(help);
			
			help = new ImageIcon( tab[6].getFigure().getFile());
			lilist[0].getG7().setIcon(help);
			
			help = new ImageIcon( tab[7].getFigure().getFile());
			lilist[0].getH8().setIcon(help);
			
			//==========
			help = new ImageIcon(tab[8].getFigure().getFile());
			lilist[1].getA1().setIcon(help);
						
			help = new ImageIcon( tab[9].getFigure().getFile());
			lilist[1].getB2().setIcon(help);
			
			help = new ImageIcon( tab[10].getFigure().getFile());
			lilist[1].getC3().setIcon(help);
						
			help = new ImageIcon( tab[11].getFigure().getFile());
			lilist[1].getD4().setIcon(help);
			
			help = new ImageIcon( tab[12].getFigure().getFile());
			lilist[1].getE5().setIcon(help);
						 
			help = new ImageIcon( tab[13].getFigure().getFile());
			lilist[1].getF6().setIcon(help);
			
			help = new ImageIcon( tab[14].getFigure().getFile());
			lilist[1].getG7().setIcon(help);
			
			help = new ImageIcon( tab[15].getFigure().getFile());
			lilist[1].getH8().setIcon(help);
			
			//==========
			//fp =new File( tab[16].getFigure().getFile());
			help= new ImageIcon("FondV.JPG");
			lilist[2].getA1().setIcon(help);//16
			lilist[2].getC3().setIcon(help);//18
			lilist[2].getE5().setIcon(help);//20
			lilist[2].getG7().setIcon(help);//22
			
			lilist[3].getB2().setIcon(help);//25
			lilist[3].getD4().setIcon(help);//27
			lilist[3].getF6().setIcon(help);//29
			lilist[3].getH8().setIcon(help);//31
			
			lilist[4].getA1().setIcon(help);//32
			lilist[4].getC3().setIcon(help);//34
			lilist[4].getE5().setIcon(help);//36
			lilist[4].getG7().setIcon(help);//38
			
			lilist[5].getB2().setIcon(help);//40
			lilist[5].getD4().setIcon(help);//42
			lilist[5].getF6().setIcon(help);//44
			lilist[5].getH8().setIcon(help);//46
			
			
			//==========
			help= new ImageIcon("FondB.JPG");
			lilist[2].getB2().setIcon(help);//17
			lilist[2].getD4().setIcon(help);//19
			lilist[2].getF6().setIcon(help);//21
			lilist[2].getH8().setIcon(help);//23
			
			lilist[3].getA1().setIcon(help);//24
			lilist[3].getC3().setIcon(help);//26
			lilist[3].getE5().setIcon(help);//28
			lilist[3].getG7().setIcon(help);//30
			
			lilist[4].getB2().setIcon(help);//33
			lilist[4].getD4().setIcon(help);//35
			lilist[4].getF6().setIcon(help);//37
			lilist[4].getH8().setIcon(help);//39
			
			lilist[5].getA1().setIcon(help);//41
			lilist[5].getC3().setIcon(help);//43
			lilist[5].getE5().setIcon(help);//45
			lilist[5].getG7().setIcon(help);//47
			
			//==========
			help = new ImageIcon(tab[48].getFigure().getFile());
			lilist[6].getA1().setIcon(help);
						
			help = new ImageIcon( tab[49].getFigure().getFile());
			lilist[6].getB2().setIcon(help);
			
			help = new ImageIcon( tab[50].getFigure().getFile());
			lilist[6].getC3().setIcon(help);
						
			help = new ImageIcon( tab[51].getFigure().getFile());
			lilist[6].getD4().setIcon(help);
			
			help = new ImageIcon( tab[52].getFigure().getFile());
			lilist[6].getE5().setIcon(help);
						 
			help = new ImageIcon( tab[53].getFigure().getFile());
			lilist[6].getF6().setIcon(help);
			
			help = new ImageIcon( tab[54].getFigure().getFile());
			lilist[6].getG7().setIcon(help);
			
			help = new ImageIcon( tab[55].getFigure().getFile());
			lilist[6].getH8().setIcon(help);
			
			//==========
			help = new ImageIcon(tab[56].getFigure().getFile());
			lilist[7].getA1().setIcon(help);
						
			help = new ImageIcon( tab[57].getFigure().getFile());
			lilist[7].getB2().setIcon(help);
			
			help = new ImageIcon( tab[58].getFigure().getFile());
			lilist[7].getC3().setIcon(help);
						
			help = new ImageIcon( tab[59].getFigure().getFile());
			lilist[7].getD4().setIcon(help);
			
			help = new ImageIcon( tab[60].getFigure().getFile());
			lilist[7].getE5().setIcon(help);
						 
			help = new ImageIcon( tab[61].getFigure().getFile());
			lilist[7].getF6().setIcon(help);
			
			help = new ImageIcon( tab[62].getFigure().getFile());
			lilist[7].getG7().setIcon(help);
			
			help = new ImageIcon( tab[63].getFigure().getFile());
			lilist[7].getH8().setIcon(help);
			
			
		}
		 public Class<?> getColumnClass(int columnIndex) {
		      /*  if (columnIndex == 6 || columnIndex==7 || columnIndex==8 )
		            return Boolean.class;*/
		        //return super.getColumnClass(columnIndex);
			 return Object.class;
		    }	
		public String getColumnName(int columnIndex) {
	        return entetes[columnIndex];
	    }
		public Ligne[] getLilist() {
			return lilist;
		}

		public String[] getEntetes() {
			return entetes;
		}

		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			 switch(columnIndex){
			  	case 0:
			  		return lilist[rowIndex].getA1();
			  	case 1:
			  		return lilist[rowIndex].getB2();
			  	case 2:
			  		return lilist[rowIndex].getC3();
			  	case 3:
			  		return lilist[rowIndex].getD4();
			  	case 4:
			  		return lilist[rowIndex].getE5();
			  	case 5:
			  		return lilist[rowIndex].getF6();
			  	case 6:
			  		return lilist[rowIndex].getG7();
			  	case 7:
			  		return lilist[rowIndex].getH8();
			  	default:
			  		return null; //Ne devrait jamais arriver
			 }
			
					}

		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 8;
		}

		public int getRowCount() {
			// TODO Auto-generated method stub
			return 8;
		}
}
