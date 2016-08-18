package me.recontact.games.romannumber;

public class Tuple {

        String roman;

        int number;

        Tuple(String roman, int number) {
            this.roman = roman;
            this.number = number;
        }

        void decrementNumber(int decrement) {
            this.number -= decrement;
        }

        void addToNumber(int value) {
            this.number += value;
        }

        void addResults(String letter) {
            this.roman += letter;
        }

        int getNumber() {
            return number;
        }

        void setRoman(String roman) {
            this.roman = roman;
        }

        String getRoman() {
            return roman;
        }
    }

