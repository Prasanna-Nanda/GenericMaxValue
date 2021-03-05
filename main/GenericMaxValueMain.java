public class GenericMaxValue <E>{

    E first, second,third;
    public GenericMaxValue( E genericFirst, E genericSecond, E genericThird)
    {
        this.first=genericFirst;
        this.second=genericSecond;
        this.third=genericThird;
    }
    public <E extends Comparable<E>> E threeDifferentValues(E genericFirstValue, E genericSecondValue, E genericThirdValue)
    {
        E maxEValue = genericFirstValue;
        if(genericSecondValue.compareTo(maxEValue) > 0)
        {
            genericFirstValue=genericSecondValue;
        }

        if(genericThirdValue.compareTo(maxEValue) > 0 )
        {
            genericFirstValue=genericThirdValue;
        }
        return genericFirstValue;
    }
}
