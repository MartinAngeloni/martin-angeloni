package testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by martin on 29/6/2018.
 */
public class PersonTest {

    private Person person;

    @Before
    public void setUp(){
        person = new Person("Martin", "Angeloni", 27);
    }

    @Test
    public void verifyData() throws Exception {
        assertEquals("The name of this person is correct" ,"Martin", person.getName());
        assertEquals("The lastname of this person is correct", "Angeloni", person.getLastname());
        assertEquals("The age of this person is 27", 27, person.getAge());
        assertTrue("This person is an adult" ,person.getAge() > 17);
    }

}