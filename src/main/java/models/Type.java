package models;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtype")
    private Long id;
    @Column(name = "type")
    private String typeName;


}

