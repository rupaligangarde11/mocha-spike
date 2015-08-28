package main.probability;

public class Event {
    Probability probability;
    Event(double favorableEvent,double totalPossibleEvents){
        probability=new Probability(favorableEvent,totalPossibleEvents);
    }
}
