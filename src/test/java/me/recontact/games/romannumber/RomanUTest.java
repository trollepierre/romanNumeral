package me.recontact.games.romannumber;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class RomanUTest {
    @Test
    public void convert_shouldAnswerRomanConvertion() {
        // Then
        assertThat(Roman.convert(1)).isEqualTo("I");
        assertThat(Roman.convert(2)).isEqualTo("II");
        assertThat(Roman.convert(3)).isEqualTo("III");
        assertThat(Roman.convert(4)).isEqualTo("IV");
        assertThat(Roman.convert(5)).isEqualTo("V");
        assertThat(Roman.convert(6)).isEqualTo("VI");
        assertThat(Roman.convert(9)).isEqualTo("IX");
        assertThat(Roman.convert(10)).isEqualTo("X");
        assertThat(Roman.convert(14)).isEqualTo("XIV");
        assertThat(Roman.convert(19)).isEqualTo("XIX");
        assertThat(Roman.convert(40)).isEqualTo("XL");
        assertThat(Roman.convert(41)).isEqualTo("XLI");
        assertThat(Roman.convert(42)).isEqualTo("XLII");
        assertThat(Roman.convert(43)).isEqualTo("XLIII");
        assertThat(Roman.convert(44)).isEqualTo("XLIV");
        assertThat(Roman.convert(45)).isEqualTo("XLV");
        assertThat(Roman.convert(46)).isEqualTo("XLVI");
        assertThat(Roman.convert(47)).isEqualTo("XLVII");
        assertThat(Roman.convert(48)).isEqualTo("XLVIII");
        assertThat(Roman.convert(49)).isEqualTo("XLIX");
        assertThat(Roman.convert(50)).isEqualTo("L");
        assertThat(Roman.convert(90)).isEqualTo("XC");
        assertThat(Roman.convert(99)).isEqualTo("XCIX");
        assertThat(Roman.convert(100)).isEqualTo("C");
        assertThat(Roman.convert(500)).isEqualTo("D");
        assertThat(Roman.convert(900)).isEqualTo("CM");
        assertThat(Roman.convert(999)).isEqualTo("CMXCIX");
        assertThat(Roman.convert(1000)).isEqualTo("M");
        assertThat(Roman.convert(1743)).isEqualTo("MDCCXLIII");
    }
}
