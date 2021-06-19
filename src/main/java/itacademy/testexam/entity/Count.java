package itacademy.testexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "counts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Count {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer count;

    private LocalDateTime time = LocalDateTime.now();

    private Integer total;

    private String name;


}
