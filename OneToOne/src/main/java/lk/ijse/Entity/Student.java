/* Created By Sithira Roneth
 * Date :2/2/24
 * Time :09:57
 * Project Name :Hibernet_Mapping
 * */
package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

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
    @OneToOne
    private Laptop laptop;
}
