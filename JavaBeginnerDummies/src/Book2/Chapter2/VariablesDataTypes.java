package Book2.Chapter2;

public class VariablesDataTypes {

    public static void main(String[] args) {
        int taxRate = 10;
        double subTotal = 100;
        double total = 1000;
        double taxAmounr = 0;

        if(taxRate>0){
            taxAmounr = subTotal*taxRate;
            total = subTotal + total;
        }
        System.out.println(taxAmounr);
    }

}
