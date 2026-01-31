object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if(start <= 0)
            throw IllegalArgumentException();
        return getHowLongToReachOne(start, 0);
    }

    fun getHowLongToReachOne(number: Int, iteration: Int): Int {
        if(number == 1)
            return iteration;
        if(number%2 == 0)
            return getHowLongToReachOne(number/2, iteration+1);
        else
            return getHowLongToReachOne((number*3)+1, iteration+1);
    }
}
