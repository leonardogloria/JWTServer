import jwtserver.Restaurante
import jwtserver.Usuario

class BootStrap {

    def init = { servletContext ->
        def restaurante = new Restaurante(nome: "Adelos",descricao: "Melhor Feijoada").save()
        def restaurente2 = new Restaurante(nome: "Rio Sabores",descricao: "Restaurente Barato").save()

        def usuario = new Usuario(email: 'lsilva@credilink.com.br',senha: '123456').save()
    }
    def destroy = {
    }
}
