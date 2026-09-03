package chess;

public class Case {
	private int num;
	private boolean couleur;//couleur de la case
	private boolean statut;
	private Piece figure;//figure actuelle
	
	public Piece getFigure() {
		return figure;
	}
	public void setFigure(Piece figure) {
		this.figure = figure;
	}
	public Case(){
	
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean getCouleur() {
		return couleur;
	}
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	public boolean getStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	
}
