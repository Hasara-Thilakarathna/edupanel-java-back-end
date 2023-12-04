package lk.ijse.dep11.edupanel.validator;

import lk.ijse.dep11.edupanel.to.request.LecturerImageConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LecturerImageConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LecturerImage {
    long maximumFileSize() default 500 * 1024;

    String message() default "Invalid image or file size exceeds more than {maximumFileSize}Kb";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};



}
