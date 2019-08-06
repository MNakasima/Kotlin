import java.util.*

fun main() {

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val currentMonth = Calendar.getInstance().get(Calendar.MONTH)
    val age:Int

    println("Enter your date of birth")
    val yearOfBirth = readLine()!!.toInt()

    if(yearOfBirth  > currentYear){
        print("Year of birth is greater than the current year")
        return
    }

    println("Enter your month of birth (in number): \n1 January" +
            "\n2 February" +
            "\n3 March" +
            "\n4 April" +
            "\n5 May" +
            "\n6 June" +
            "\n7 July" +
            "\n8 August" +
            "\n9 September" +
            "\n10 October" +
            "\n11 November" +
            "\n12 December")
    val monthOfBirth = readLine()!!.toInt()

    if(monthOfBirth > 12 ){
        print("Month of birth does not exist")
        return
    }

    age = if(monthOfBirth >= currentMonth){
            currentYear-yearOfBirth-1
         }else{
            currentYear-yearOfBirth
         }

    print("You are $age years old")

}