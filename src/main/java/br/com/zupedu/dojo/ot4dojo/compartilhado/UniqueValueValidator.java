package br.com.zupedu.dojo.ot4dojo.compartilhado;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValueValidator implements ConstraintValidator<UniqueValue, Object> {

    private String domainAtribute;
    private Class<?> klass;


    @PersistenceContext
    private EntityManager manager;


    @Override
    public void initialize(UniqueValue constraintAnnotation) {
      //  domainAtribute =
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return false;
    }


}
