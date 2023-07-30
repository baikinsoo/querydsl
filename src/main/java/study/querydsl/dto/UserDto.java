package study.querydsl.dto;

import lombok.Data;

@Data
public class UserDto {

    private String name;
    private int userage;

    public UserDto() {
    }

    public UserDto(String name, int userage) {
        this.name = name;
        this.userage = userage;
    }
}