package com.example.recepie.recepieapp.converters;

import com.example.recepie.recepieapp.commands.UnitOfMeasureCommand;
import com.example.recepie.recepieapp.domain.UnitOfMeasure;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class UnitOfMeasureCommandToUnitOfMeasureTest {


    private static final Long LONG_VALUE = new Long(1L);
    private String Description = "description";

    UnitOfMeasureCommandToUnitOfMeasure converter;

    @Test
    public void convert() throws Exception {

        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(LONG_VALUE);
        command.setDescription(Description);

        UnitOfMeasure uom = converter.convert(command);

        assertNotNull(uom);
        assertEquals(LONG_VALUE, uom.getId());
        assertEquals(Description, uom.getDescription());
    }
}