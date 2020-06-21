import java.util.Scanner;
class calc {

    private double total;
    private String operator;
    private Scanner scanner;



        calc() {
        scanner = new Scanner(System.in);
        double begin;
        begin = 0;
        System.out.println("Please enter the number you would like to start with. ");
        if (scanner.hasNextDouble() == true ) 
            begin = scanner.nextDouble();
        total = begin;
       
        }

        public boolean operator(){
            operator = "";

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


    public static void main(String[] args)
    {
        calc calculator = new calc();
        while (true)
        {
            boolean exitNow = calculator.operator();
            System.out.println("Total = " + calculator.show());
            
            if (exitNow == true)
                break;
        }
    }
}
