package com.company.AdikaIndustries;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Madács", 12, 25);






	    //theatre.getSeats();
    /*if(theatre.reserveSeat("C05")){
        System.out.println("Please pay");
    }else {
        System.out.println("this seat is taken");
    }
    if(theatre.reserveSeat("C05")){
        System.out.println("Please pay");
    }else {
        System.out.println("this seat is taken");
    }*/
    //List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
    //printList(seatCopy);
    //seatCopy.get(1).reserve();







        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        }else {
            System.out.println("this seat is taken");
        }
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        }else {
            System.out.println("this seat is taken");
        }
        List<Theatre.Seat> reverse = new ArrayList<>(theatre.seats);
        Collections.reverse(reverse);
        printList(reverse);






        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.seats);
        priceSeat.add(theatre.new Seat("B00", 13.00));
        priceSeat.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        printList(priceSeat);



       /* Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(maxSeat.getSeatNumber());
        System.out.println(minSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList, theatre.seats );*/
    }










    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber()+ " " + seat.getPrice());

        }
        System.out.println();
        System.out.println("=================================");
    }













    /*public static void sortList(List<? extends Theatre.Seat> list){
        for (int i= 0 ;i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i,j);
                }
            }
        }
    }*/
}
