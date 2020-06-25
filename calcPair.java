 public class calcPair {

    // Declarations
    private String _operator;
    private double _number;

    public calcPair(String operator, String number)
    {
        _operator = operator;
        _number = Double.parseDouble(number);
    }

    public String GetOperator()
    {
        return _operator;
    }

    public double GetNumber()
    {
        return _number;
    }
}

