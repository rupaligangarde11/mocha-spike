package main.probability;


public class Probability {
    private double favorableEvent;
    private double totalPossibleEvents;

    Probability(double favorableEvent, double totalPossibleEvents){
        this.favorableEvent =favorableEvent;
        this.totalPossibleEvents = totalPossibleEvents;
    }
    public double calculateProbability(){

        if(totalPossibleEvents !=0){

                return roundOff(favorableEvent / totalPossibleEvents);

        }
        else return -1;
    }
    private double roundOff(double value){
        return Math.round( value * 100.0 ) / 100.0;
    }
}


