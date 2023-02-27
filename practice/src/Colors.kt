

enum class Colors {
    RED {
        override fun colorName() = "Красный";
        override val rgb = "0xFF0000";
    },
    BLUE {
        override fun colorName() = "Голубой";
        override val rgb = "0x0000FF";
    },
    GREEN {
        override fun colorName() = "Зелёный";
        override val rgb = "0x00FF00";
    };
    abstract fun colorName(): String
    abstract val rgb: String
}