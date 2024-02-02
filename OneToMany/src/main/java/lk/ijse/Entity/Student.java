/* Created By Sithira Roneth
 * Date :2/2/24
 * Time :10:56
 * Project Name :Hibernet_Mapping
 * */
package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Student {
    @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "student")
    private List<Laptop>laptop;
}
