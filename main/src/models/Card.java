package models;

import interfaces.CardInterface;
import interfaces.BasicInterface;

public class Card extends BasicData implements BasicInterface, CardInterface {

    public String[] CardData() {
        return new String[]{
                "name: " + this.getName(),
                "surname: " + this.getSurname(),
                "age: " + this.getAge(),
        };
    }

    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}


