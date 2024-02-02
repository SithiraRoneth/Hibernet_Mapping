/* Created By Sithira Roneth
 * Date :2/2/24
 * Time :12:04
 * Project Name :Hibernet_Mapping
 * */
package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

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
    @ManyToMany
    private List<Student> student;
}
