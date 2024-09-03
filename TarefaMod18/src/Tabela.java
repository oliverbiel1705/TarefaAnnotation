import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface Tabela {
    String value();

}
