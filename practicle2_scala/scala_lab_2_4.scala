object scala_lab_2_4{

def attendees(ticketPrice:Int):Int=120+((15-ticketPrice)*(20/5));

def revenue(ticketPrice:Int):Int=attendees(ticketPrice)*ticketPrice;

def cost(ticketPrice:Int):Int=500+attendees(ticketPrice)*3;

def profit(ticketPrice:Int):Int=revenue(ticketPrice)-cost(ticketPrice);

def main(args: Array[String])={
    println("Profit for ticket price with Rs.5 : " + profit(5));
    println("Profit for ticket price with Rs.10 : " + profit(10));
    println("Profit for ticket price with Rs.15 : " + profit(15));
    println("Profit for ticket price with Rs.20 : " + profit(20));
    println("Profit for ticket price with Rs.25 : " + profit(25));
    println("Profit for ticket price with Rs.30 : " + profit(30));
    println("Profit for ticket price with Rs.35 : " + profit(35));
    println("Profit for ticket price with Rs.40 : " + profit(40));
}
}
