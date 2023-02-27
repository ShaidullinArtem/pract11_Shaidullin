

enum class Days {
    MONDAY {
        override fun title() = "Понедельник";
        override val day =  1;
        override fun weekend() = false;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    TUESDAY {
        override fun title() = "Вторник";
        override val day =  2;
        override fun weekend() = false;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    WEDNESDAY {
        override fun title() = "Среда";
        override val day =  3;
        override fun weekend() = false;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    THURSDAY {
        override fun title() = "Четврег";
        override val day =  4;
        override fun weekend() = false;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    FRIDAY {
        override fun title() = "Пятница";
        override val day =  5;
        override fun weekend() = false;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    SATURDAY {
        override fun title() = "Суббота";
        override val day =  6;
        override fun weekend() = true;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    },
    SUNDAY {
        override fun title() = "Воскресенье";
        override val day =  7;
        override fun weekend() = true;
        override fun toUpper() = title().toUpperCase();
        override fun toLower() = title().toLowerCase();
        override fun revers() = title().reversed();
    };

    abstract fun title(): String;
    abstract val day: Int;

    abstract fun weekend(): Boolean;
    abstract fun toUpper(): String;
    abstract fun toLower(): String;
    abstract fun revers(): String;
}