package com.Harri.InvoiceTrackerBE.models;

import lombok.Getter;
import lombok.*;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false, length = 20)
    private String price;
}
