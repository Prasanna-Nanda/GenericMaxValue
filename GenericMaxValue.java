
package com.javaprogram.GenericMaxValue;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GenericMaxValueTest<E> {
    @Test
    public void genericsOfThreeOperaations() {
        Integer expectedInteger=3;
        Float expectedFloat=3.3f;
        String expectedString="Zebra";

        Integer genericFirstInteger=1;
        Integer genericSecondInteger=2;
        Integer genericThirdInteger=3;

        Float genericFirstFloat=1.1f;
        Float genericSecondFloat=2.2f;
        Float genericThirdFloat=3.3f;

        String genericFirstString="Cat";
        String genericSecondString="Lion";
        String genericThirdString="Zebra";

        GenericMaxValue<Number> genericMaxValue= new GenericMaxValue<>(genericFirstInteger,genericSecondInteger,genericThirdInteger);
        E firstResult =(E) genericMaxValue.threeDifferentValues(genericFirstInteger,genericSecondInteger,genericThirdInteger);

        GenericMaxValue<Float> genericMaxValue1=new GenericMaxValue<Float>(genericFirstFloat,genericSecondFloat,genericThirdFloat);
        E secondResult =(E) genericMaxValue1.threeDifferentValues(genericFirstFloat,genericSecondFloat,genericThirdFloat);

        GenericMaxValue<Number> genericMaxValue2 = new GenericMaxValue<>(genericFirstString, genericSecondString, genericThirdString);
        E thirdResult=(E) genericMaxValue2.threeDifferentValues(genericFirstString,genericSecondString,genericThirdString);

        assertEquals(firstResult,expectedInteger);
        assertEquals(secondResult,expectedFloat);
        assertEquals(thirdResult,expectedString);
    }
}
