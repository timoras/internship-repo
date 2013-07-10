package lt.timoras.toDo;

import java.util.LinkedList;

public class OperationsWithRomanNumbersList {

    public static LinkedList<String> getLinkedListWithRomanNumbers(){
        LinkedList<String> romanNumbers = new LinkedList<String>();
        romanNumbers.add(ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(1));
        return romanNumbers;
    }


}