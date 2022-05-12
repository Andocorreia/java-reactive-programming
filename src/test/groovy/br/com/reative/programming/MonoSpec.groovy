package br.com.reative.programming


import br.com.reative.programming.core.SpringBootSpec
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import spock.lang.Unroll

@Service
@RequiredArgsConstructor
class MonoSpec extends SpringBootSpec {

    def setup() {}

    @Unroll
    def "Teste em branco na classe MonoSpec"() {
        given: "Valor 1"
        def teste1 = 1
        when: "Valor 2"
        def teste2 = 2
        then: "Então o rteste passa com sucesso"
        teste1 < teste2
    }
}
