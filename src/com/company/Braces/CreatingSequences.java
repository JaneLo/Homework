package com.company.Braces;

/**
 * Created by Admin on 22.12.2015.
 */
public class CreatingSequences {
    private int NumberOfBraces;
    private int CounterOpen;
    private int CounterClose;
    private int ResultString;

    public void SetNumberOfBraces(int Quantity){
        this.NumberOfBraces = Quantity;
    }

    public int GetNumberOfBraces(){
        return NumberOfBraces;
    }

    private void CreateSequence(int CounterOpen, int CounterClose, String ResultString){
        if (this.NumberOfBraces == (CounterOpen+CounterClose)/2) {
            System.out.println(ResultString);
            return;
        }

        if (CounterOpen<this.NumberOfBraces) {
            CreateSequence(CounterOpen+1, CounterClose, ResultString+"{");
        }

        if (CounterClose<CounterOpen){
            CreateSequence(CounterOpen, CounterClose+1, ResultString+"}");
        }

    }

    public void StartPrinting(){
        CreateSequence(0,0,"");
    }
}
