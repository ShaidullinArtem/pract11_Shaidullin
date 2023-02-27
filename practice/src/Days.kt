

enum class Days {
    MONDAY {
        override fun title() = "Понедельник";
        override val day =  1;
    },
    TUESDAY {
        override fun title() = "Вторник";
        override val day =  2;
    },
    WEDNESDAY {
        override fun title() = "Среда";
        override val day =  3;
    },
    THURSDAY {
        override fun title() = "Четврег";
        override val day =  4;
    },
    FRIDAY {
        override fun title() = "Пятница";
        override val day =  5;
    },
    SATURDAY {
        override fun title() = "Суббота";
        override val day =  6;
    },
    SUNDAY {
        override fun title() = "Воскресенье";
        override val day =  7;
    };

    abstract fun title(): String;
    abstract val day: Int;
}