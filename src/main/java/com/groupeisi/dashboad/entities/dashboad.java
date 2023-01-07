package com.groupeisi.dashboad.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class dashboad {
    private int Id;
    @NotNull(message = "l'email ne doit pas etre null")
    private String email;
    @NotNull(message = "le password ne doit pas etre null")
    private String Password;
}
