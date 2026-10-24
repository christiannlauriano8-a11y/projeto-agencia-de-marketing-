package Aplicacao;




/**
 * Classe de domínio que representa uma Campanha de Marketing Digital.
 * 
 * --- REQUISITO: ENCAPSULAMENTO ---
 * Atributos privados com acesso controlado.
 * O "statusAtiva" só muda via método de negócio no GerenciadorAgencia,
 * mas o setter é exposto aqui para que o gerenciador possa manipulá-lo.
 */
public class Campanha {

    // --- Atributos privados (Encapsulamento) ---
    private String titulo;
    private double orcamento;
    private boolean statusAtiva;   // true = ativa, false = pausada
    private String plataforma;     // Ex: "Instagram", "Google Ads", "Facebook"
    private String documentoCliente; // Documento do cliente vinculado à campanha

    // --- Construtor completo ---
    public Campanha(String titulo, double orcamento, String plataforma, String documentoCliente) {
        this.titulo = titulo;
        this.orcamento = orcamento;
        this.statusAtiva = true;   // Toda campanha nasce ativa por padrão
        this.plataforma = plataforma;
        this.documentoCliente = documentoCliente;
    }

    // --- Getters ---

    public String getTitulo() {
        return titulo;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public boolean isStatusAtiva() {
        return statusAtiva;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    // --- Setters controlados (apenas os que fazem sentido alterar) ---

    /**
     * Permite alterar o status da campanha (ativar/pausar).
     * Chamado pela lógica de negócio no GerenciadorAgencia.
     */
    public void setStatusAtiva(boolean statusAtiva) {
        this.statusAtiva = statusAtiva;
    }

    /**
     * Permite adicionar saldo ao orçamento da campanha.
     * A validação de valor positivo é feita no GerenciadorAgencia.
     * 
     * @param valor Valor a ser adicionado ao orçamento.
     */
    public void adicionarOrcamento(double valor) {
        this.orcamento += valor;
    }

    /**
     * Retorna o status formatado como texto legível.
     * 
     * --- REQUISITO: ESTRUTURA CONDICIONAL (if/else) ---
     * Exemplo de uso de bloco condicional dentro da classe de domínio.
     */
    public String getStatusTexto() {
        if (statusAtiva) {
            return "Ativa";
        } else {
            return "Pausada";
        }
    }

    /**
     * Representação textual da campanha para exibição no terminal.
     */
    @Override
    public String toString() {
        return "Campanha { "
                + "Titulo: " + titulo
                + ", Orcamento: R$ " + String.format("%.2f", orcamento)
                + ", Status: " + getStatusTexto()
                + ", Plataforma: " + plataforma
                + " }";
    }
}
