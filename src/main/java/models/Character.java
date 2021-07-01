package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Character {
    @JsonProperty
    private int char_id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String birthday;
    @JsonProperty
    private ArrayList occupation;
    @JsonProperty
    private String img;
    @JsonProperty
    private String status;
    @JsonProperty
    private ArrayList appearance;
    @JsonProperty
    private String nickname;
    @JsonProperty
    private String portrayed;
    @JsonProperty
    private String category;
    @JsonProperty
    private  ArrayList better_call_saul_appearance;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Character name: " + name);
        stringBuilder.append("\n");
        stringBuilder.append("Portrayed: " + portrayed);
        stringBuilder.append("\n")   ;
        stringBuilder.append("------------------------------------------------------");
        return stringBuilder.toString();
    }
}
