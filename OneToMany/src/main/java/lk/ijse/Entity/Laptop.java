/* Created By Sithira Roneth
 * Date :2/2/24
 * Time :10:56
 * Project Name :Hibernet_Mapping
 * */
package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Laptop {
    @Id
    private int id;
    private String model;
    @ManyToOne
    private Student student;
}
