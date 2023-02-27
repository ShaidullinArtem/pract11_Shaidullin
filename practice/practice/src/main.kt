

fun main() {
    // days enum

    println(Days.values().asList())

    val monday = Days.MONDAY;
    println(monday.title())
    println(monday.ordinal)
    println(monday.toUpper())
    println(monday.toLower())
    println(monday.revers())

    val tuesday = Days.TUESDAY;
    println(tuesday.title())
    println(tuesday.ordinal)
    println(tuesday.toUpper())
    println(tuesday.toLower())
    println(tuesday.revers())

    val wednesday = Days.WEDNESDAY;
    println(wednesday.title())
    println(wednesday.ordinal)
    println(wednesday.toUpper())
    println(wednesday.toLower())
    println(wednesday.revers())

    val thursday = Days.THURSDAY;
    println(thursday.title())
    println(thursday.ordinal)
    println(thursday.toUpper())
    println(thursday.toLower())
    println(thursday.revers())

    val friday = Days.FRIDAY;
    println(friday.title())
    println(friday.ordinal)
    println(friday.toUpper())
    println(friday.toLower())
    println(friday.revers())

    val saturday = Days.SATURDAY;
    println(saturday.title())
    println(saturday.ordinal)
    println(saturday.toUpper())
    println(saturday.toLower())
    println(saturday.revers())

    val sunday = Days.SUNDAY;
    println(sunday.title())
    println(sunday.ordinal)
    println(sunday.toUpper())
    println(sunday.toLower())
    println(sunday.revers())

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