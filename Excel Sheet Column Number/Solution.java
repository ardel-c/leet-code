class Solution {
    public int titleToNumber(String columnTitle) {
        
        int columnNumber = 0;
        int columnLength = columnTitle.length();
        
        for (int i=0; i < columnLength; i++){
            int charNum = (int) columnTitle.charAt(i) - 64;
            int factor = columnLength-i-1;
            columnNumber = columnNumber + (charNum * (int) Math.pow(26, factor)); 
        }
        return columnNumber;
    }
}
