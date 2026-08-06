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
        }else {
            contatos[tamanho] = contato;
            tamanho ++;
        }
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