
public class parsar {

    private double _firstValue;
    private calcPair[] _CalcPairs;


    public void parse(String line){
        String[] eqn;
        line.strip();
            //eqn = line.split("a" + "s" + "m" + "d");
            eqn = line.split("((?<=a)|(?=a)|(?<=s)|(?=s)|(?<=m)|(?=m)|(?<=d)|(?=d))");

        // Calculaute _firstValue
        _firstValue = Double.parseDouble(eqn[0]) ;
        
        // Make array to hold pairs
        int numEntriesInLine = eqn.length;
        int numPairsInLine = (numEntriesInLine-1 )/ 2;
        // we need to output the numPairsInLine i beleive
        _CalcPairs = new calcPair[numPairsInLine];
        

        /* have a loop here */
        for(int i=0; i<numPairsInLine; ++i)
        {
            int operatorIndex = 1 + (i*2);
            int valueIndex = operatorIndex + 1;

            calcPair newPair = new calcPair(eqn[operatorIndex], eqn[valueIndex]);
            _CalcPairs[i] = newPair;
        }
            return;

    }
    public int getNumPairs(){
        return _CalcPairs.length;

    }





    public String GetOperator(int pairIndex)
    {
        // Should we check that the index is valid?

        return _CalcPairs[pairIndex].GetOperator();
    }

    public double GetNumber(int pairIndex)
    {

        return _CalcPairs[pairIndex].GetNumber();
    }
    }