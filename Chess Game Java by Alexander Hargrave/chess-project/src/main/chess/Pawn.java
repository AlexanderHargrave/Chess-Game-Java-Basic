package chess;

public class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
        if (Board.getPiece(i0, j0).getColour()==PieceColour.WHITE){
            if (Board.hasPiece(i1,j1)==true){
                if ((j1-j0==1 || j0-j1 == 1) && (i0-i1==1 && Board.getPiece(i1,j1).getColour()==PieceColour.BLACK)){
                    return true;
                }
                else{
                    return false;
                }
            }
		    else if((i0-i1==1 && j1 - j0 == 0) || (i0 == 6 && i0 - i1 <= 2 && j1-j0 ==0)){
                if((Board.hasPiece(i1,j1)== false && i0-i1==1) || (i0-i1 == 2 && Board.hasPiece(i1,j1)==false && Board.hasPiece(i1+1,j1)==false)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            if (Board.hasPiece(i1,j1)==true)	{
                if ((j1-j0==1 || j0-j1 == 1) && (i1-i0==1 && Board.getPiece(i1,j1).getColour()==PieceColour.WHITE)){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if((i1-i0==1 && j1 - j0 == 0) || (i0 == 1 && i1 - i0 <= 2 && j1-j0 == 0)){
                if((Board.hasPiece(i1,j1)== false && i1-i0 == 1) || (i1-i0 == 2 && Board.hasPiece(i1,j1)==false && Board.hasPiece(i1-1,j1)==false)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
