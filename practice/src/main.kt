

fun main() {
    // days enum

    println(Days.values().asList())

    val monday = Days.MONDAY;
    println(monday.title())
    println(monday.ordinal)

    val tuesday = Days.TUESDAY;
    println(tuesday.title())
    println(tuesday.ordinal)

    val wednesday = Days.WEDNESDAY;
    println(wednesday.title())
    println(wednesday.ordinal)

    val thursday = Days.THURSDAY;
    println(thursday.title())
    println(thursday.ordinal)

    val friday = Days.FRIDAY;
    println(friday.title())
    println(friday.ordinal)

    val saturday = Days.SATURDAY;
    println(saturday.title())
    println(saturday.ordinal)

    val sunday = Days.SUNDAY;
    println(sunday.title())
    println(sunday.ordinal)

    // days enum end

    // colors enum

    println(Colors.values().asList())

    val red = Colors.RED
    println(red.name)
    println(red.ordinal)

    val blue = Colors.BLUE
    println(blue.name)
    println(blue.ordinal)

    val green = Colors.GREEN
    println(green.name)
    println(green.ordinal)
    // colors enum end

}