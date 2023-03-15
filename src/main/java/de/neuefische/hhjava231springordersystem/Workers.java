package de.neuefische.hhjava231springordersystem;

public record Workers(

        String name,
        int socialSecurity
) {


    public Workers(String name, int socialSecurity) {
        this.name = name;
        this.socialSecurity = socialSecurity;
    }
}
