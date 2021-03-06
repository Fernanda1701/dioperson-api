package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Fernanda";
    private static final String LAST_NAME = "Nascimento";
    private static final String CPF_NUMBER = "036.610.540-07";
    private static final long PERSON_ID = 1L;

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

}
