package me.recontact.games.romannumber;


class Roman {

    protected static String convert(int number) {
        Tuple resultInTuple = new Tuple("", number);
        assignLetterssWhenNeeded(resultInTuple, new Tuple("M", 1000), 100);
        assignLetterssWhenNeeded(resultInTuple, new Tuple("D", 500), 100);
        inverseLettersWhenNeeded(resultInTuple, new Tuple("C", 100));
        assignLetterssWhenNeeded(resultInTuple, new Tuple("C", 100), 10);
        assignLetterssWhenNeeded(resultInTuple, new Tuple("L", 50), 10);
        inverseLettersWhenNeeded(resultInTuple, new Tuple("X", 10));
        assignLetterssWhenNeeded(resultInTuple, new Tuple("X", 10), 1);
        assignLetterssWhenNeeded(resultInTuple, new Tuple("V", 5), 1);
        inverseLettersWhenNeeded(resultInTuple, new Tuple("I", 1));
        assignLetterssWhenNeeded(resultInTuple, new Tuple("I", 1), 0);
        return resultInTuple.getRoman();
    }

    private static void assignLetterssWhenNeeded(Tuple tuple, Tuple romanTuple, int precision) {
        while (tuple.getNumber() >= romanTuple.getNumber() - precision) {
            tuple.addResults(romanTuple.getRoman());
            tuple.decrementNumber(romanTuple.getNumber());
        }
    }

    private static void inverseLettersWhenNeeded(Tuple tuple, Tuple tupleToInverse) {
        while (tuple.getNumber() < 0) {
            insertLetterInRomanResult(tuple, tupleToInverse);
        }
    }

    private static void insertLetterInRomanResult(Tuple tuple, Tuple tupleToInverse) {
        int length = tuple.getRoman().length();
        String prefix = tuple.getRoman().substring(0, length - 1);
        String lastLetter = tuple.getRoman().substring(length - 1, length);
        tuple.setRoman(prefix + tupleToInverse.getRoman() + lastLetter);
        tuple.addToNumber(tupleToInverse.getNumber());
    }

}
