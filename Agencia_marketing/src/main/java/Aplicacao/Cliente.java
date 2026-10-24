package Aplicacao;


/**
 * Classe de domínio que representa um Cliente da agência de marketing.
 * 
 * --- REQUISITO: ENCAPSULAMENTO ---
 * Todos os atributos são "private", acessíveis apenas por getters.
 * Setters são fornecidos apenas onde a alteração pós-criação faz sentido
 * (ex: email pode mudar; documento/nome normalmente não mudam).
 */
public class Cliente {

    // --- Atributos privados (Encapsulamento) ---
    private String nome;
    private String documento;   // CPF ou CNPJ
    private String email;

    // --- Construtor completo (garante que todo Cliente nasce com dados válidos) ---
    public Cliente(String nome, String documento, String email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    // --- Getters (leitura dos dados encapsulados) ---

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    // --- Setter apenas para email (dado que pode ser atualizado) ---
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Representação textual do cliente para exibição no terminal.
     * Sobrescrita do método toString() herdado de Object.
     */
    @Override
    public String toString() {
        return "Cliente { "
                + "Nome: " + nome
                + ", Documento: " + documento
                + ", Email: " + email
                + " }";
    }
}
