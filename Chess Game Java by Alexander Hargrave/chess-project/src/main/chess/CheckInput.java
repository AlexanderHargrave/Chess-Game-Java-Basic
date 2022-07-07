package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
        if (input.length()==2){
            if (((Character.getNumericValue(input.charAt(0))<9) && (Character.getNumericValue(input.charAt(0)) >0)) && ((input.charAt(1) == "a".charAt(0)) || (input.charAt(1) == "b".charAt(0)) || (input.charAt(1) == "c".charAt(0)) || (input.charAt(1) == "d".charAt(0)) || (input.charAt(1) == "e".charAt(0)) || (input.charAt(1) == "f".charAt(0)) || (input.charAt(1) == "g".charAt(0)) || (input.charAt(1) == "h".charAt(0)))){
		        return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
	}
}
