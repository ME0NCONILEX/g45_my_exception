package se.me0nly.domain;

public enum Gender {
    FEMALE,MALE;

    public String toString(){
        return this.name().toLowerCase();
    }
}
