package chess;

public class Bishop extends Piece{
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♗";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♝";
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
            if (i0-i1 == j0 - j1 || i1-i0 == j0-j1){
                if (i0 > i1 && j0 > j1){
                    for (int i = 1; i < i0-i1; i++){
                        if (Board.hasPiece(i0-i,j0-i)==true){
                            return false;
                        }
                    }
                }else if (i0>i1 && j1 > j0){
                    for (int i = 1; i < i0-i1; i++){
                        if (Board.hasPiece(i0-i,j0+i)==true){
                            return false;
                        }
                    }
                }else if (i1>i0 && j0 > j1){
                    for (int i = 1; i < i1-i0; i++){
                       if (Board.hasPiece(i0+i,j0-i)==true){
                           return false;
                        }
                    }
                }else if (i1 > i0 && j1> j0){
                    for (int i = 1; i < i1-i0; i++){
                        if (Board.hasPiece(i0+i,j0+i)==true){
                            return false;
                        }
                    }
                }else{
                    return false;
                }if (Board.hasPiece(i1,j1)==true){
                    if (Board.getPiece(i1,j1).getColour()==PieceColour.BLACK){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }else{
            if (i0-i1 == j0 - j1 || i1-i0 == j0-j1){
                if (i0 > i1 && j0 > j1){
                    for (int i = 1; i < i0-i1; i++){
                        if (Board.hasPiece(i0-i,j0-i)==true){
                            return false;
                        }
                    }
                }else if (i0>i1 && j1 > j0){
                    for (int i = 1; i < i0-i1; i++){
                        if (Board.hasPiece(i0-i,j0+i)==true){
                            return false;
                        }
                    }
                }else if (i1>i0 && j0 > j1){
                    for (int i = 1; i < i1-i0; i++){
                       if (Board.hasPiece(i0+i,j0-i)==true){
                           return false;
                        }
                    }
                }else if (i1 > i0 && j1> j0){
                    for (int i = 1; i < i1-i0; i++){
                        if (Board.hasPiece(i0+i,j0+i)==true){
                            return false;
                        }
                    }
                }else{
                    return false;
                }if (Board.hasPiece(i1,j1)==true){
                    if (Board.getPiece(i1,j1).getColour()==PieceColour.WHITE){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }
	}
}