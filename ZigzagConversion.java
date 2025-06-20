public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {

        String[][] rows = new String[numRows][numRows];

        for(int i=0; i<numRows; i++){
            for(int j=0; j<numRows; j++){
                
                rows[i][j] = s.charAt(j);
            }
        }
        
        return "";
    }
}
