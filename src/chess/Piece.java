package chess;

public class Piece {
	private int num;
	private int type;
	private boolean couleur; //couleur de la pièce
	private int pos_x, pos_y;
	private String fileprefix;
	private String file;
	
	
	public int getPos_x() {
		return pos_x;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	public String getFileprefix() {
		return fileprefix;
	}
	public void setFileprefix(String fileprefix) {
		this.fileprefix = fileprefix;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Piece(){
		num=-1;
		type=0;
		couleur=false;
		pos_x=-1;
		pos_y=-1;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public boolean getCouleur() {
		return couleur;
	}
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	
	
	
}
