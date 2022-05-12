package br.com.reative.programming


import br.com.reative.programming.core.SpringBootSpec
import lombok.RequiredArgsConstructor
import lombok.extern.log4j.Log4j2
import org.springframework.stereotype.Service
import spock.lang.Unroll

@Service
@RequiredArgsConstructor
class FluxSpec extends SpringBootSpec {
    def setup() {}

    @Unroll
    def "Teste em branco na classe FluxSpec"() {
        given: "Valor 1"
        def teste1 = 1
        when: "Valor 2"
        def teste2 = 2
        then: "Então o rteste passa com sucesso"
        teste1 < teste2
    }
}
