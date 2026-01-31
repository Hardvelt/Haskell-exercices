fun reverse(input: String?): String {
    if(input.isNullOrEmpty())
        return "";
    var revInput = input.last() + reverse(input.dropLast(1));
    return revInput;
}
