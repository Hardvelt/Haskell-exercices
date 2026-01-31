object Bob {
    fun hey(input: String): String {
        var msg: String = when {
            input.isBlank() -> "Fine. Be that way!";
            (input.last() == '?' && input == input.uppercase() && input.contains(Regex("[a-zA-Z]"))) -> "Calm down, I know what I'm doing!";
            (input.contains(Regex("\\?\\s*$"))) -> "Sure.";
            (input.last() != '?' && input == input.uppercase() && input.contains(Regex("[a-zA-Z]"))) -> "Whoa, chill out!";
            else -> "Whatever.";
        }
        return msg;
    }
}
