package lk.ijse.dep11.edupanel.to.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerResTO implements Serializable {
    private int id;
    private String name;
    private String designation;
    private String qualifications;
    private String picture;
    private String linkedin;
     private String type;
}
