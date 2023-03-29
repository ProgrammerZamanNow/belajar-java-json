package programmerzamannow.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JavaBeanTest {

    @Test
    void createJsonFromObject() throws JsonProcessingException {
        Person person = new Person();
        person.setId("1");
        person.setName("Eko");
        person.setHobbies(List.of("Coding", "Reading"));

        Address address = new Address();
        address.setStreet("Jalan belum jadi");
        address.setCity("Jakarta");
        address.setCountry("Indonesia");
        person.setAddress(address);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);

        System.out.println(json);
    }
}
