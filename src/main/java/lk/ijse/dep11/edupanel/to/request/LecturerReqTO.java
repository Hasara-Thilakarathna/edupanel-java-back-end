package lk.ijse.dep11.edupanel.to.request;

import lk.ijse.dep11.edupanel.validator.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerReqTO implements Serializable {
    @NotBlank(message = "Name can't be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid name")
    private String name;
    @NotBlank(message = "Designation can't be empty")
    @Length(min= 2, message = "Invalid designation")
    private String designation;
    @NotBlank(message = "Qualifications can't be empty" )
    @Length(min= 2, message = "Invalid qualifications")
    private String qualifications;
    @LecturerImage
    private MultipartFile picture;
    @Pattern(regexp = "^http[s]?://.+$", message = "Invalid linkedin url")
    private String linkedin;
    @NotBlank(message = "Type can't be empty")
    @Pattern(regexp = "^(full-time|part-time)$", flags = Pattern.Flag.CASE_INSENSITIVE,message = "Invalid type")
    private String type;
}
