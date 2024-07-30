package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddAsciiValuesTest {

    @Test
    @DisplayName("Test to calculate sum of ASCII codes")
    public void addAsciiCodes() {
        AddAsciiValues values = new AddAsciiValues();

        String emptyChar = "";
        String nullChar = null;
        String oneChar = "a";
        String multipleChar = "northcoders";
        String multipleCharWithSpecChar = "northcoders!!";
        String multipleCapitalChar = "Northcoders";
        String charAndInt = "Northcoders2024";

        int nullCharResult = values.addAsciiCodes(nullChar);
        int emptyCharResult = values.addAsciiCodes(emptyChar);
        int oneCharResult = values.addAsciiCodes(oneChar);
        int multipleCharResult = values.addAsciiCodes(multipleChar);
        int multipleCharWithSpecCharResult = values.addAsciiCodes(multipleCharWithSpecChar);
        int multipleCapitalCharResult = values.addAsciiCodes(multipleCapitalChar);
        int charAndIntResult = values.addAsciiCodes(charAndInt);

        assertAll(
                () -> assertEquals(0, nullCharResult),
                () -> assertEquals(0, emptyCharResult),
                () -> assertEquals(97, oneCharResult),
                () -> assertEquals(1195, multipleCharResult),
                () -> assertEquals(1195, multipleCharWithSpecCharResult),
                () -> assertEquals(1163, multipleCapitalCharResult),
                () -> assertEquals(1363, charAndIntResult)
        );
    }
}