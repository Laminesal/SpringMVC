package sall.lamine.SpringBoot.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  /**L’annotation @Component permet de déclarer la classe BeanImpl auprès de Spring, comme étant un bean à avoir dans l’IoC container.*/
@Qualifier("myBean") /**L’annotation @Qualifier permet de donner un nom à ce bean, en l'occurrence “myBean” (si cette annotation n’est pas définie, le nom par défaut est le nom de la classe)*/
public class BeanImpl {

}
