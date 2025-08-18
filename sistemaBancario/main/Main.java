package sistemaBancario.main;

import sistemaBancario.ui.UserInterfaces;
import sistemaBancario.ui.LoopOption;
import sistemaBancario.domain.interfaces.StaticInterfaces;

public class Main {
    public static void main(String[] args) {

        StaticInterfaces.showProgramNameBanner();
        UserInterfaces.showHomeUI();

        LoopOption.loopOption();

        StaticInterfaces.showProgramEndBanner();
    }
}

//Criar conta ✅
//Tirar o loop da main ✅
//Verificador de cpf ✅
//Fazer login
//Sacar
//Depositar
//Consultar saldo

//Criar camadas: input → validação → criação

//Remover "setters" de AccountPersonalData e AccountBankData, exceto onde for realmente necessário
//      Criar uma classe intermediária¹ para validar os dados e repassar isso num construtor para ambas as classes
//
//Nao retornar arrays que podem ser modificados diretamente (getAccountBankData)
//      Modificar a lógica para impedir isso (copyOf de array)
//
//Trocar nome de RegisterNewAccount para algo como AccountInput ou AccountForm já que se trata de uma classe de leitura
//que pode redirecionar para a classe "¹".
//
//Adicionar verificação no accountCreationCompletion() para não ultrapassar o tamanho do array
//
//Adicionar limite de tentativas na criação aleatória do número da conta
//
//Tratar entrada de dados do usuário com validações mínimas
//
//Limpar código de testes como printData ou mover para uma classe de debug
//
//Pensar nos dados que devem ser imutáveis após a criação
//        Como, por exemplo, usar métodos para acessar o que pode ser mudado como atualizarEndereco() e sempre se perguntar :
//        “Isso deveria poder ser alterado a qualquer momento? Ou deveria exigir uma ação controlada?”