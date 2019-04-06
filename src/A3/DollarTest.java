package A3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DollarTest {

    @Test
    public void testDollarDivision() {
        // Given
        Dollar ten = new Dollar(10);
        // When
        Dollar result = ten.dividedBy(2);

        // Then
        assertEquals(new Dollar(4), result); // You could change 5 to 4 to see the build failure
    }
    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
        // Given
        Dollar ten = new Dollar(10);
        // When
        ten.dividedBy(0);
    }
}
