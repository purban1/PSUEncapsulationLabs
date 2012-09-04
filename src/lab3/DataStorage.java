/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Patrick
 */
public class DataStorage {
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    private int emptyRow;

    /**
     * @return the partNums
     */
    public String getPartNums(int ArrayNumber) {
        return partNums[ArrayNumber];
    }

    /**
     * return the length of the array
     */
    public int getArrayLength(){
        return partNums.length;
    }
    
    /**
     * @param partNums the partNums to set
     */
    public void setPartNums(String partNums) {
        this.partNums[this.getEmptyRow()] = partNums;
    }

    /**
     * @return the partDescs
     */
    public String getPartDescs(int ArrayNumber) {
        return partDescs[ArrayNumber];
    }

    /**
     * @param partDescs the partDescs to set
     */
    public void setPartDescs(String partDescs) {
        this.partDescs[this.getEmptyRow()] = partDescs;
    }

    /**
     * @return the partPrices
     */
    public double getPartPrices(int ArrayNumber) {
        return partPrices[ArrayNumber];
    }

    /**
     * @param partPrices the partPrices to set
     */
    public void setPartPrices(double partPrices) {
        this.partPrices[this.getEmptyRow()] = partPrices;
    }

    /**
     * @return the emptyRow
     */
    public int getEmptyRow() {
        return emptyRow;
    }

    /**
     * @param emptyRow the emptyRow to set
     */
    public void setEmptyRow(int emptyRow) {
        this.emptyRow = emptyRow;
    }
    
    public void incrementArrayValue(){
        emptyRow++;
    }
    
    public void updatePartNumbers(int arrayNumber, String partNum){
        this.partNums[arrayNumber] = partNum;
    }
    
    public void updatePartDescription(int arrayNumber, String partDesc){
        this.partDescs[arrayNumber] = partDesc;
    }
    
    public void updatePartPrice(int arrayNumber, double partPrice){
        this.partPrices[arrayNumber] = partPrice;
    }
    
    public void sortTheData(){
        // Bubble sort routine adapted from sample in text book...
        // Make sure the operations are peformed on all 3 arrays!
        for(int passNum = 1; passNum < this.emptyRow; passNum++) {
            for(int i = 1; i <= this.emptyRow-passNum; i++) {
               String temp = "";
                temp += partPrices[i - 1];
                partPrices[i - 1] = partPrices[i];
                partPrices[i] = Double.parseDouble(temp);

                temp = partNums[i - 1];
                partNums[i - 1] = partNums[i];
                partNums[i] = temp;

                temp = partDescs[i - 1];
                partDescs[i - 1] = partDescs[i];
                partDescs[i] = temp;
                }
        }
    }
}
