public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
        this.tamanho = 0;

    }

    public void adicionar(Contato contato) {

        if (tamanho >= contatos.length){
            System.out.println("Vetor cheio");
            return;
        }

        for (int i = 0; i < tamanho; i++){
            if (contato.getNome().equals(contatos[i].getNome())) {
                System.out.println("O nome já está cadastrado!");
                return;
            }

            if (contato.getTelefone().equals(contatos[i].getTelefone())) {
                System.out.println("O telefone já está cadastrado!");
                return;
            }
        }

        contatos[tamanho] = contato;
        tamanho++;
    }

    public void remover(String nome) {

    }

    public Contato buscarPorNome(String nome) {
        return null;
    }

    public Contato buscarPorTelefone(String telefone) {
        return null;
    }

    public void atualizar(String nome, Contato novoContato) {

    }

    public void listar() {

    }

    public void inserirEmLote(Contato[] novosContatos) {

    }

    public void buscarPorPrefixo(String prefixo) {

    }

    public void cadastroRealizado() {

    }

}