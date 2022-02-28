import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class tocheck{
    @Test
    String move() {
        System.out.println("Test-Case");
		return null;
    }
}
public class Assignment7q1 {
    public static void main(String[] args) {
        tocheck a = new tocheck();
        a.move();
    }
}