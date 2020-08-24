package no.pgr301.travisdemo.account;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class AccountTest {

    @Test
    void contextLoads() {

    }

    @Test
    void assertSomethingIsWrong() {
        assertFalse (1 == 2);
    }
