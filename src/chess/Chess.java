package chess;

public class Chess {
	private Case tableau[][]; //= new Case[8][8];
	private Piece figures[];//= new Piece[32];
	private Piece figvidV = new Piece();
	private Piece figvidB = new Piece();
	
	
	public Case[][] getTableau() {
		return tableau;
	}
	public void setTableau(Case[][] tableau) {
		this.tableau = tableau;
	}
	public Piece getFigvidB() {
		return figvidB;
	}
	public void setFigvidB(Piece figvidB) {
		this.figvidB = figvidB;
	}
	
	public Piece[] getFigures() {
		return figures;
	}
	public void setFigures(Piece[] figures) {
		this.figures = figures;
	}
	public Piece getFigvidV() {
		return figvidV;
	}
	public void setFigvidV(Piece figvidV) {
		this.figvidV = figvidV;
	}
	public Chess(){
		//1.instanciation 
		tableau=new Case[8][8];
		//2. CONSTRUIRE un TABLEAU vide
		for (int i=0;i<8;++i)
			for(int j=0;j<8;++j){
				tableau[i][j]=new Case();//constructeur case
				int num= 8*i+j;
				tableau[i][j].setNum(num);
				if((num%2==0 && num>=0 && num<7)||(num%2>0 && num>8 && num<=15)||(num%2==0 && num>=16 && num<23)||(num%2>0 && num>24 && num<=31 )|| (num%2==0 && num>=32 && num<39)|| (num%2>0 && num>40 && num<=47)|| (num%2==0 && num>=48 && num<=55) || (num%2>0 && num>=56 && num<=63)){
					tableau[i][j].setCouleur( true);//blanc
				tableau[i][j].setFigure(figvidB);
				tableau[i][j].getFigure().setFile("FondB.JPG");
				}
				else{
					tableau[i][j].setCouleur( false);//noir/vert
					tableau[i][j].setFigure(figvidV);
					tableau[i][j].getFigure().setFile("FondV.JPG");
				}
			tableau[i][j].setStatut(false);//vide
			
		}
		//3.CONSTRUIRE LES FIGURES
		figures=new Piece[32];
		for(int i=0; i<32;++i){
			figures[i]= new Piece();
			//ROI
			if(i==0 || i==16 ){
				if (i==0){
					figures[i].setCouleur(false);
					figures[i].setFileprefix("RoiNoir");
					figures[i].setPos_x(0);
					figures[i].setPos_y(3);
					
				}//if
				else {
					figures[i].setCouleur(true);
					figures[i].setFileprefix("RoiBlanc");
					figures[i].setPos_x(7);
					figures[i].setPos_y(3);
				}//else
			
			figures[i].setType(6); //roi
			figures[i].setNum(1);
			//FIN_ROI
			}
//------------------------------------------------------------------------------------------------------------
			//REINE
			if(i==1 || i==17 ){
				if (i==1){
					figures[i].setCouleur(false);
					figures[i].setFileprefix("ReineNoir");
					figures[i].setPos_x(0);
					figures[i].setPos_y(4);
				}
				else {
					figures[i].setCouleur(true);
					figures[i].setFileprefix("ReineBlanc");
					figures[i].setPos_x(7);
					figures[i].setPos_y(4);
				}
			
			figures[i].setType(5);
			figures[i].setNum(1);
			//FIN_REINE
			}
//------------------------------------------------------------------------------------------------------------	
	
//cavalier
			if(i==2 ||i==3 || i==18 || i==19 ){
				if (i==3||i==2){
					figures[i].setCouleur(false);
					if (i==2){
						figures[i].setPos_x(0);
						figures[i].setPos_y(1);
						figures[i].setFileprefix("CavalierNoir");
						figures[i].setNum(1);
					}
					else {
						figures[i].setPos_x(0);
						figures[i].setPos_y(6);
						figures[i].setFileprefix("CavalierNoir");
						figures[i].setNum(2);
					}
				}
				else {
					figures[i].setCouleur(true);
					if (i==18){
						figures[i].setPos_x(7);
						figures[i].setPos_y(1);
						figures[i].setFileprefix("CavalierBlanc");
						figures[i].setNum(1);
					}
					else {
						figures[i].setPos_x(7);
						figures[i].setPos_y(6);
						figures[i].setFileprefix("CavalierBlanc");
						figures[i].setNum(2);
					}
				}
			
			figures[i].setType(3);
			}
			//fin_cavalier
//------------------------------------------------------------------------------------------------------------		
			//Fou
//------------------------------------------------------------------------------------------------------------
						
			if (i==4||i==5||i==20||i==21) {
				
				if (i==4||i==5){
					figures[i].setCouleur(false);
					if (i==4){
						figures[i].setPos_x(0);
						figures[i].setPos_y(2);
						figures[i].setFileprefix("FouNoir");
						figures[i].setNum(1);
					}
					else {
						figures[i].setPos_x(0);
						figures[i].setPos_y(5);
						figures[i].setFileprefix("FouNoir");
						figures[i].setNum(2);
					}
				}else {
					figures[i].setCouleur(true);
					if (i==20){
						figures[i].setPos_x(7);
						figures[i].setPos_y(2);
						figures[i].setFileprefix("FouBlanc");
						figures[i].setNum(1);
					}
					else {
						figures[i].setPos_x(7);
						figures[i].setPos_y(5);
						figures[i].setFileprefix("FouBlanc");
						figures[i].setNum(2);
					}
				}
				
			figures[i].setType(4);
			}	
			
			
			
//__________________________________________fin__fou__________________________________________________________	
//----------------------------Tour----------------------------------------------------------------------------
				if (i==6||i==7||i==22||i==23) {
								
								if (i==6||i==7){
									figures[i].setCouleur(false);
									if (i==6){
										figures[i].setPos_x(0);
										figures[i].setPos_y(0);
										figures[i].setFileprefix("TourNoir");
										figures[i].setNum(1);
									}
									else {
										figures[i].setPos_x(0);
										figures[i].setPos_y(7);
										figures[i].setFileprefix("TourNoir");
										figures[i].setNum(2);
									}
								}else {
									figures[i].setCouleur(true);
									if (i==22){
										figures[i].setPos_x(7);
										figures[i].setPos_y(0);
										figures[i].setFileprefix("TourBlanc");
										figures[i].setNum(1);
									}
									else {
										figures[i].setPos_x(7);
										figures[i].setPos_y(7);
										figures[i].setFileprefix("TourBlanc");
										figures[i].setNum(2);
									}
								}
					figures[i].setType(2);
				}
			
//---------------------------------------------fin_tour-------------------------------------------------------
							
//---------------------------------------------pion------------------------------------------------------------
					if ((i<=15 && i>=8)|| (i>=24 && i<=31)) {
								
								//if (i==8||i==9||i==10||i==11||i==12||i==13||i==14||i==15){
								if(i<=15 && i>=8){
									figures[i].setCouleur(false);
									figures[i].setFileprefix("PionNoir");
									switch (i) {
									
									
												case 8 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(0);
													figures[i].setNum(1);
													};break;
												case 9 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(1);
													figures[i].setNum(2);
													};break;
												case 10 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(2);
													figures[i].setNum(3);
													};break;
												case 11 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(3);
													figures[i].setNum(4);
													};break;
												case 12 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(4);
													figures[i].setNum(5);
													};break;
												case 13 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(5);
													figures[i].setNum(6);
													};break;
												case 14 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(6);
													figures[i].setNum(7);
													};break;
												case 15 : {
													figures[i].setPos_x(1);
													figures[i].setPos_y(7);
													figures[i].setNum(8);
													};break;
												
												default: System.out.println("break");
												break;
										
													}
								}else {
									figures[i].setCouleur(true);
									figures[i].setFileprefix("PionBlanc");
									switch (i) {
									
									
											case 24 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(0);
												figures[i].setNum(1);
												};break;
											case 25 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(1);
												figures[i].setNum(2);
												};break;
											case 26 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(2);
												figures[i].setNum(3);
												};break;
											case 27 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(3);
												figures[i].setNum(4);
												};break;
											case 28 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(4);
												figures[i].setNum(5);
												};break;
											case 29 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(5);
												figures[i].setNum(6);
												};break;
											case 30 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(6);
												figures[i].setNum(7);
												};break;
											case 31 : {
												figures[i].setPos_x(6);
												figures[i].setPos_y(7);
												figures[i].setNum(8);
												};break;
											
											default: System.out.println("Erreur");
									
												}
									}
														
								figures[i].setType(1);
								
							}
//-------------------------------------------fin_pion----------------------------------------------------------
		}
		
	//==================================
	//4. Placer les pièces sur les casess	
	//==================================	
		String str = new String();
		for(int i=0; i<32;++i){
			int a= figures[i].getPos_x();
			int b= figures[i].getPos_y();
		
			if(tableau[a][b].getCouleur()==true)
				str = figures[i].getFileprefix()+"-FondB.JPG";
			else
				str = figures[i].getFileprefix()+"-FondV.JPG";
				
			figures[i].setFile(str);
			tableau[a][b].setFigure(figures[i]);
		}
		
		
	}
	
	
}
