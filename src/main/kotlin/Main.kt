fun main(){
    var calling = Car("Model p","Ranger","Mustard",6)
    println(calling.calculateParkingFees(arrayOf(30)))
    calling.carry(6)
    calling.identity("Mustard","model B")

    var coming = Bus("model x","Supermetro","peach",40)
    println(coming.maxTripFare(500.50))
    println(coming.calculateParkingFees(90.80))
    coming.carry(62)
    coming.identity("yellow","model p")

}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
open class Journey(var model: String,var make: String,var color: String,var capacity: Int){
    fun carry(people: Int){
        if(people.equals(capacity)){
            println("Carrying $people passengers")
        }
        else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }

    fun identity(color: String,model: String){
        println("I am a $color $model")
    }
}
class Car(model: String,make: String,color: String,capacity: Int):Journey(model,make,color,capacity){
    fun calculateParkingFees(hours: Array<Int>): Int{
        var number = 20
        hours.forEach{hours -> number*=hours}
        return number

    }
}

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class Bus(model: String,make: String,color: String,capacity: Int): Journey(model,make,color,capacity){
    fun maxTripFare(fare: Double) : Double{
        var t = (fare * capacity)
        return (t)
    }

    fun calculateParkingFees(fare: Double):Double{
       var pin = fare * capacity
        return pin

    }
}