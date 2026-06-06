public class NewCalculatorApp {

    public static void main (String[] args){

        boolean stop;


        NewCalculator newCalculator = new NewCalculator();

        do{
            newCalculator.start();
            stop = newCalculator.askUserToContinue();
        }while (stop);

       newCalculator.stop();




    }

}
