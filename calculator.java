
// its not perfect but its working
import java.util.Scanner;


class calc {
    private double total;
    private String[] eqn;
    private Scanner scanner;



    calc() {
        scanner = new Scanner(System.in);
        //begin is unsplit eqn
        String begin;
        begin = "";

        System.out.println("Please enter the equation ");
        if (scanner.hasNextLine() == true ) {
            begin = scanner.nextLine();
            
            parsar p = new parsar();
            
            p.parse(begin);
            // we want total pairs here
            int numOfPair = 0;
            // FIXED line 28 nullpoiterexception error e.g. not assigned 
            numOfPair = p.getNumPairs();
            System.out.println(numOfPair);
            int i = 1;
            String op = "e";
            while (i <= numOfPair){
                op = p.GetOperator(i-1);
                i = i+1;
                switch(op)
                //dont question the i logic here but it just WORKS
                    {
                        case "a": 
                            total = total + p.GetNumber(i-2);
                            break;

                        case "s":
                            total = total - p.GetNumber(i-2);
                            break;

                        case "d":
                            total = total / p.GetNumber(i-2);
                            break;

                        case "m":
                            total = total * p.GetNumber(i-2);
                            break;
                        case "e":
                        break;

                    }
            }
            System.out.println(total);
        }
            
    }






















            // need to convert from string to double
//            total = eqn[0];
//            pair c = new pair(eqn);
                // see how many arrys are in eqn
                //loop for that many times
                // checking if it has an operator 
                //if it has an operator you want to do whatever that is with the next string of numbers
                // if it spilits on operatr would 5+3 give you two strings "5" ans "+3" or "5" "+" "3"?
                //assuming its "5" "+" "3"
                //you want to do eqn[i +1](where i is how many times youve gone arund the loop so you get the value in the array which follows the operator)
                // then repeat 
                // when checked the whole array output the total
                //ignore BODMAS for now
        
    
/*
        public boolean operator(){
            System.out.println("Please enter the interger corresponding to the desired operator(+, -, /, x, E) ");
            if (scanner.hasNextLine() == true)
            {
                operator = scanner.nextLine();


                switch(operator)
                {
                    case "+": 
                        add();
                        break;

                    case "-":
                        subtract();
                        break;

                    case "/":
                        divide();
                        break;

                    case "x":
                        multiply();
                        break;

                    case "E":
                        return true;
                }
            }
            
            return false;
            
        }

    
    public double getInput(){
        double number;
        number = 0;
        System.out.println("enter the number you would like to " + operator + "");
        if (scanner.hasNextDouble() == true )
        number = scanner.nextDouble();
        return number;
    }

    public void add(){
        total = total + getInput();

    }
    public void subtract (){
        total = total - getInput();
    }

    public void divide (){  
        total = total/ getInput();
    }
    public void multiply (){
        total = total * getInput();
    }
    public double show (){
        return total;
    }

*/
    public static void main(String[] args)
    {
        calc calculator = new calc();
}
}