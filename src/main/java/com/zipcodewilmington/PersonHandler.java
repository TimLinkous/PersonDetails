package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        int count = 0;// create a `counter`

        while (count < personArray.length) { // while `counter` is less than length of array
            // begin loop
            Person currentPerson = personArray[count];//use `counter` to identify the `current Person` in the array
            String stringRepresentaton = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentaton;// append `stringRepresentation` to `result` variable
            count++;//
        }
        // end loop
        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) { // use the above clauses to declare for-loop signature
            // begin loop
            Person currentPerson = personArray[i]; // use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;// append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }





    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person currentPerson : personArray) {// use the above discoveries to declare for-each-loop signature
            // begin loop
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
