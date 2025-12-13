package cssp.gob.sv.nexusplatformitinventory.shared;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.validation.BindingResult;

import java.beans.PropertyDescriptor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static  Map<String,Object> getValidation(BindingResult result){
        if(result.hasErrors()){
            Map<String,Object> validations = new HashMap<>();
            result.getFieldErrors()
                    .forEach(error-> validations.put(error.getField(),error.getDefaultMessage()));
            return validations;
        }else {
            return null;
        }
    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        return Arrays.stream(src.getPropertyDescriptors())
                .map(PropertyDescriptor::getName)
                .filter(name -> src.getPropertyValue(name) == null)
                .toArray(String[]::new);
    }
}
