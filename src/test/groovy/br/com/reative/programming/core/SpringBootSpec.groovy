package br.com.reative.programming.core

import br.com.reative.programming.Application
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = Application.class)
class SpringBootSpec extends Specification {
}
